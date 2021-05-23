package com.example.demo.add.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.example.demo.model.AddInformation;

@Repository
@Mapper
public interface AddInformationMapper {

    public int add(AddInformation addinfor);
}
