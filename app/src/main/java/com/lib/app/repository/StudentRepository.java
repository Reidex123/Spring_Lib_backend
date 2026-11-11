package com.lib.app.repository;
import org.springframework.stereotype.Repository;
import java.util.Optional;
import com.lib.app.model.Student;

@Repository 
public interface StudentRepository extends UserRepository<Student>{

    Optional<Student> findByStudentNumber(String studentNumber);

    void deleteByStudentNumber(String studentNumber);

}
