package com.lib.app.repository;
import org.springframework.stereotype.Repository;

import com.lib.app.model.Student;

@Repository 
public interface StudentRepository extends UserRepository<Student>{

}
