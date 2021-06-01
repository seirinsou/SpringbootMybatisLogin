package com.example.demo.information.service;

import com.example.demo.information.model.DeleteInformationOutDTO;

public interface DeleteInformationService {
    
    public DeleteInformationOutDTO findByIdx(Integer idx);
    
    public int delete(Integer idx);


}
