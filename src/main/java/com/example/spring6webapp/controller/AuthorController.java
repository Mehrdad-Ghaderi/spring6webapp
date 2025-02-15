package com.example.spring6webapp.controller;

import com.example.spring6webapp.service.AuthorService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Mehrdad Ghaderi, S&M
 * Date: 2/15/2025
 * Time: 9:16 PM
 */
@Controller
public class AuthorController {

    private final AuthorService authorService;

    public AuthorController(AuthorService authorService) {
        this.authorService = authorService;
    }

    @RequestMapping("/authors")
    public String getAuthors(Model model) {

        model.addAttribute("authors", authorService.findAll());
        return "authors";
    }

}
