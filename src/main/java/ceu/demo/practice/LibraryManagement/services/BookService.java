package ceu.demo.practice.LibraryManagement.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ceu.demo.practice.LibraryManagement.entities.Book;
import ceu.demo.practice.LibraryManagement.forms.BookForm;
import ceu.demo.practice.LibraryManagement.repositories.BookRepository;

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;

    public void save(BookForm bookForm) {
        Book book = bookRepository.findById(bookForm.getId()).get();
        book = bookForm.toEntity(book);

        bookRepository.save(book);
    }

}
