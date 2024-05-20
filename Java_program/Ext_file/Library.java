import java.sql.*;

class Book {
    int id;
    String title;
    String author;

    Book(int id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
    }
}

public class Library {
    private static final String DB_URL = "jdbc:mysql://localhost:3306/library";
    private static final String DB_USER = "root";
    private static final String DB_PASSWORD = "mysql123";

    public static void main(String[] args) {
        try (Connection conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD)) {
            System.out.println("Connected to the library database!");

            addBook(conn, new Book(1, "The Great Gatsby", "F. Scott Fitzgerald"));

            for (Book book : getAllBooks(conn)) {
                System.out.println("Book ID: " + book.id + ", Title: " + book.title + ", Author: " + book.author);
            }

            updateBook(conn, new Book(1, "The Great Gatsby", "F. Scott Fitzgerald (Updated)"));

            deleteBook(conn, 1);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static void addBook(Connection conn, Book book) throws SQLException {
        String sql = "INSERT INTO books (id, title, author) VALUES (?, ?, ?)";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, book.id);
            stmt.setString(2, book.title);
            stmt.setString(3, book.author);
            stmt.executeUpdate();
            System.out.println("Book added: " + book.title);
        }
    }

    private static Book[] getAllBooks(Connection conn) throws SQLException {
        String sql = "SELECT * FROM books";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            ResultSet rs = stmt.executeQuery();
            Book[] books = new Book[10];
            int index = 0;
            while (rs.next()) {
                int id = rs.getInt("id");
                String title = rs.getString("title");
                String author = rs.getString("author");
                books[index++] = new Book(id, title, author);
            }
            return books;
        }
    }

    private static void updateBook(Connection conn, Book book) throws SQLException {
        String sql = "UPDATE books SET title = ?, author = ? WHERE id = ?";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, book.title);
            stmt.setString(2, book.author);
            stmt.setInt(3, book.id);
            stmt.executeUpdate();
            System.out.println("Book updated: " + book.title);
        }
    }

    private static void deleteBook(Connection conn, int id) throws SQLException {
        String sql = "DELETE FROM books WHERE id = ?";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, id);
            stmt.executeUpdate();
            System.out.println("Book deleted with ID: " + id);
        }
    }
}
