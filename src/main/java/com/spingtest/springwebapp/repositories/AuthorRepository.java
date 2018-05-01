package com.spingtest.springwebapp.repositories;

import com.spingtest.springwebapp.model.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
