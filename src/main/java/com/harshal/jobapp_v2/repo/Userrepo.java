package com.harshal.jobapp_v2.repo;


import com.harshal.jobapp_v2.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Userrepo extends JpaRepository<User, Integer> {
    User findByUsername(String username);
}
