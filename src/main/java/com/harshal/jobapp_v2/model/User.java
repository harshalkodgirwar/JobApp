package com.harshal.jobapp_v2.model;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Table(name="users")
@Data
@Entity
public class User {
    private String username;
    private String password;
    @Id
    private int Id;
}
