package com.example.demo.add.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller("AddInformationController")
public class AddInformationController {
    
    @RequestMapping("/addInformation")
    public String addInformation(Model model) {
        return "addInformation";
    }
}
