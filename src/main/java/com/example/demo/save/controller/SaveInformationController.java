package com.example.demo.save.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.model.AddInformation;
import com.example.demo.save.service.SaveInformationService;
@Controller
public class SaveInformationController {
    @Autowired
    SaveInformationService saveInformationService;

    @RequestMapping("/saveInformation")
    public String saveInformation(Model model, @ModelAttribute AddInformation addinfor) {
        int add = saveInformationService.add(addinfor);
        model.addAttribute("addinfor", addinfor);
        model.addAttribute("message", "数据保存成功");
        return "saveInformation";
    }
}
