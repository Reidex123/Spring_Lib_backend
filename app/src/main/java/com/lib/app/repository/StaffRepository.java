package com.lib.app.repository;
import java.util.Optional;

import org.springframework.stereotype.Repository;

import com.lib.app.model.Staff;


@Repository 
public interface StaffRepository extends UserRepository<Staff>{

    Optional<Staff> findByEmployeeNumber(String employeeNumber);

    void deleteByEmployeeNumber(String employeeNumber);

}
