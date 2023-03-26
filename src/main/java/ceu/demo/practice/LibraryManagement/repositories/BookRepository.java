package ceu.demo.practice.LibraryManagement.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ceu.demo.practice.LibraryManagement.entities.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Integer> {

}
