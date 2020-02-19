package com.company.Model;

public class Revista extends Book {
    private String name;
    private String type;
    private String author;
    private Double price;

    public Revista(String name, Double price, String author, String type) {
        super();
    }

    @Override
    public String toString() {        //access the super class parameters
        return "Revista:" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price + "lei" +
                " " + super.toString();
    }

    @Override
    void setNume(String nume) {
        super.setNume(nume);
    }

    @Override
    public Double getPrice() {
        return price;
    }

    @Override
    public void setPrice(Double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthor() {
        return author;

    }
}
