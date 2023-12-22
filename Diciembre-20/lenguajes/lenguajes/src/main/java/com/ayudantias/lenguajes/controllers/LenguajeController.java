package com.ayudantias.lenguajes.controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.ayudantias.lenguajes.models.Lenguaje;
import com.ayudantias.lenguajes.services.LenguajeServices;

import jakarta.validation.Valid;
import lombok.AllArgsConstructor;

@Controller
@AllArgsConstructor
public class LenguajeController {
    private final LenguajeServices lenguajeService;

    @GetMapping("/lenguajes")
    public String index(@Valid @ModelAttribute("lenguaje") Lenguaje lenguaje,
            BindingResult result, Model model) {

        List<Lenguaje> lista_Lenguajes = lenguajeService.allLenguajes();
        model.addAttribute("lenguajes", lista_Lenguajes);
        return "index.jsp";
    }

    @PostMapping("/lenguajes")
    public String create(@Valid @ModelAttribute("lenguaje") Lenguaje lenguaje,
            BindingResult result) {

        if (result.hasErrors()) {
            return "index.jsp";
        } else {
            lenguajeService.createLenguaje(lenguaje);
        }
        return "redirect:/lenguajes";
    }

    @GetMapping("/lenguajes/{id}")
    public String show(@PathVariable("id") Long id,
            @Valid @ModelAttribute("lenguaje") Lenguaje lenguaje,
            BindingResult result, Model model) {
        Lenguaje lenguaje_actual = lenguajeService.findLenguaje(id);
        model.addAttribute("currentlenguaje", lenguaje_actual);
        return "lenguaje.jsp";
    }

    @PutMapping("/lenguajes/{id}")
    public String updateLenguaje(
            @Valid @ModelAttribute("lenguaje") Lenguaje lenguaje,
            BindingResult result) {
        if (result.hasErrors()) {
            return "lenguaje.jsp";
        } else {
            lenguajeService.updateLenguaje(lenguaje);
        }
        return "redirect:/lenguajes";
    }

    @GetMapping("/lenguajes/eliminar/{id}")
    public String destroy(@PathVariable("id") Long id) {
        lenguajeService.deleteLenguaje(id);
        return "redirect:/lenguajes";
    }
}
