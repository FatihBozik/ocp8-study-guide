package io.github.fatihbozik.ch10;

import java.sql.*;

public class Example15 {
    public static void main(String[] args) {
        String url = "jdbc:postgresql://localhost/zoo";
        try (Connection conn = DriverManager.getConnection(url);
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery("select not_a_column from animal")) {

            while (rs.next()) {
                System.out.println(rs.getString(1));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            System.out.println(e.getSQLState());
            System.out.println(e.getErrorCode());
        }
    }
}
