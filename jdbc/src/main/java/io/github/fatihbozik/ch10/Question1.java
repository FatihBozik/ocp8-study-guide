package io.github.fatihbozik.ch10;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Question1 {
    public static void main(String[] args) throws SQLException {
        final Connection connection = DriverManager.getConnection("jdbc:postgresql:zoo");
        final Statement statement = connection.createStatement();
        final int result = statement.executeUpdate("UPDATE animal SET name = name");
        System.out.println(result);
    }
}
