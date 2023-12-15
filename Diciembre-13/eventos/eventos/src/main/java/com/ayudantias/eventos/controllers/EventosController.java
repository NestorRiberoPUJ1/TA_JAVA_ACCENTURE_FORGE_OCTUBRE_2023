package com.ayudantias.eventos.controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.ayudantias.eventos.models.Events;
import com.ayudantias.eventos.services.EventsServices;

import jakarta.servlet.http.HttpSession;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;

@Controller
@AllArgsConstructor
public class EventosController {

    private final EventsServices eventsServices;

    @GetMapping("/dashboard")
    public String dashboard(
            HttpSession session,
            Model model,
            @Valid @ModelAttribute("event") Events event,
            BindingResult result) {
        List<Events> eventos = eventsServices.buscarTodos();

        model.addAttribute("eventos", eventos);
        model.addAttribute("userId", session.getAttribute("userId"));
        return "event/dashboard.jsp";
    }

    @PostMapping("/events")
    public String create(
            @Valid @ModelAttribute("event") Events event,
            BindingResult result,
            @RequestParam(value = "date") String date) {

        if (result.hasErrors()) {
            return "event/dashboard.jsp";
        } else {
            eventsServices.createEvents(event);
            return "redirect:/dashboard";
        }
    }
}
