package com.company.view;

import java.util.Scanner;
import com.company.model.Book;

public class View {

    public View(){

    }

    public void printMenu(){

        System.out.println("(1) Add new book.\n"
                + "(2) Edit book data.\n"
                + "(3) Delete book.\n"
                + "(4) Search for book by parameter.\n"
                + "(5) Display all books.\n"
                + "(6) Search for book by author.\n"
                + "(0) exit");
    }

    public String getInput(String msg){

        System.out.println(msg);
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        return input;
    }

    public void customPrint(String msg){
        System.out.println(msg);
    }

    public Book getBookInput(){

        String ISBN = getInput("Enter ISBN: ");
        String author  = getInput("Enter author name: ");
        String title = getInput( "Enter book title: ");
        String publisher = getInput( "Enter publisher name: ");
        String publication_year = getInput( "Enter publication year: ");
        String price = getInput("Enter price amount: ");
        String type = getInput("Enter typeof book: ");

        return new Book( Integer.parseInt(ISBN), Integer.parseInt(author), title, publisher,
                         Integer.parseInt(publication_year), Integer.parseInt(price), Integer.parseInt(type));
    }
    
}
