package com.adrijanProjects.springBootLibrary.controller;

import com.adrijanProjects.springBootLibrary.entity.Book;
import com.adrijanProjects.springBootLibrary.service.BookService;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/books")
public class BookController {

    private BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @ResponseStatus(HttpStatus.OK)
    @GetMapping
    public Page<Book> getAllBooks(@RequestParam(defaultValue = "0") int pageNo,
                                  @RequestParam(defaultValue = "5") int pageSize) {
        return bookService.getAllBooks(pageNo, pageSize);
    }



}
