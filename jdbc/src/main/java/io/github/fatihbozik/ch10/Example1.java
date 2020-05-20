package io.github.fatihbozik.ch10;

import java.sql.*;

public class Example1 {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        String url = "jdbc:postgresql://localhost/zoo"; // default port used: 5432 for postgresql
        try (Connection connection = DriverManager.getConnection(url);
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery("SELECT name FROM animal")) {

            while (resultSet.next()) {
                System.out.println(resultSet.getString(1));
            }
        }
    }
}
