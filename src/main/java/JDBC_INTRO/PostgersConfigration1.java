package JDBC_INTRO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class PostgersConfigration1 {

    public Connection getConnection(){
        try {
            return DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres","postgres","Ali200aa");
        }
        catch(SQLException e){
            System.out.println("Sql exception is here");
        }return null;
    }
}
