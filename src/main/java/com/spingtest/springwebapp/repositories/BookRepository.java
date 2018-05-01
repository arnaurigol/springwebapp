package com.spingtest.springwebapp.repositories;

import com.spingtest.springwebapp.model.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
}
