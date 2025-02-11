package com.example.spring6webapp.repository;

import com.example.spring6webapp.domain.Book;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Mehrdad Ghaderi, S&M
 * Date: 2/11/2025
 * Time: 1:54 PM
 */
@Repository
public interface BookRepository extends CrudRepository<Book, Long> {
}
