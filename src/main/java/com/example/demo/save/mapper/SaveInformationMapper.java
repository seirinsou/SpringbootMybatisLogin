package com.example.demo.save.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.example.demo.model.AddInformation;

@Repository
@Mapper
public interface SaveInformationMapper {

        public int add(AddInformation addinfor);

}
