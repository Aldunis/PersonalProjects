package com.company.Model;

public class Book implements Comparable {
    private String name;
    private int year;
    private Double price;
    private String author;
    private String type;

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    void setNume(String nume) {
        this.name = "Harap-Alb";
    }

    private String getNume() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public int compareTo(Object obj) {
        Book b = (Book) obj;
        if(this.getPrice()- ((Book) obj).getPrice() <0) {
            return -1;
        }
        else if (this.getPrice() - ((Book) obj).getPrice() == 0)
            return 0;
        else return 1;

    }
}
