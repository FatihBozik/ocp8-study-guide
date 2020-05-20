package io.github.fatihbozik.ch10;

import java.sql.*;

public class Example5 {
    public static void main(String[] args) throws SQLException {
        String url = "jdbc:postgresql://localhost/zoo";
        try (Connection connection = DriverManager.getConnection(url);
             Statement statement = connection.createStatement()) {
            boolean isResultSet = statement.execute("SELECT * FROM species");
            if (isResultSet) {
                ResultSet resultSet = statement.getResultSet();
                System.out.println("ran a query");
            } else {
                int updateCount = statement.getUpdateCount();
                System.out.println("ran an update");
            }
        }
    }
}
