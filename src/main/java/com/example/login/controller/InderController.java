package com.example.login.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.login.dao.LoginDataRepository;
import com.example.login.model.LoginData;

@RestController
@RequestMapping("/user")
public class InderController {

    @Autowired
    LoginDataRepository loginDataRepo;

    @GetMapping("/data")
    public String demo(){
        return "Working";
    }

    @GetMapping("/getdata")
    public List<LoginData> getDatas(){
        return loginDataRepo.findAll();
    }

    @PostMapping("/getdata")
    public LoginData adddata(@RequestBody LoginData ld){
        return loginDataRepo.save(ld);
    } 
    
}
