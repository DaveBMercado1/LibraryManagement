package ceu.demo.practice.LibraryManagement.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ceu.demo.practice.LibraryManagement.repositories.BookRepository;

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;

}
