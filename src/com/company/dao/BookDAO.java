package com.company.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import com.company.model.Book;

public class BookDAO implements BookDaoInterface{

    private DatabaseConnection database = DatabaseConnection.getInstance();
    private Connection connection = null;

    public BookDAO(){
        connection = database.getConnection();
    }

    public int insertBook(Book book) throws SQLException {

        PreparedStatement preparedInsert = connection.prepareStatement(
                "INSERT INTO Books (ISBN, author, title, publisher, publication_year, price, type)" +
                        " VALUES (?,?,?,?,?,?,?)");
        preparedInsert.setInt(1, book.getISBN());
        preparedInsert.setInt(2, book.getAuthor());
        preparedInsert.setString(3, book.getTitle());
        preparedInsert.setString(4, book.getPublisher());
        preparedInsert.setInt(5, book.getPublication_year());
        preparedInsert.setInt(6, book.getPrice());
        preparedInsert.setInt(7, book.getType());
        return preparedInsert.executeUpdate();
    }

    public int deleteBook(Book book) throws SQLException {

        PreparedStatement preparedInsert = connection.prepareStatement(
                "DELETE FROM Books WHERE title = ?;");
        preparedInsert.setString(1, book.getTitle());
        return preparedInsert.executeUpdate();

    }

    public ArrayList<Book> getAllBooks() throws SQLException {
        ArrayList<Book> books = new ArrayList<>();
        PreparedStatement ps = connection.prepareStatement(
                "SELECT * FROM Books ORDER BY title ASC;");
        ResultSet rs = ps.executeQuery();
        while ( rs.next() ) {
            books.add(getBooksFromResultSet(rs));
        }
        return books;
    }

    private Book getBooksFromResultSet(ResultSet rs) throws SQLException {
        int ISBN = rs.getInt("ISBN");
        int author  = rs.getInt("author");
        String title = rs.getString("title");
        String publisher = rs.getString("publisher");
        int publication_year = rs.getInt("publication_year");
        int price  = rs.getInt("price");
        int type =  rs.getInt("type");
        return new Book(ISBN, author, title, publisher, publication_year, price, type);
    }

    public int updateBook(Book book) throws SQLException {

        PreparedStatement preparedInsert = connection.prepareStatement(
                "UPDATE Books SET ISBN=?, author=?, title=?, publisher=?, publication_year=?, price=?, 'type'=? WHERE ISBN=?");
            preparedInsert.setInt(1, book.getISBN());
            preparedInsert.setInt(2, book.getAuthor());
            preparedInsert.setString(3, book.getTitle());
            preparedInsert.setString(4, book.getPublisher());
            preparedInsert.setInt(5, book.getPublication_year());
            preparedInsert.setInt(6, book.getPrice());
            preparedInsert.setInt(7, book.getType());
            preparedInsert.setInt(8, book.getISBN()); //ToDO change to custom_id
        return preparedInsert.executeUpdate();
    }
}
