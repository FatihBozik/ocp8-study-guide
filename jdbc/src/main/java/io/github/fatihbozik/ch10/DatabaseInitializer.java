package io.github.fatihbozik.ch10;

import java.sql.*;

public class DatabaseInitializer {
    public static void main(String[] args) throws SQLException {
        try (Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/zoo");
             Statement statement = connection.createStatement()) {
            statement.executeUpdate("CREATE TABLE species (" +
                    "id INTEGER PRIMARY KEY, " +
                    "name VARCHAR (255), " +
                    "num_acres DECIMAL(4,1))");
            statement.executeUpdate("CREATE TABLE animal (" +
                    "id INTEGER PRIMARY KEY, " +
                    "species_id INTEGER REFERENCES species (id), " +
                    "name VARCHAR (255), " +
                    "date_born TIMESTAMP)");
            statement.executeUpdate("INSERT INTO species VALUES (1, 'African Elephant', 7.5)");
            statement.executeUpdate("INSERT INTO species VALUES (2, 'Zebra', 1.2)");
            statement.executeUpdate("INSERT INTO animal VALUES (1, 1, 'Elsa', '2001/05/06 02:15:00')");
            statement.executeUpdate("INSERT INTO animal VALUES (2, 2, 'Zelda', '2002/08/15 09:12:00')");
            statement.executeUpdate("INSERT INTO animal VALUES (3, 1, 'Ester', '2002/09/09 10:36:00')");
            statement.executeUpdate("INSERT INTO animal VALUES (4, 1, 'Eddie', '2010/06/08 01:24:00')");
            statement.executeUpdate("INSERT INTO animal VALUES (5, 2, 'Zoe', '2005/11/12 03:44:00')");

            ResultSet rs = statement.executeQuery("select count(*) from animal");
            rs.next();
            System.out.println(rs.getInt(1));
        }
    }
}


