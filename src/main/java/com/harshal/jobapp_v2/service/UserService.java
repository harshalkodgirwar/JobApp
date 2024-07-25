package com.harshal.jobapp_v2.service;


import com.harshal.jobapp_v2.repo.Userrepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.harshal.jobapp_v2.model.User;
import com.harshal.jobapp_v2.repo.JobRepo;



@Service
public class UserService {

    @Autowired

    private Userrepo repo;
    private BCryptPasswordEncoder encoder=new BCryptPasswordEncoder(12);

    public User saveUser(User user) {

        return repo.save(user) ;

    }
}
