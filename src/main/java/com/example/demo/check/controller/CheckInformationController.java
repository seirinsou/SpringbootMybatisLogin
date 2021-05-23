package com.example.demo.check.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.check.service.CheckInformationService;
import com.example.demo.model.AddInformation;

@Controller
public class CheckInformationController {
    @Autowired
    CheckInformationService checkInformationService;
    
    @RequestMapping("/checkInformation")
    public String checkInformation(Model model, @ModelAttribute AddInformation addinfor) {
        model.addAttribute("addinfor", addinfor);
        return "checkInformation";
    }
}
