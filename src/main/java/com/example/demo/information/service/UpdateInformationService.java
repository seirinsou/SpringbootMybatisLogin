package com.example.demo.information.service;

import com.example.demo.information.model.UpdateInformationInDTO;
import com.example.demo.information.model.UpdateInformationOutDTO;

public interface UpdateInformationService {
    
    public UpdateInformationOutDTO findAllByIdx(Integer idx);
    
    public int update(UpdateInformationInDTO updateInforIn);
}
