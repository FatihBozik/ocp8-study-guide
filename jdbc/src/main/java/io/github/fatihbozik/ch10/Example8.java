package io.github.fatihbozik.ch10;

import org.postgresql.ds.PGSimpleDataSource;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Example8 {
    public static void main(String[] args) throws SQLException {
        final PGSimpleDataSource dataSource = new PGSimpleDataSource();
        dataSource.setDatabaseName("zoo");

        try (Connection connection = dataSource.getConnection();
             Statement statement = connection.createStatement()) {
            ResultSet resultSet = statement.executeQuery("select count(*) from animal");
            /*
             * - Always use an if statement or while loop when calling rs.next().
             * - Column indexes begin with 1.
             */
            if (resultSet.next()) {
                System.out.println(resultSet.getInt(1));
            }
        }
    }
}
