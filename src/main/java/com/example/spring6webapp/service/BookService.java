package com.example.spring6webapp.service;

import com.example.spring6webapp.domain.Book;

/**
 * Created by Mehrdad Ghaderi, S&M
 * Date: 2/15/2025
 * Time: 7:34 PM
 */
public interface BookService {

    Iterable<Book> findAll();
}
