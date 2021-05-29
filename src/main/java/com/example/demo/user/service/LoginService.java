package com.example.demo.user.service;

import com.example.demo.user.model.UserLoginDTO;

public interface LoginService {
    
    public UserLoginDTO queryByUserName(String userName);

    }