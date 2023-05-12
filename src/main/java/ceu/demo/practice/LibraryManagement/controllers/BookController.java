package ceu.demo.practice.LibraryManagement.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import ceu.demo.practice.LibraryManagement.entities.Author;
import ceu.demo.practice.LibraryManagement.forms.BookForm;
import ceu.demo.practice.LibraryManagement.services.AuthorService;
import ceu.demo.practice.LibraryManagement.services.BookService;

@Controller
@RequestMapping("/book")
public class BookController {

    @Autowired
    private AuthorService authorService;

    @Autowired
    private BookService bookService;

    @GetMapping("register")
    public String index(Model model) {
        BookForm bookForm = new BookForm();
        List<Author> authors = authorService.getAll();

        model.addAttribute("bookForm", bookForm);
        model.addAttribute("authors", authors);
        return "/views/book/edit";
    }

    @PostMapping("/save")
    public String save(@RequestAttribute BookForm bookForm) {
        bookService.save(bookForm);
        return String.format("redirect:/%s/", "book");
    }

}
