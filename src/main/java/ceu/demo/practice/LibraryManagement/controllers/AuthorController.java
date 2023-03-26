package ceu.demo.practice.LibraryManagement.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ceu.demo.practice.LibraryManagement.entities.Author;
import ceu.demo.practice.LibraryManagement.forms.AuthorForm;
import ceu.demo.practice.LibraryManagement.services.AuthorService;

@RestController
@RequestMapping("/author")
public class AuthorController {

    @Autowired
    private AuthorService authorService;

    @GetMapping
    public List<Author> getAll() {
        return authorService.getAll();
    }

    @PostMapping("/save")
    public Author save(@RequestBody AuthorForm authorForm) {
        return authorService.save(authorForm);
    }

}
