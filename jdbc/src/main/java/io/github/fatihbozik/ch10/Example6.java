package io.github.fatihbozik.ch10;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Example6 {
    public static void main(String[] args) throws SQLException {
        String url = "jdbc:postgresql://localhost/zoo";
        Connection conn = DriverManager.getConnection(url);
        Statement statement = conn.createStatement();
        int result = statement.executeUpdate("select * from animal");

        // Exception in thread "main" org.postgresql.util.PSQLException: A result was returned when none was expected.
    }
}
