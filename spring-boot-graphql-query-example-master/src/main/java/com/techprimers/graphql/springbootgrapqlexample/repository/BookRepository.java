package com.techprimers.graphql.springbootgrapqlexample.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.techprimers.graphql.springbootgrapqlexample.model.Book;
@Repository
public interface BookRepository extends JpaRepository<Book, String> {
}
