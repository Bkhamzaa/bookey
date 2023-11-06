package com.example.book.book.services;

import com.example.book.book.entity.Book;
import com.example.book.book.repository.BookRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class BookServiceimpl implements BookService {

private BookRepository bookRepository;
    @Override
    public Book createBook(Book Book) {
        return bookRepository.save(Book);
    }

    @Override
    public Book getBookById(Long BookId) {
        Optional<Book> optionalBook =bookRepository.findById(BookId);
        return optionalBook.get();
    }

    @Override
    public List<Book> getALLBooks() {
        return bookRepository.findAll();
    }

    @Override
    public Book updateBook(Book book) {
        Book existingBook = bookRepository.findById(book.getId()).get();
        existingBook.setName(book.getName());
        existingBook.setAuthor(book.getAuthor());
        existingBook.setEmail(book.getEmail());
        Book updatedBook = bookRepository.save(existingBook);

        return updatedBook;

    }

    @Override
    public void deleteBook(Long bookId) {
        bookRepository.deleteById(bookId);

    }
}
