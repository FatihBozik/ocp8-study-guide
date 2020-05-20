package io.github.fatihbozik.ch10;

import org.postgresql.ds.PGSimpleDataSource;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Example2 {
    public static void main(String[] args) throws SQLException {
        final PGSimpleDataSource dataSource = new PGSimpleDataSource();
        dataSource.setDatabaseName("zoo");

        try (Connection connection = dataSource.getConnection();
             // Statement statement = connection.createStatement(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_READ_ONLY);
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery("SELECT name FROM animal")) {

            while (resultSet.next()) {
                System.out.println(resultSet.getString(1));
            }
        }
    }
}
