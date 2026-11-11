/**
 * Define the services that can done for the user
 * Request to this layer get DTOs as response
 */

package com.lib.app.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lib.app.DTOs.STAFF.CreateStaffRequest;
import com.lib.app.DTOs.STAFF.StaffResponse;
import com.lib.app.DTOs.STUDENTS.RegisterStudentRequest;
import com.lib.app.DTOs.STUDENTS.StudentResponse;
import com.lib.app.exceptions.QueryException;
import com.lib.app.model.Staff;
import com.lib.app.model.Student;
import com.lib.app.repository.StaffRepository;
import com.lib.app.repository.StudentRepository;

import lombok.RequiredArgsConstructor;

@Service            
@RequiredArgsConstructor
@Transactional(readOnly=true)
public class UserDetailsService {

    private final StaffRepository staffRepository;
    private final StudentRepository studentRepository;

    /**
     * Retrieve a list of all Staff in the system
     * @param None
     * @return List<StaffResponse>
     */
    public List<StaffResponse> getAllStaff(){
        List<Staff> query = staffRepository.findAll();

        List<StaffResponse> response = new ArrayList<>();

        for (Staff staff: query){
            response.add(new StaffResponse(staff.getUserId(), staff.getFirstName(), 
                                            staff.getLastName(), staff.getEmail(), 
                                            staff.getPhone(), staff.getEmployeeNumber(), 
                                            staff.getRole(), staff.getHiredOn()));
        }

        return response;
    }

    /**
     * Retrieve a list of all students in the system
     * @param None
     * @return  List<StudentResponse>
     */
    public List<StudentResponse> getAllStudents(){
        List<Student> query = studentRepository.findAll();

        List<StudentResponse> response = new ArrayList<>();
        for (Student student: query){
            response.add(new StudentResponse(student.getUserId(), student.getFirstName(), 
                                            student.getLastName(), student.getEmail(), 
                                            student.getEmail(), student.getStudentNumber(), 
                                            student.getStatus(), student.getRegisteredOn()));
        }

        return response;
    }

    /**
     * Retrieve a staff member by their id
     * @param id
     * @return  StaffResponse
     */
    public StaffResponse getStaffById(Long id){
        Optional<Staff> query = staffRepository.findById(id);

        Staff response = query.orElseThrow(() -> new QueryException("Staff with id=" + id + " not found!"));

        return new StaffResponse(response.getUserId(), response.getFirstName(), 
                                response.getLastName(), response.getEmail(), 
                                response.getPhone(), response.getEmployeeNumber(), 
                                response.getRole(), response.getHiredOn());
    }

    /**
     * Retrieve a staff member by their id
     * @param employeeNumber
     * @return  StaffResponse
     */
    public StaffResponse getByEmployeeNumber(String employeeNumber){
        Optional<Staff> query = staffRepository.findByEmployeeNumber(employeeNumber);

        Staff response = query.orElseThrow(() -> new QueryException("Staff with employee_number=" + employeeNumber + " not found!"));
    
        return new StaffResponse(response.getUserId(), response.getFirstName(), 
                                response.getLastName(), response.getEmail(), 
                                response.getPhone(), response.getEmployeeNumber(), 
                                response.getRole(), response.getHiredOn());
    }

    /**
     * Retrive a student by their id
     * @param id
     * @return  StudentResponse
     */
    public StudentResponse getStudentById(Long id){
        Optional<Student> query = studentRepository.findById(id);

        Student response = query.orElseThrow(() -> new QueryException("Student with id=" + id + " not found!"));

        return new StudentResponse(response.getUserId(), response.getFirstName(), 
                                response.getLastName(), response.getEmail(), 
                                response.getPhone(), response.getStudentNumber(), 
                                response.getStatus(), response.getRegisteredOn());
    }

    /**
     * Retrive a student by their id
     * @param studentNumber
     * @return  StudentResponse
     */
    public StudentResponse getByStudentNumber(String studentNumber){
        Optional<Student> query = studentRepository.findByStudentNumber(studentNumber);

        Student response = query.orElseThrow(() -> new QueryException("Student with student_number=" + studentNumber + " not found!"));

        return new StudentResponse(response.getUserId(), response.getFirstName(), 
                                response.getLastName(), response.getEmail(), 
                                response.getPhone(), response.getStudentNumber(), 
                                response.getStatus(), response.getRegisteredOn());
    }

    /**
     * Create a new staff member or Update the details of an existing staff member
     * @param request
     * @return StaffResponse
     */
    public StaffResponse createStaff(CreateStaffRequest request){
        Staff newStaff = new Staff();

        newStaff.setFirstName(request.firstName());
        newStaff.setLastName(request.lastName());
        newStaff.setEmail(request.email());
        newStaff.setPhone(request.phone());
        newStaff.setEmployeeNumber(request.employeeNumber());
        newStaff.setRole(request.role());
        newStaff.setHiredOn(request.hiredOn());
        newStaff.setPasswordHash(request.initialPassword());

        Staff savedStaff = staffRepository.save(newStaff);

        return new StaffResponse(savedStaff.getUserId(), savedStaff.getFirstName(), 
                                savedStaff.getLastName(), savedStaff.getEmail(), 
                                savedStaff.getPhone(), savedStaff.getEmployeeNumber(), 
                                savedStaff.getRole(), savedStaff.getHiredOn());
    }

    /**
     * Register a new Student into the system
     * @param request
     * @return StudentResponse
     */
    public StudentResponse createStudent(RegisterStudentRequest request){
        Student newStudent = new Student();

        newStudent.setFirstName(request.firstName());
        newStudent.setLastName(request.lastName());
        newStudent.setEmail(request.email());
        newStudent.setPhone(request.phone());
        newStudent.setStudentNumber(request.studentNumber());
        newStudent.setPasswordHash(request.initialPassword());

        Student savedStudent = studentRepository.save(newStudent);

        return new StudentResponse(savedStudent.getUserId(), savedStudent.getFirstName(), 
                                    savedStudent.getLastName(), savedStudent.getEmail(), 
                                    savedStudent.getPhone(), savedStudent.getStudentNumber(), 
                                    savedStudent.getStatus(), savedStudent.getRegisteredOn());
    }

    public StaffResponse deleteStaffById(Long id){
        try {
            StaffResponse query = getStaffById(id);

            staffRepository.deleteById(id);

            return query;

        } catch (QueryException e) {
            throw new QueryException("Couldn't perform delete operation");
        }
    }

    public StaffResponse deleteByEmployeeNumber(String employeeNumber){
        try {
            StaffResponse query = getByEmployeeNumber(employeeNumber);

            staffRepository.deleteByEmployeeNumber(employeeNumber);

            return query;

        } catch (QueryException e) {
            throw new QueryException("Couldn't perform delete operation");
        }
    }

    public StudentResponse deleteStudentById(Long id){
        try{
            StudentResponse query = getStudentById(id);

            studentRepository.deleteById(id);

            return query;
            
        } catch (QueryException e) {
            throw new QueryException("Couldn't perform delete operation");
        }
    }

    public StudentResponse deleteByStudentNumber(String studentNumber){
        try{
            StudentResponse query = getByStudentNumber(studentNumber);

            studentRepository.deleteByStudentNumber(studentNumber);

            return query;

        } catch (QueryException e){
            throw new QueryException("Couldn't perform delete operation");
        }
    }
}
