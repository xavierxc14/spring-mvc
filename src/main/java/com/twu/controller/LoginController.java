package com.twu.controller;

import com.twu.model.User;
import com.twu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LoginController {

    private final UserService userService;

    @Autowired
    public LoginController(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping("login")
    public String showLogin(Model model) {
        model.addAttribute("user", new User());
        return "login";
    }

    @RequestMapping(value = "validateUser", method = RequestMethod.POST)
    public String validateUser(@ModelAttribute("user") User user, Model model) {
        userService.setUser(user);
        return "redirect:/home";
    }
}
