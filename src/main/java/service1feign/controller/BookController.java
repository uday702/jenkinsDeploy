package service1feign.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import service1feign.model.Book;
import service1feign.service.BookService;

@RestController

public class BookController {

    @Autowired
    BookService service;

    @PostMapping("/post")
    public Book get_body(@RequestBody Book book) {
        return service.book_method(book);
    }
    @GetMapping("/get")
    public Book get_id() {
        return service.book_ids();
    }

}
