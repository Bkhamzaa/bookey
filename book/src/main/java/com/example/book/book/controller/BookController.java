package com.example.book.book.controller;

import com.example.book.book.entity.Book;
import com.example.book.book.services.BookService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("api/books")
public class BookController {

    private BookService BookService;

@PostMapping
public ResponseEntity<Book> createBook (@RequestBody Book book){
    Book savedBook = BookService.createBook(book);
    return new ResponseEntity<>(savedBook, HttpStatus.CREATED);


}

@GetMapping("{id}")
    public ResponseEntity<Book> getBookById (@PathVariable("id") Long bookId){
        Book book = BookService.getBookById(bookId);
        return new ResponseEntity<>(book,HttpStatus.OK);
}
@GetMapping
    public ResponseEntity<List<Book>> getAllBooks() {
    List<Book> books = BookService.getALLBooks();
    return new ResponseEntity<>(books,HttpStatus.OK);

     }

@PutMapping ("{id}")
    public ResponseEntity<Book> updateBook(@PathVariable("id") Long bookId ,
                                           @RequestBody Book book)
    {
    book.setId(bookId);
    Book updatedBook= BookService.updateBook(book);
    return new ResponseEntity<>(updatedBook,HttpStatus.OK);

    }

    @DeleteMapping("{id}")
    public ResponseEntity<String> deleteBook(@PathVariable("id") Long bookId){
        BookService.deleteBook(bookId);
        return  new ResponseEntity<>( "Book successfully deleted!",HttpStatus.OK);

    }









}
