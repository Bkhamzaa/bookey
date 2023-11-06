package com.example.book.book.services;


import com.example.book.book.entity.Book;

import java.util.List;

public interface BookService {
Book createBook(Book book);
Book getBookById(Long bookId);

List<Book>getALLBooks();
Book updateBook(Book book);

void deleteBook(Long bookId);


}
