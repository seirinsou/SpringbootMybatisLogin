package com.example.demo.mapper;

import java.util.List;
import org.springframework.stereotype.Repository;

import com.example.demo.model.AddInformation;
import com.example.demo.model.User;

@Repository
public interface UserMapper {
    public List<AddInformation> queryAll();

    public AddInformation findById(String name);

    public int add(User user);

    public int add1(AddInformation addinfor);

    public User queryByUserName(String userName);

    public void delete(AddInformation addInformation);

}