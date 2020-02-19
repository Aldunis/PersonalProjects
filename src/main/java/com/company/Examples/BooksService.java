package com.company.Examples;

import com.company.Model.Atlas;
import com.company.Model.Book;
import com.company.Model.Revista;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BooksService {
    private final static Logger logger = LogManager.getLogger(BooksService.class);
    private List<Book> lista;

    public BooksService(){

        logger.log(Level.INFO, "in operatiunea de populare" , lista);

        lista = new ArrayList<>();
        try {
            File tema = new File("D:\\Curs\\carti.txt"); //locates the file we want to open
            Scanner sc = new Scanner(tema); //opens the file
            while (sc.hasNextLine()) {
                String line = sc.nextLine(); //checks if we have more than one line
                String[] content = (line).split(";"); // we use the simbol ";" to split the words
                String name = content[0];
                Double price = Double.valueOf(content[1]);
                String author = content[2];
                String type = content[3];
                switch (content[3]) {
                    case "atlas": {
                        Atlas atlas = new Atlas(name, price, author, type);
                        atlas.setName(content[0]);
                        atlas.setPrice(Double.valueOf(content[1]));
                        atlas.setAuthor(content[2]);
                        atlas.setType(content[3]);
                        lista.add(atlas);
                        logger.log(Level.INFO, "gasit Atlas");
                    }
                    break;
                    case "revista": {
                        Revista revista = new Revista(name, price, author, type);
                        revista.setName(content[0]);
                        revista.setPrice(Double.valueOf(content[1]));
                        revista.setAuthor(content[2]);
                        revista.setType(content[3]);
                        lista.add(revista);
                        logger.log(Level.INFO, "gasit Revista");
                    }
                    break;
                    default:
                        System.out.println("Nu exista tipul specificat");
                }
            }
            lista.forEach(System.out::println);
        } catch (FileNotFoundException ex) {
            logger.log(Level.ERROR, "Fisierul nu s-a gasit. Message:" + ex.getMessage());
            ex.printStackTrace();
        }
    }


    //CRUD

    //C create

    public void populationResource () {
        //load from file
    }
    public void addBook (Book book){
        lista.add(book);
    }
    //R read
    public Book getBookbyIndex ( int index){
        return lista.get(index);
    }
    public Book getBookbyName (String BookName){
        for (Book book : lista) {
            if (book.getName().equals(BookName)) {
                return book;
            }
        }
        return null;
    }
    //U Update

    public void updateBook (Book oldBook, Book updatedBook){
        Book foundBook = getBookbyName(oldBook.getName());
        //metoda1
        //  lista.set(lista.indexOf(foundBook), updatedBook);
        //metoda2
        //  foundBook.setAuthor(updatedBook.getAuthor());
        // foundBook.setPrice(updatedBook.getPrice());
    }
    public void deleteBook (Book book){
        lista.remove(getBookbyName(book.getName()));
    }
    public int getNrofBooks() {
        return lista.size();
    }
}
