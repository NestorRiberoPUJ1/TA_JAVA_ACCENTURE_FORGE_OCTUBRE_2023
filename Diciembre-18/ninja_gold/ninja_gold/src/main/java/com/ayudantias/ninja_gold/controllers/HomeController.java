package com.ayudantias.ninja_gold.controllers;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.servlet.http.HttpSession;

@Controller
public class HomeController {

    @GetMapping("/")
    public String root(HttpSession session, Model model) {

        Integer gold = (Integer) session.getAttribute("gold");

        if (gold == null) {
            gold = 0;
            session.setAttribute("gold", gold);
        }

        model.addAttribute("gold", gold);
        return "index.jsp";
    }

    @PostMapping("/play")
    public String play(HttpSession session, @RequestParam(value = "type") String type) {
        // TODO: process POST request
        ArrayList<String> actividades = (ArrayList<String>) session.getAttribute("actividades");

        if (actividades == null) {
            actividades = new ArrayList<String>();
        }
        String newActividad = "You entered ";
        Double random = Math.random();
        switch (type) {
            case "farm":
                random = (random * 10) + 10;
                newActividad = newActividad.concat("farm ");
                break;
            case "cave":
                random = (random * 5) + 5;
                newActividad = newActividad.concat("cave ");
                break;
            case "house":
                random = (random * 3) + 2;
                newActividad = newActividad.concat("house ");
                break;
            case "casino":
                random = (random * 100) - 50;
                newActividad = newActividad.concat("casino ");
                break;
            default:
                break;
        }
        Integer gold = (Integer) session.getAttribute("gold");
        Integer newGold = (int) Math.round(random);
        if (newGold >= 0) {
            newActividad = newActividad.concat("and earned ");
        } else {
            {
                newActividad = newActividad.concat("and lost ");
            }
        }
        newActividad = newActividad.concat(Integer.toString(newGold));
        newActividad = newActividad.concat(" gold ");
        newActividad = newActividad.concat(new Date().toString());
        session.setAttribute("gold", newGold + gold);

        return "redirect:/";
    }

}
