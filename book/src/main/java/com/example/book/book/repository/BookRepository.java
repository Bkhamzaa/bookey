package com.example.book.book.repository;

import com.example.book.book.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public  interface BookRepository extends JpaRepository<Book,Long > {



}
