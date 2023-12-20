package com.ayudantias.actualizar_y_eliminar.controllers;

import java.util.List;
import org.springframework.web.bind.annotation.*;
import com.ayudantias.actualizar_y_eliminar.models.Book;
import com.ayudantias.actualizar_y_eliminar.services.BookService;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
public class BookController {
    private final BookService bookService;

    @GetMapping("/api/books")
    public List<Book> index() {
        return bookService.allBooks();
    }

    @PostMapping("/api/books")
    public Book create(@RequestParam(value = "title") String title, @RequestParam(value = "description") String desc,
            @RequestParam(value = "language") String lang, @RequestParam(value = "pages") Integer numOfPages) {
        Book book = new Book(title, desc, lang, numOfPages);
        return bookService.createBook(book);
    }

    @GetMapping("/api/books/{id}")
    public Book show(@PathVariable("id") Long id) {
        Book book = bookService.findBook(id);
        return book;
    }

    @PutMapping("/api/books/{id}")
    public String updateBook(
            @PathVariable Long id,
            @RequestParam(value = "title", required = false) String title,
            @RequestParam(value = "description", required = false) String description,
            @RequestParam(value = "language", required = false) String language,
            @RequestParam(value = "pages", required = false) Integer pages) {
            Book book = new Book();
        book.setId(id);
        book.setDescription(description);
        book.setLanguage(language);
        book.setNumberOfPages(pages);
        bookService.updateBook(book);
        return "entity";
    }

    @DeleteMapping("/api/books/{id}")
    public void destroy(@PathVariable("id") Long id) {
        bookService.deleteBook(id);
    }

}
