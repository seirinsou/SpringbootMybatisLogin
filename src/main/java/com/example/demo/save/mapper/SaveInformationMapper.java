package com.example.demo.save.mapper;

import org.springframework.stereotype.Repository;

import com.example.demo.save.model.AddInformation;

@Repository
public interface SaveInformationMapper {

    public int add(AddInformation addinfor);

}
