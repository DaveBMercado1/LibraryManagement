package ceu.demo.practice.LibraryManagement.forms;

import ceu.demo.practice.LibraryManagement.entities.Book;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BookForm {

    private int id;

    private String title;

    private int authorId;

    public Book toEntity(Book book) {
        if (book == null) {
            book = new Book();
        }

        book.setTitle(title);
        book.setAuthorId(authorId);

        return book;
    }

}
