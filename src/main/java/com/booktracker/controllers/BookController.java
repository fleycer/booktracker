package com.booktracker.controllers;

import com.booktracker.entitites.Book;
import com.booktracker.servecies.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class BookController {
    @Autowired
    private BookService bookService;

    @GetMapping("/books")
    public List<Book> showAllBooks(){
        List<Book> books = bookService.getAllBooks();
        return books;
    }

    @GetMapping("/books/{id}")
    public Book getBook(@PathVariable int id){
        Book book = bookService.getBook(id);
        return book;
    }

    @PostMapping("/books")
    public Book addNewBook(@RequestBody Book book){
        bookService.saveBook(book);
        return book;
    }


    @PutMapping("/books")
    public Book updateBook(@RequestBody Book book){
        bookService.saveBook(book);
        return book;
    }

    @DeleteMapping("books/{id}")
    public void deleteNewBook(@PathVariable int id){
        bookService.deleteBook(id);
    }

}
