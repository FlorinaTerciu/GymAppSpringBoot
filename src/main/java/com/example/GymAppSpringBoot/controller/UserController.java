package com.example.GymAppSpringBoot.controller;

import com.example.GymAppSpringBoot.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
public class UserController {

    @GetMapping(value = "/users")
   public String listUsers(Model model){
        UserMaker userMaker = new UserMaker(10);
        model.addAttribute("userList", userMaker.getAllUsers());

    return "users";
    }
}
