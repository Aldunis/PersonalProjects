package com.company.Examples;

import com.company.Model.Book;

import java.util.*;
/*
Here I created a custom List that is able to store 3 books(keyboard input for name and price)
The List methods are: size,add and remove books.
Then I Instantiated an Iterator to iterate through each book and print the price from lowest to highest in lei
I sorted the List using Collections and then it prints the amount of the books stored.
Created by : @Catalin
 */
public class myList extends Book {
    public static void main(String[] args)  {
        Scanner keyboard = new Scanner(System.in);
        List<Book> myList = new ArrayList<>();
        for (int i = 0; i < 1; i++) {
            Book a = new Book();
            Book b = new Book();
            Book c = new Book();
            System.out.println("Introduceti numele primei carti:");
            a.setName(keyboard.next());
            System.out.println("Introduceti numele cartii a doua:");
            b.setName(keyboard.next());
            System.out.println("Introduceti numele cartii a treia:");
            c.setName(keyboard.next());
            System.out.println("Introduceti pretul primei carti");
            b.setPrice(keyboard.nextDouble());
            System.out.println("Introduceti pretul cartii a doua");
            a.setPrice(keyboard.nextDouble());
            System.out.println("Introduceti pretul cartii a treia");
            c.setPrice(keyboard.nextDouble());

            myList.add(a);
            myList.add(b);
            myList.add(c);
        }

        Iterator<Book> bookIterator = myList.iterator();
        while (bookIterator.hasNext()) {
            Book a = bookIterator.next();
            Book b = bookIterator.next();
            Book c = bookIterator.next();
            System.out.println(b.getName() + " " + "Pret:" + b.getPrice() + "lei");
            System.out.println(a.getName() + " " + "Pret:" + a.getPrice() + "lei");
            System.out.println(c.getName() + " " + "Pret:" + c.getPrice() + "lei");
        }
        Collections.sort(myList);
        System.out.println("Sortare dupa pret:");
        for (int i = 0; i < 3; i++) {
            System.out.println("Pret:" + myList.get(i).getPrice());
        }
        System.out.println("Totalul cartilor:" + myList.size());

    }
}
