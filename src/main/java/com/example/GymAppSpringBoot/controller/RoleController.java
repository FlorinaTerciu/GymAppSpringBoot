package com.example.GymAppSpringBoot.controller;

import com.example.GymAppSpringBoot.model.Role;
import com.example.GymAppSpringBoot.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class RoleController {

    @GetMapping(value = "/roles")

    public String listUsers(Model model){
        Role r1 = new Role(1, "Admin");
        Role r2 = new Role(2, "Trainer");
        Role r3 = new Role(3, "Client");

       List<Role> roleList = List.of(r1,r2,r3);
       model.addAttribute("roleList", roleList);

       return "roles";
    }

}
