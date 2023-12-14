package com.ayudantias.eventos.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EventosController {

    @GetMapping("/dashboard")
    public String dashboard() {

        return "event/dashboard.jsp";
    }
}
