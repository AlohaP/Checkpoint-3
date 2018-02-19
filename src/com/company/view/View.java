package com.company.view;

import java.util.Scanner;

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
    
}
