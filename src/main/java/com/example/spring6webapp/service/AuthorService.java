package com.example.spring6webapp.service;

import com.example.spring6webapp.domain.Author;
import org.springframework.stereotype.Service;

/**
 * Created by Mehrdad Ghaderi, S&M
 * Date: 2/15/2025
 * Time: 9:10 PM
 */
public interface AuthorService {
    Iterable<Author> findAll();
}
