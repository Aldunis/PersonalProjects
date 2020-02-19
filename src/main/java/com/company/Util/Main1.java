package com.company.Util;

import com.company.Model.Book;
import com.company.Service.ModelService;

public class Main1 {

    public static void main (String [] args) {
        ModelService modelService = new ModelService();

        Book book = new Book();
        book.setName("Book");
        book.setYear(2000);
        book.setPrice(200.0);
        book.setAuthor("Creanga");
        book.setType("Atlas");

modelService.insertBookInInventory(book);
    }
}
