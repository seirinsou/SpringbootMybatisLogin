package com.example.demo.home.service;

import com.example.demo.home.model.AddInformation;
import com.example.demo.home.model.User;
import java.util.List;

public interface LoginService {
    public User queryByUserName(String userName);
    
    public List<AddInformation> findAllByName(String name);
    
    public int update(AddInformation addInformation);
    
    public int delete(String name);

    }