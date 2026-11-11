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
import com.lib.app.repository.StaffRepository;
import com.lib.app.repository.StudentRepository;

import lombok.RequiredArgsConstructor;

@Service            
@RequiredArgsConstructor
@Transactional(readOnly=true)
public class UserDetailsService {

    private final StaffRepository staffRepository;
    private final StudentRepository studentRepository;

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

    public List<StudentResponse> getAllStudents(){
        return null;
    }
    
    public StaffResponse getStaffById(Long id){
        Optional<Staff> query = staffRepository.findById(id);

        Staff result = query.orElseThrow(() -> new QueryException("User with id=" + id + " not found"));

        return new StaffResponse(result.getUserId(), result.getFirstName(), 
                                result.getLastName(), result.getEmail(), 
                                result.getPhone(), result.getEmployeeNumber(), 
                                result.getRole(), result.getHiredOn());
    }

    public StudentResponse getStudentById(Long id){
        return null;
    }

    public StaffResponse createStaff(CreateStaffRequest request){
        return null;
    }

    public StudentResponse createStudent(RegisterStudentRequest request){
        return null;
    }
}
