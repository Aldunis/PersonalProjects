package com.company.Model;

public class Atlas extends Book {
    private String name;
    private String type;
    private String author;
    private Double price;
    public Atlas(String name, Double price, String author, String type) {// defines the parameters to object Atlas
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public Double getPrice() {
        return price;
    }

    @Override
    public void setPrice(Double price) {
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }


    @Override
    public String toString() {   //access the super class parameters
        return "Atlas:" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price + "lei" +
                " " + super.toString();

    }
}
