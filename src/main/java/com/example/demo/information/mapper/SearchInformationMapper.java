package com.example.demo.information.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.information.model.SearchInformationOutDTO;

@Repository
public interface SearchInformationMapper {
    
    public List<SearchInformationOutDTO> findAllByName(String name);

}
