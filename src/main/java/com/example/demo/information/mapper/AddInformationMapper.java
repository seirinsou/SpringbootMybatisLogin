package com.example.demo.information.mapper;

import org.springframework.stereotype.Repository;

import com.example.demo.information.model.AddInformationInDTO;

@Repository
public interface AddInformationMapper {

        public int add(AddInformationInDTO addInforIn);

}
