package com.company.Examples;

import com.company.Model.Atlas;
import com.company.Model.Book;
import com.company.Model.Revista;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Book> lista = new ArrayList<Book>(); //we instantiate a new array list
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
                    }
                    break;
                    case "revista": {
                        Revista revista = new Revista(name,price,author,type);
                        revista.setName(content[0]);
                        revista.setPrice(Double.valueOf(content[1]));
                        revista.setAuthor(content[2]);
                        revista.setType(content[3]);
                        lista.add(revista);
                    }
                    break;
                    default:
                        System.out.println("Nu exista tipul specificat");
                }

            }
            lista.forEach(System.out::println);
        } catch (FileNotFoundException ex) {
            System.out.println("Fisierul nu s-a gasit");
            ex.printStackTrace();
        }
    }
}
