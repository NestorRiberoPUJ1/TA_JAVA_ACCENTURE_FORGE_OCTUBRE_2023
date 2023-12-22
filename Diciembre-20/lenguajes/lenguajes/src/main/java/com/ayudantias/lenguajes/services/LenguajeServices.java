package com.ayudantias.lenguajes.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.ayudantias.lenguajes.models.Lenguaje;
import com.ayudantias.lenguajes.repositories.LenguajeRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class LenguajeServices {
    private final LenguajeRepository lenguajeRepository;

    // Devolviendo todos los libros.
    public List<Lenguaje> allLenguajes() {
        return lenguajeRepository.findAll();
    }

    // Creando un libro.
    public Lenguaje createLenguaje(Lenguaje b) {
        return lenguajeRepository.save(b);
    }

    // Creando un libro.
    public Lenguaje updateLenguaje(Lenguaje b) {
        return lenguajeRepository.save(b);
    }

    // Obteniendo la información de un libro
    public Lenguaje findLenguaje(Long id) {
        Optional<Lenguaje> optionalLenguaje = lenguajeRepository.findById(id);
        if (optionalLenguaje.isPresent()) {
            return optionalLenguaje.get();
        } else {
            return null;
        }
    }

    // Creando un libro.
    public void deleteLenguaje(Long id) {
        lenguajeRepository.deleteById(id);
    }

}
