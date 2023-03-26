package ceu.demo.practice.LibraryManagement.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ceu.demo.practice.LibraryManagement.entities.Book;
import ceu.demo.practice.LibraryManagement.repositories.BookRepository;

@RestController
@RequestMapping("/book")
public class BookController {

    @Autowired
    private BookRepository bookRepository;

    @GetMapping
    public List<Book> getAll() {
        List<Book> books = bookRepository.findAll();
        String author = books.get(0).getAuthor().getName();
        return books;
    }

}
