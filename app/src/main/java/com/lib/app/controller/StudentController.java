package com.lib.app.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lib.app.DTOs.STUDENTS.RegisterStudentRequest;
import com.lib.app.DTOs.STUDENTS.StudentResponse;
import com.lib.app.service.UserDetailsService;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/student")
public class StudentController {

    private final UserDetailsService studentService;

     @GetMapping("/all")
    public List<StudentResponse> getAllStaff() {
        return studentService.getAllStudents();
    }

    @GetMapping("/{id}")
    public ResponseEntity<StudentResponse> getById(@PathVariable Long id){
        StudentResponse response = studentService.getStudentById(id);

        return ResponseEntity.status(HttpStatus.FOUND).body(response);
    }

    @GetMapping("/{studentNumber}")
    public ResponseEntity<StudentResponse> getByStudentNumber(@PathVariable String studentNumber){

        StudentResponse response = studentService.getByStudentNumber(studentNumber);

        return ResponseEntity.status(HttpStatus.FOUND).body(response);
    }
    
    @PostMapping
    public ResponseEntity<StudentResponse> createStudent(@Valid @RequestBody RegisterStudentRequest request){
        StudentResponse response = studentService.createStudent(request);

        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }

    @PostMapping("/register")
    public ResponseEntity<StudentResponse> register(@Valid @RequestBody RegisterStudentRequest request){
        return null;
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<StudentResponse> deleteById(@PathVariable Long id){
        StudentResponse response = studentService.deleteStudentById(id);

        return ResponseEntity.status(HttpStatus.OK).body(response);
    }

    @DeleteMapping("/delete/{studentNumber}")
    public ResponseEntity<StudentResponse> deleteByStudentNumber(@PathVariable String employeeNumber){
        StudentResponse response = studentService.deleteByStudentNumber(employeeNumber);
        
        return ResponseEntity.status(HttpStatus.OK).body(response);
    }
}
