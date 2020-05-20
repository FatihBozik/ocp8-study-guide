package io.github.fatihbozik.ch10;

import java.sql.*;

public class Question3 {
    public static void main(String[] args) throws SQLException {
        String sql = "SELECT name FROM animal";
        try (final Connection connection = DriverManager.getConnection("jdbc:postgresql:zoo");
             final Statement statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
             final ResultSet resultSet = statement.executeQuery(sql)) {
            resultSet.next();
            resultSet.previous();
            resultSet.next();
            resultSet.next();
            resultSet.absolute(2);
            resultSet.relative(-100);
            resultSet.next();
            System.out.println(resultSet.getString(1));
        }
    }
}
