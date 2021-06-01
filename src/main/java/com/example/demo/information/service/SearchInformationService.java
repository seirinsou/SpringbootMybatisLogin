package com.example.demo.information.service;

import java.util.List;

import com.example.demo.information.model.SearchInformationOutDTO;

public interface SearchInformationService {
    
    public List<SearchInformationOutDTO> findAllByName(String name);

}
