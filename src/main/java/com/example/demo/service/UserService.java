package com.example.demo.service;

import java.util.List;

import com.example.demo.model.AddInformation;
import com.example.demo.model.User;

public interface UserService {
    public List<AddInformation> queryAll();

    public AddInformation findById(String name);
    
    public void delete(String name);

    public int add(User user);

    public int add1(AddInformation addinfor);

    public User queryByUserName(String userName);

}
