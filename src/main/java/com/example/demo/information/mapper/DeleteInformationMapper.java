package com.example.demo.information.mapper;

import org.springframework.stereotype.Repository;

import com.example.demo.information.model.DeleteInformationOutDTO;

@Repository
public interface DeleteInformationMapper {

    public DeleteInformationOutDTO findByIdx(Integer idx);

    public int delete(Integer idx);

}
