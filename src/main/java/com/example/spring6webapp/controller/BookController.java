package com.example.spring6webapp.controller;

import com.example.spring6webapp.service.BookService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Mehrdad Ghaderi, S&M
 * Date: 2/15/2025
 * Time: 7:56 PM
 */
@Controller
public class BookController {
    private final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @RequestMapping("/books")
    public String getBooks(Model model) {

        model.addAttribute("books", bookService.findAll());
        return "books";
    }
}
