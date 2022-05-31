package com.sample.graphql.springbootgrapqlexample.repository;
//Sample project
import org.springframework.data.jpa.repository.JpaRepository;

import com.sample.graphql.springbootgrapqlexample.model.Book;

public interface BookRepository extends JpaRepository<Book, String> {
}
