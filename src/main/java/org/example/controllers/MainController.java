package org.example.controllers;

import org.example.models.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller

public class MainController {
    @GetMapping("/login")
    public String ShowLoginForm(Model model){
        model.addAttribute("user", new User());
        return "login";
    }
    @PostMapping("/greetings")
    public String ProcessLoginForm (@ModelAttribute User user, Model model)
    {
//        if(getLogin()=="login" && getPassword()=="password")
//        {
//            model.addAttribute("user", user);
//            return "greetings";
//        }
        model.addAttribute("user", user);
        return "greetings";
    }


}
