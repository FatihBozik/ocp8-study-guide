package io.github.fatihbozik.ch10;

import java.sql.*;

public class Example11 {
    public static void main(String[] args) throws SQLException {
        String url = "jdbc:postgresql://localhost/zoo";
        Connection conn = DriverManager.getConnection(url);
        Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);

        ResultSet rs = stmt.executeQuery("select id from species where id = -99");
        System.out.println(rs.first()); // false
        System.out.println(rs.last()); // false
    }
}
