package com.example.demo.home.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.home.mapper.LoginMapper;
import com.example.demo.home.service.LoginService;
import com.example.demo.model.User;

@Service
public class LoginServiceImpl implements LoginService{

        @Autowired
        LoginMapper loginMapper;

        @Override
        public User queryByUserName(String userName) {
            return new User();
//            return loginMapper.queryByUserName(userName);
        }

}
