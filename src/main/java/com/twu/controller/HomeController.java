package com.twu.controller;

import com.twu.model.User;
import com.twu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    private final UserService userService;

    @Autowired
    public HomeController(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping("/")
    public String showIndex(Model model) {
        return "index";
    }

    @RequestMapping("/home")
    public String showHome(Model model) {
        User currentUser = userService.getUser();
        model.addAttribute("user", currentUser);
        return "home";
    }
}
