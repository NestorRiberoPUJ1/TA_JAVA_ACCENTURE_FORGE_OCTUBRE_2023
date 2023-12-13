package com.ayudantias.fecha.controllers;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String root(Model model) {

        return "index.jsp";
    }

    @GetMapping("/time")
    public String time(Model model) {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        String hora = now.format(formatter);
        model.addAttribute("hora", hora);
        return "time.jsp";
    }

    @GetMapping("/date")
    public String date(Model model) {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("E, MMM dd yyyy");
        String fecha = now.format(formatter);
        model.addAttribute("fecha", fecha);
        return "date.jsp";
    }

}
