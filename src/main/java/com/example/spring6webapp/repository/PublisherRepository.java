package com.example.spring6webapp.repository;

import com.example.spring6webapp.domain.Publisher;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Mehrdad Ghaderi, S&M
 * Date: 2/12/2025
 * Time: 5:54 PM
 */
@Repository
public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
