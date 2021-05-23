package com.example.demo.check.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.example.demo.model.AddInformation;

@Repository
@Mapper
public interface CheckInformationMapper {

        public int add(AddInformation addinfor);

}
