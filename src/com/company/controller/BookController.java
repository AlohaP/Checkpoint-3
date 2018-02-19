package com.company.controller;

import com.company.dao.BookDAO;
import com.company.view.View;
import com.company.model.Book;

import java.sql.SQLException;

public class BookController {
    private BookDAO bookDao = new BookDAO();
    private View view = new View();

    void bookToAdd(){
        Book valuesToInsert = view.getBookInput();
        int result = 0;

        try {
            result = bookDao.insertBook(valuesToInsert);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        String status = result > 0 ? "Book added." : "Failed to add book.";
        view.customPrint(status);
    }
}
