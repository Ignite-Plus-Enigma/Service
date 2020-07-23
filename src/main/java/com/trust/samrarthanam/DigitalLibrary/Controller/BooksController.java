package com.trust.samrarthanam.DigitalLibrary.Controller;

import com.trust.samrarthanam.DigitalLibrary.Model.Books;
import com.trust.samrarthanam.DigitalLibrary.Service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.List;
@RestController
public class BooksController {
    @Autowired
    private BookService bookService;

    @GetMapping("/books")
    public ResponseEntity<String> getBooks() {
        return ResponseEntity.ok().body((bookService.listBooks().toString()));
    }

    @GetMapping("/books/{id}")
    public ResponseEntity<String> getBookbyid(@PathVariable String id) {
        return ResponseEntity.ok().body((bookService.getById(id).toString()));
    }


    @GetMapping("/search={key}")
    public ResponseEntity<String> findBook(@PathVariable String key) {
        return ResponseEntity.ok().body(bookService.searchBooks(key).toString());
    }
}


