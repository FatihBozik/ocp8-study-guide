package io.github.fatihbozik.ch5.multicatch;

import java.sql.SQLException;
import java.text.ParseException;

public class Example5 {
    public void read() throws SQLException, ParseException {
        try {
            readFromDatabase();
        } catch (Exception e) {
            throw e;
        }
    }

    private void readFromDatabase() throws SQLException, ParseException {
        throw new SQLException();
    }
}
