package com.example.demo.home.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.home.mapper.LoginMapper;
import com.example.demo.home.model.AddInformation;
import com.example.demo.home.model.User;
import com.example.demo.home.service.LoginService;

@Service("LoginService")
public class LoginServiceImpl implements LoginService {

    @Autowired
    LoginMapper loginMapper;

    @Override
    public User queryByUserName(String userName) {
        return loginMapper.queryByUserName(userName);
    }
    @Override
    public List<AddInformation> findAllByName(String name) {
        return loginMapper.findAllByName(name);
    }
    @Override
    public int update(AddInformation addInformation) {
        return loginMapper.update(addInformation);
    }
    @Override
    public int delete(String name) {
        return loginMapper.delete(name);
    }

}