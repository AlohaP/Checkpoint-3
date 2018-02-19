package com.company.model;

public class Book {
    private int ISBN;
    private String author;
    private String title;
    private String publisher;
    private int publication_year;
    private int price;
    private String type;

    public Book(int ISBN, String author, String title, String publisher, int publication_year, int price, String type){
        this.ISBN = ISBN;
        this.author = author;
        this.title = title;
        this.publisher = publisher; 
        this.publication_year = publication_year;
        this.price = price;
        this.type = type;

    }

    public int getISBN(){
        return ISBN;
    }
     public void setISBN(int ISBN){
        this.ISBN = ISBN;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPublication_year() {
        return publication_year;
    }

    public void setPublication_year(int publication_year) {
        this.publication_year = publication_year;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
