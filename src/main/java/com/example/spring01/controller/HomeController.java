package com.example.spring01.controller;

import com.example.spring01.dto.UserDto;
import com.example.spring01.service.BoardService;
import com.example.spring01.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    private BoardService bService;
    private UserService uService;

    public HomeController(BoardService b, UserService u) {
        this.bService = b;
        this.uService  = u;
    }

    @RequestMapping("/")
    public String home(Model model) {
        return "home";
    }
    @RequestMapping("/signup")
    public String signup(Model model) {
        return "signup";
    }
    @PostMapping(value = "signup")
    public String signup(Model model, UserDto user) {
        model.addAttribute("check", 2);
        if (uService.join(user)) {
            model.addAttribute("msg", "Sign Up Successfull");
        } else {
            model.addAttribute("msg", "the same ID already exists");
        }
        return "signup";
    }

    @RequestMapping("/signin")
    public String signin(Model model) {
        return "signin";
    }
    @RequestMapping("/select")
    public String select(Model model) {
        return "select";
    }
    @RequestMapping("/write")
    public String write(Model model) {
        return "write";
    }
    @RequestMapping("/delete")
    public String delete(Model model) {
        return "delete";
    }
    @RequestMapping("/withdraw")
    public String withdraw(Model model) {
        return "withdraw";
    }




}
