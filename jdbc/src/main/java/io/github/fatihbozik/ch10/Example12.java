package io.github.fatihbozik.ch10;

import java.sql.*;

public class Example12 {
    public static void main(String[] args) throws SQLException {
        String url = "jdbc:postgresql://localhost/zoo";
        Connection conn = DriverManager.getConnection(url);
        Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);

        ResultSet rs = stmt.executeQuery("select id from animal order by id");
        System.out.println(rs.absolute(2)); // true
        System.out.println(rs.getString("id")); // 2

        System.out.println(rs.absolute(0)); // false

        System.out.println(rs.absolute(5)); // true
        System.out.println(rs.getString("id")); // 5

        System.out.println(rs.absolute(-2)); // true
        System.out.println(rs.getString("id")); // 4

        System.out.println(rs.absolute(-6)); // false
    }
}
