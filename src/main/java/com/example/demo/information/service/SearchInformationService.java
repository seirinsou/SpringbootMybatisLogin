package com.example.demo.information.service;

import com.example.demo.information.model.SearchInformationOutDTO;

public interface SearchInformationService {
    
    public SearchInformationOutDTO findAllByName(String name);

}
