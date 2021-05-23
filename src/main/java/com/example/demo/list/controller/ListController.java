package com.example.demo.list.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.list.service.ListService;
import com.example.demo.model.AddInformation;
@Controller
public class ListController {
    @Autowired
    ListService listService;
    
@RequestMapping("/list")
    public String displayList(Model model) {
        List<AddInformation> informationList = listService.queryAll();
        model.addAttribute("informationList", informationList);
        return "list";
    }
}