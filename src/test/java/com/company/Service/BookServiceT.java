package com.company.Service;

import com.company.Examples.BooksService;
import org.junit.jupiter.api.BeforeEach;

public class BookServiceT {
    private BooksService bookService;

    @BeforeEach
    public void initial(){
        bookService = new BooksService();
    }
}
