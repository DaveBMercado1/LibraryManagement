package ceu.demo.practice.LibraryManagement.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ceu.demo.practice.LibraryManagement.entities.Author;

@Repository
public interface AuthorRepository extends JpaRepository<Author, Integer> {

    public Author findByNameOrderByIdAsc(String name);

}
