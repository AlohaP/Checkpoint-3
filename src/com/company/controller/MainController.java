package com.company.controller;

import com.company.view.View;

public class MainController {
    private BookController bookController = new BookController();
    private View view = new View();

    public void start() {

        String option = "";

        while (!option.equals("0")) {

            view.printMenu();
            option = view.getInput("Enter option: ");

            switch (option) {
                case "1":
                    bookController.bookToAdd();
                    break;
                case "2":

                    break;
                case "3":
                    break;
                case "4":

                    break;
                case "5":

                    break;
                case "6":

                    break;


            }
        }
    }


}
