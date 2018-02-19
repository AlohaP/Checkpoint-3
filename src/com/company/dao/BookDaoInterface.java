package com.company.dao;

import com.company.model.Book;

import java.sql.SQLException;
import java.util.ArrayList;

public interface BookDaoInterface {
    int insertBook(Book book) throws SQLException;
    int deleteBook(Book book) throws SQLException;
    ArrayList<Book> getAllBooks() throws SQLException;
    int updateBook(Book book) throws SQLException;
}
