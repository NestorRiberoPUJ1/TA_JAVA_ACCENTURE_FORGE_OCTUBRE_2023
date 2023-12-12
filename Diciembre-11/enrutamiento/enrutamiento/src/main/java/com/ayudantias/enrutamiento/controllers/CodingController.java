package com.ayudantias.enrutamiento.controllers;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class CodingController {

    @GetMapping("/coding")
    public String coding() {
        return "¡Hola Coding Dojo!";
    }

    @GetMapping("/coding/python")
    public String codingPython() {
        return "¡Python/Django fue increíble!";
    }

    @GetMapping("/coding/java")
    public String codingJava() {
        return "¡Java/Spring es mejor!";
    }

}
