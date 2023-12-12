package com.ayudantias.enrutamiento.controllers;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
public class DojoController {

    @GetMapping("/{dojo}")
    public String getMethodName(@PathVariable("dojo") String dojo) {
        switch (dojo) {
            case "dojo":
                return "¡El Dojo es increíble!";

            case "burbank-dojo":
                return "El Dojo Burbank está localizado al sur de California";

            case "san-jose":
                return "El Dojo SJ es el cuartel general";

            default:
                return "No conozco el dojo " + dojo;

        }
    }

}
