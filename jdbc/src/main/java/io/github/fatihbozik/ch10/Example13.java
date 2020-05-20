package io.github.fatihbozik.ch10;

import java.sql.*;

public class Example13 {
    public static void main(String[] args) throws SQLException {
        String url = "jdbc:postgresql://localhost/zoo";
        Connection conn = DriverManager.getConnection(url);
        Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);

        ResultSet rs = stmt.executeQuery("select id from animal order by id");
        System.out.println(rs.next()); // true
        System.out.println(rs.getString("id")); // 1

        System.out.println(rs.relative(2)); // true
        System.out.println(rs.getString("id")); // 3

        System.out.println(rs.relative(-1)); // true
        System.out.println(rs.getString("id")); // 2

        System.out.println(rs.relative(4)); // false
    }
}
