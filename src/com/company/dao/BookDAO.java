package com.company.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import com.company.model.Book;

public class BookDAO {

    private DatabaseConnection database = DatabaseConnection.getInstance();
    private Connection connection = null;

    public int updateBook(Book book) throws SQLException {

        PreparedStatement preparedInsert = connection.prepareStatement(
                "UPDATE Books SET ISBN=?, author=?, title=?, publisher=?, publication_year=?, price=?, 'type'=? WHERE ISBN=?");
        preparedInsert.setInt(1, book.getISBN());
        preparedInsert.setString(2, book.getAuthor());
        preparedInsert.setString(3, book.getPublisher());
        preparedInsert.setInt(4, book.getPublication_year());
        preparedInsert.setInt(5, book.getPrice());
        preparedInsert.setString(6, book.getType());
        preparedInsert.setInt(7, book.getISBN()); //checkit
        return preparedInsert.executeUpdate();
    }
}
