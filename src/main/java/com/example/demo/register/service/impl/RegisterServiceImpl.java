package com.example.demo.register.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.model.User;
import com.example.demo.register.mapper.RegisterMapper;
import com.example.demo.register.service.RegisterService;

@Service
public class RegisterServiceImpl implements RegisterService{

        @Autowired
        RegisterMapper registerMapper;
        
        @Override
        @Transactional
        public int add(User user) {
            return registerMapper.add(user);
        }

    }
