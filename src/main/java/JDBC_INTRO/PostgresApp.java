package JDBC_INTRO;

import javax.xml.transform.Result;
import java.sql.*;

public class PostgresApp {
    public static void main(String[] args) {
        final Connection connection = new PostgersConfigration().getConnection();
        final String sql1 = "select * from books ;";
        try {
            Statement statement = connection.createStatement();
            statement.executeQuery(sql1);
            ResultSet resultSet = statement.executeQuery(sql1);

            while (resultSet.next()) {
                int book_id = resultSet.getInt("book_id");
                String book_title = resultSet.getString("book_title");
                System.out.println(book_id + " " +book_title );
            }

        } catch (SQLException e) {
            System.out.println("SQLException: " + e.getMessage());
        }


    }
}
