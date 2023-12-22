package com.ayudantias.actualizar_y_eliminar.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.ayudantias.actualizar_y_eliminar.models.Book;
import com.ayudantias.actualizar_y_eliminar.services.BookService;

import lombok.AllArgsConstructor;

import org.springframework.web.bind.annotation.PathVariable;

@Controller
@AllArgsConstructor
public class BookMVCController {

    private final BookService bookService;

    @GetMapping("/books/{id}")
    public String viewBook(@PathVariable Long id, Model model) {
        Book book = bookService.findBook(id);
        model.addAttribute("book", book);
        return "book.jsp";
    }

}
