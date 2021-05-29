package com.example.demo.user.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.user.mapper.LoginMapper;
import com.example.demo.user.model.UserLoginDTO;
import com.example.demo.user.service.LoginService;

@Service("LoginService")
public class LoginServiceImpl implements LoginService {

    @Autowired
    LoginMapper loginMapper;

    @Override
    public UserLoginDTO queryByUserName(String userName) {
        return loginMapper.queryByUserName(userName);
    }

}