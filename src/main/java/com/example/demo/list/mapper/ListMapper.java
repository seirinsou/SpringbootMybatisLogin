package com.example.demo.list.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.example.demo.model.AddInformation;

@Repository
@Mapper
public interface ListMapper {
    
    public List<AddInformation> queryAll();
}
