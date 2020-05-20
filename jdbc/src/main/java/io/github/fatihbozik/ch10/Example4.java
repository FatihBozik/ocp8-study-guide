package io.github.fatihbozik.ch10;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Example4 {
    public static void main(String[] args) throws SQLException {
        String url = "jdbc:postgresql://localhost/zoo"; // default port used: 5432 for postgresql
        try (Connection connection = DriverManager.getConnection(url);
             Statement statement = connection.createStatement()) {
            int result = statement.executeUpdate("INSERT INTO species VALUES (10, 'Deer', 3)");
            System.out.println(result); // 1

            result = statement.executeUpdate("UPDATE species SET name = '' WHERE name = 'None'");
            System.out.println(result); // 0

            result = statement.executeUpdate("DELETE FROM species WHERE id = 10");
            System.out.println(result); // 1
        }
    }
}
