package ceu.demo.practice.LibraryManagement.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ceu.demo.practice.LibraryManagement.entities.Author;
import ceu.demo.practice.LibraryManagement.forms.AuthorForm;
import ceu.demo.practice.LibraryManagement.repositories.AuthorRepository;
import ceu.demo.practice.LibraryManagement.specs.AuthorSpecification;

@Service
public class AuthorService {

    @Autowired
    private AuthorRepository authorRepository;

    public List<Author> getAll() {
        return authorRepository.findAll();
    }

    public Author getById(Integer id) {
        return authorRepository.findById(id).get();
    }

    public Author getByName(String name) {
        return authorRepository.findOne(AuthorSpecification.name(name)).get();
    }

    public Author save(AuthorForm authorForm) {
        Author author = new Author();
        author.setName(authorForm.getName());

        return authorRepository.save(author);
    }

    public Author save(Author author) {
        return authorRepository.save(author);
    }

    public void delete(Integer id) {
        authorRepository.delete(getById(id));
    }

}
