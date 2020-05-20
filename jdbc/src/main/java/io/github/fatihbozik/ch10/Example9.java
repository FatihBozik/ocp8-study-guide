package io.github.fatihbozik.ch10;

import java.sql.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Example9 {
    public static void main(String[] args) throws SQLException {
        String url = "jdbc:postgresql://localhost/zoo";
        Connection conn = DriverManager.getConnection(url);
        Statement stmt = conn.createStatement();

        ResultSet rs = stmt.executeQuery("select date_born from animal where name = 'Elsa'");
        if (rs.next()) {
            java.sql.Date sqlDate = rs.getDate(1);
            LocalDate localDate = sqlDate.toLocalDate();
            System.out.println(localDate); // 2001―05―06
        }

        ResultSet rs2 = stmt.executeQuery("select date_born from animal where name = 'Elsa'");
        if (rs2.next()) {
            java.sql.Time sqlTime = rs2.getTime(1);
            LocalTime localTime = sqlTime.toLocalTime();
            System.out.println(localTime); // 02:15
        }

        ResultSet rs3 = stmt.executeQuery("select date_born from animal where name = 'Elsa'");
        if (rs3.next()) {
            java.sql.Timestamp sqlTimeStamp = rs3.getTimestamp(1);
            LocalDateTime localDateTime = sqlTimeStamp.toLocalDateTime();
            System.out.println(localDateTime); // 2001―05―06T02:15
        }

        ResultSet rs4 = stmt.executeQuery("select id, name from species");
        while (rs4.next()) {
            Object idField = rs4.getObject("id");
            Object nameField = rs4.getObject("name");
            if (idField instanceof Integer) {
                int id = (Integer) idField;
                System.out.println(id);
            }
            if (nameField instanceof String) {
                String name = (String) nameField;
                System.out.println(name);
            }
        }
    }
}
