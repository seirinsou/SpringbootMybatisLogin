package com.example.demo.add.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.add.service.AddInformationService;

@Controller
public class AddInformationController {
    @Autowired
    AddInformationService addInformationService;

    @RequestMapping("/addInformation")
    public String addInformation(Model model) {
        return "addInformation";
    }
}
