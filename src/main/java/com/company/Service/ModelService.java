package com.company.Service;


import com.company.DAO.ModelDAO;
import com.company.Model.Book;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

public class ModelService {
    private static Logger logger = LogManager.getLogger(ModelService.class);
    private ModelDAO modelDAO;
    private List<Book> booksCache = new ArrayList<>();


    public ModelService(){
        modelDAO = new ModelDAO();
    }


    public boolean insertBookInInventory(Book book){
        boolean success = true;
        booksCache.add(book);

        try {
            modelDAO.insertBook(book);
        } catch (Exception e) {
            logger.log(Level.ERROR , "there was an error calling insertBookInInventory");
            booksCache.remove(book);
            success =false;
        }
        return success;
    }

    public void insertBookBatchInInventory(List<Book> bookList){

        for(Book book : bookList)
        {
            this.insertBookInInventory(book);
        }
    }
}
