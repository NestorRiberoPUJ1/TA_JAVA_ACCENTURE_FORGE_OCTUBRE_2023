package com.ayudantias.actualizar_y_eliminar.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.ayudantias.actualizar_y_eliminar.models.Book;
import com.ayudantias.actualizar_y_eliminar.repositories.BookRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class BookService {
    private final BookRepository bookRepository;

    // Devolviendo todos los libros.
    public List<Book> allBooks() {
        return bookRepository.findAll();
    }

    // Creando un libro.
    public Book createBook(Book b) {
        return bookRepository.save(b);
    }

    // Creando un libro.
    public Book updateBook(Book b) {
        return bookRepository.save(b);
    }

    // Obteniendo la información de un libro
    public Book findBook(Long id) {
        Optional<Book> optionalBook = bookRepository.findById(id);
        if (optionalBook.isPresent()) {
            return optionalBook.get();
        } else {
            return null;
        }
    }

    // Creando un libro.
    public void deleteBook(Long id) {
        bookRepository.deleteById(id);
    }

}
