package io.github.fatihbozik.ch10;

import java.sql.*;

public class Question2 {
    public static void main(String[] args) throws SQLException {
        try (final Connection connection = DriverManager.getConnection("jdbc:postgresql:zoo");
             final Statement statement = connection.createStatement()) {
            final ResultSet resultSet = statement.executeQuery("SELECT COUNT(*) FROM species");
            final int num = statement.executeUpdate("UPDATE animal SET name = name");
            resultSet.next();
            System.out.println(resultSet.getInt(1));
        }
    }
}
