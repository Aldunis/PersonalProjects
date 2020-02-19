package com.company.Service;

import com.company.Model.Book;
import com.company.Examples.BooksService;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;

import static org.junit.jupiter.api.Assertions.*;

class BooksServiceTest {

    private BooksService booksService;

    @BeforeEach
    void setUp() throws FileNotFoundException {
        System.out.println("trying to run setup");
        booksService = new BooksService();
        assertEquals(5 , booksService.getNrofBooks() );
    }

    @AfterEach
    void tearDown() {
        System.out.println("trying to clean up");
    }

    @Test
    void addBook() {
        System.out.println("trying to addBook");
        Book book = new Book();
        book.setName("Harap-Alb");

        booksService.addBook(book);

        assertEquals(6, booksService.getNrofBooks() );

        assertEquals(6, booksService.getNrofBooks() );
    }

    @Test
    void getBookbyIndex() {
        System.out.println("trying to run getBookbyIndex");

        Book book = new Book();
        book.setName("Harap-Alb");
        book.setAuthor("Creanga");

        booksService.addBook(book);
    }

    @Test
    void getBookbyName() {
        System.out.println("trying to getBookbyName");
    }

    @Test
    void updateBook() {
        System.out.println("trying to updateBook");
    }

    @Test
    void deleteBook() {
        System.out.println("trying to deleteBook");
    }

    @Test
    void getNrofBooks() {
    }
}