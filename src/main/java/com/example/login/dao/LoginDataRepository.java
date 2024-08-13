package com.example.login.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.login.model.LoginData;

@Repository
public interface LoginDataRepository extends JpaRepository<LoginData,Long> {
    
}
