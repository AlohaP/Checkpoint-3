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

    void bookToUpdate(){
        Book valuesToUpdate = view.getBookInput();
        int result = 0;

        try {
            result = bookDao.updateBook(valuesToUpdate);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        String status = result > 0 ? "book updated." : "book didn't update.";
        view.customPrint(status);
    }

    void bookToDelete(){
        Book valuesToDelete = view.getBookDeleteTitle();
        int result = 0;

        try {
            result = bookDao.deleteBook(valuesToDelete);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        String status = result > 0 ? "Book deleted." : "Book deletion failed.";
        view.customPrint(status);
    }
}
