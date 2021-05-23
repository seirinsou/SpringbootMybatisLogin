package com.example.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.mapper.UserMapper;
import com.example.demo.model.AddInformation;
import com.example.demo.model.User;
import com.example.demo.service.UserService;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public List<AddInformation> queryAll() {
        return userMapper.queryAll();
    }
    
    @Override
    public AddInformation findById(String name) {
    return userMapper.findById(name);
    };
    
    @Override
    public void delete(String name) {
        AddInformation addInformation = findById(name);
        userMapper.delete(addInformation);
    }

    @Override
    @Transactional
    public int add(User user) {
        return userMapper.add(user);
    }

    @Override
    @Transactional
    public int add1(AddInformation addinfor) {
        return userMapper.add1(addinfor);
    }

    @Override
    public User queryByUserName(String userName) {
        return userMapper.queryByUserName(userName);
    }
}