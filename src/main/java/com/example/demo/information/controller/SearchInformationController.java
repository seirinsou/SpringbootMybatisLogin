package com.example.demo.information.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.example.demo.information.model.SearchInformationOutDTO;
import com.example.demo.information.service.SearchInformationService;

@Controller("SearchInformationController")
@SessionAttributes("userId")
public class SearchInformationController {
    
    @Autowired
    SearchInformationService searchInformationService;
    
    @RequestMapping("/search")
    public String displayList(Model model,
            @ModelAttribute SearchInformationOutDTO searchInforOut) {
        if((String) model.asMap().get("message")!=null) {
            model.addAttribute("message",(String) model.asMap().get("message"));
        }
        List<SearchInformationOutDTO> informationList = searchInformationService.findAllByName(searchInforOut.getName());
        model.addAttribute("informationList", informationList);
        model.addAttribute("userId",model.getAttribute("userId"));
        
        return "homepage";
    }

}
