package ceu.demo.practice.LibraryManagement.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ceu.demo.practice.LibraryManagement.entities.Author;
import ceu.demo.practice.LibraryManagement.forms.AuthorForm;
import ceu.demo.practice.LibraryManagement.repositories.AuthorRepository;

@Service
public class AuthorService {

    @Autowired
    private AuthorRepository authorRepository;

    public List<Author> getAll() {
        return authorRepository.findAll();
    }

    public Author save(AuthorForm authorForm) {
        Author author = new Author();
        author.setName(authorForm.getName());

        return authorRepository.save(author);
    }

}
