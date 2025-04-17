package com.example.demo;

import lombok.Data;

import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
@Data
public abstract class User {

    @Id
    private String userId;
    private String name;
    private String email;
    private String passwordHash;

    public abstract boolean login(String email, String password);
    public abstract void resetPassword(String newPassword);
}