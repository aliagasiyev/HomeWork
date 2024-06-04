package JDBC_INTRO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class PostgressApp2 {
    public static void main(String[] args) {
        final Connection connection= new PostgersConfigration1().getConnection();
        final String sql1="select * from departments";

        try {
            Statement statement = connection.createStatement();
            statement.executeQuery(sql1);
            ResultSet rs = statement.executeQuery(sql1);

            while (rs.next()){
                int id=rs.getInt("jhbbj")
            }


        }catch (SQLException e){
            System.out.println("Error is hrer");
        }


    }
}
