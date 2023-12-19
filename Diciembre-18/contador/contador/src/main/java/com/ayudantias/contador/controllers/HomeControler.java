package com.ayudantias.contador.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import jakarta.servlet.http.HttpSession;

@Controller
public class HomeControler {

    @GetMapping("/")
    public String root(HttpSession session) {
        Integer counter = (Integer) session.getAttribute("counter");
        System.out.println(counter);
        if (counter == null) {
            counter = 1;
            session.setAttribute("counter", 1);
        } else {
            session.setAttribute("counter", counter + 1);
        }
        return "index.jsp";
    }

    @GetMapping("/counter")
    public String counter(HttpSession session, Model model) {
        Integer counter = (Integer) session.getAttribute("counter");
        if (counter == null) {
            counter = 0;
            session.setAttribute("counter", 0);
        }
        model.addAttribute("counter", counter);
        return "counter.jsp";
    }

}
