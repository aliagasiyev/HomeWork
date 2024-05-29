package JDBC_INTRO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class PostgersConfigration {
    public Connection getConnection() {
        try {
            return DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "Ali200aa");
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }

    }
}