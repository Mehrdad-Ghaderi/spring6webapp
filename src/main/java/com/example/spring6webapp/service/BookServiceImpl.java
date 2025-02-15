package com.example.spring6webapp.service;

import com.example.spring6webapp.domain.Book;
import com.example.spring6webapp.repository.BookRepository;
import org.springframework.stereotype.Service;

/**
 * Created by Mehrdad Ghaderi, S&M
 * Date: 2/15/2025
 * Time: 7:36 PM
 */
@Service
public class BookServiceImpl implements BookService {

    private final BookRepository bookRepository;

    public BookServiceImpl(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public Iterable<Book> findAll() {
        return bookRepository.findAll();
    }
}
