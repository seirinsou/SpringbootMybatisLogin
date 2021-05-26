package com.example.demo.home.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.home.model.AddInformation;
import com.example.demo.home.model.User;

@Repository
public interface LoginMapper {

    public User queryByUserName(String userName);
    
    public List<AddInformation> findAllByName(String name);
    
    public int update(AddInformation addInformation);
    
    public int delete(String name);

}
