package com.example.demo.home.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import com.example.demo.model.User;

@Repository
@Mapper
public interface LoginMapper {

        public User queryByUserName(String userName);

}
