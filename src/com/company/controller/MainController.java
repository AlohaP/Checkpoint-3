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
                    view.customPrint("Work in proggres");
                    break;
                case "3":
                    bookController.bookToDelete();
                    break;
                case "4":
                    view.customPrint("Work in proggres");
                    break;
                case "5":
                    bookController.showAllBooks();
                    break;
                case "6":
                    view.customPrint("Work in proggres");
                    break;
            }
        }
    }


}
