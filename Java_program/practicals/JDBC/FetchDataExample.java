import java.sql.*;

public class FetchDataExample {

    public static void main(String[] args) {
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;

        try {
            // Load the MySQL JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Create a connection to the database
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/my_new_database", "root", "mysql123");

            // Create a statement
            statement = connection.createStatement();

            // Execute a query to select data from the employees table
            resultSet = statement.executeQuery("SELECT * FROM employees");

            // Process the results
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                int age = resultSet.getInt("age");
                double salary = resultSet.getDouble("salary");

                // Display the retrieved data
                System.out.println("ID: " + id + ", Name: " + name + ", Age: " + age + ", Salary: " + salary);
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace(); // Handle the exception appropriately
        } catch (SQLException e) {
            e.printStackTrace(); // Handle the exception appropriately
        } finally {
            // Close the resultSet, statement, and connection in a finally block to ensure they are always closed
            try {
                if (resultSet != null) resultSet.close();
                if (statement != null) statement.close();
                if (connection != null) connection.close();
            } catch (SQLException e) {
                e.printStackTrace(); // Handle the exception appropriately
            }
        }
    }
}
