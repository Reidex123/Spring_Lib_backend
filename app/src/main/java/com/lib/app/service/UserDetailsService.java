package com.lib.app.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.lib.app.repository.UserRepository;
import com.lib.app.DTOs.STAFF.StaffResponse;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
@Transactional(readOnly=true)
public class UserDetailsService {

    private final UserRepository userRepository;
    
    public StaffResponse getById(Long id){
        
        return null;
    }
}
