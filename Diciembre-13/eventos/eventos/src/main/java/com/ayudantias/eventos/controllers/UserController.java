package com.ayudantias.eventos.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.ayudantias.eventos.models.User;
import com.ayudantias.eventos.services.UserServices;

import jakarta.validation.Valid;
import lombok.AllArgsConstructor;

@Controller
@AllArgsConstructor
public class UserController {

    private final UserServices userServices;

    @GetMapping("/")
    public String index(
            @Valid @ModelAttribute("user") User user,
            BindingResult result) {
        return "user/index.jsp";
    }

    @PostMapping("/user")
    public String create(
            @Valid @ModelAttribute("user") User user,
            BindingResult result) {
        if (result.hasErrors()) {
            return "user/index.jsp";
        } else {
            userServices.createUser(user);
            return "redirect:/dashboard";
        }
    }

}
