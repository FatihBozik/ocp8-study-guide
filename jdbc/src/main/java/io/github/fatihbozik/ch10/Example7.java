package io.github.fatihbozik.ch10;

import org.postgresql.ds.PGSimpleDataSource;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;

public class Example7 {
    public static void main(String[] args) throws SQLException {
        final PGSimpleDataSource dataSource = new PGSimpleDataSource();
        dataSource.setDatabaseName("zoo");

        try (Connection connection = dataSource.getConnection();
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery("select id, name from species")) {

            Map<Integer, String> idToNameMap = new HashMap<>();
            while (resultSet.next()) {
                // int id = rs.getInt(1);
                int id = resultSet.getInt("id");
                // String name = rs.getString(2);
                String name = resultSet.getString("name");
                idToNameMap.put(id, name);
            }
            System.out.println(idToNameMap); // {1=African Elephant, 2=Zebra}
        }
    }
}
