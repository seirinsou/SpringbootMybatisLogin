package com.example.demo.user.mapper;

import org.springframework.stereotype.Repository;
import com.example.demo.user.model.UserLoginDTO;

@Repository
public interface LoginMapper {

    public UserLoginDTO queryByUserName(String userName);

}
