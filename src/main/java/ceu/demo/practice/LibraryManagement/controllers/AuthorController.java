package ceu.demo.practice.LibraryManagement.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ceu.demo.practice.LibraryManagement.entities.Author;
import ceu.demo.practice.LibraryManagement.repositories.AuthorRepository;

@RestController
@RequestMapping("/author")
public class AuthorController {

    @Autowired
    private AuthorRepository authorRepository;

    @GetMapping
    public List<Author> getAll() {
        List<Author> authors = authorRepository.findAll();
        String title = authors.get(0).getBooks().get(0).getTitle();
        return authors;
    }

    @PostMapping
    public void save() {

    }

}
