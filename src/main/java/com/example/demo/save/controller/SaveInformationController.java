package com.example.demo.save.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.example.demo.save.model.AddInformation;
import com.example.demo.save.model.User;
import com.example.demo.save.service.SaveInformationService;

@Controller
public class SaveInformationController {
    @Autowired
    SaveInformationService saveInformationService;

    @RequestMapping("/saveInformation")
    public String saveInformation(Model model,
             RedirectAttributes attributes,
            @ModelAttribute User user, AddInformation addinfor) {
        int add = saveInformationService.add(addinfor);
//        attributes.addFlashAttribute("addinfor",addinfor);
//        attributes.addFlashAttribute("user",user);
        attributes.addFlashAttribute("message", "数据保存成功");
        return "redirect:/search";
    }
}
