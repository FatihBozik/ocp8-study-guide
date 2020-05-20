package io.github.fatihbozik.ch10;

import java.sql.*;

public class Example10 {
    public static void main(String[] args) throws SQLException {
        String url = "jdbc:postgresql://localhost/zoo";
        Connection conn = DriverManager.getConnection(url);
        Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);

        ResultSet rs = stmt.executeQuery("select id from species order by id");

        rs.afterLast();
        System.out.println(rs.previous()); // true
        System.out.println(rs.getInt(1)); // 2

        System.out.println(rs.previous()); // true
        System.out.println(rs.getInt(1)); // 1

        System.out.println(rs.last()); // true
        System.out.println(rs.getInt(1)); // 2

        System.out.println(rs.first()); // true
        System.out.println(rs.getInt(1)); // 1

        rs.beforeFirst();
        System.out.println(rs.getInt(1)); // throws SQLException
    }
}
