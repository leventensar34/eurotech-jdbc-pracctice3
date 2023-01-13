package jdbctests;

import java .sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;

public class CreateDataBase {

    public static void main(String[] args) throws SQLException {

        /*
        Ip: 92.205.106.232 port: 3306
        User: devex
        p: dwEde3.4SdKLs98.ds14
         */

        String dbUrl="jdbc:mysql://localhost:3306/";
        String dbUsername="root";
        String dbPassword="Gs19052008";

        Connection connection=DriverManager.getConnection(dbUrl,dbUsername,dbPassword);

        Statement statement=connection.createStatement();

        String sql="CREATE DATABASE kurs";

        statement.executeUpdate(sql);

        System.out.println("Database olusturma tamam....");

        statement.close();
        connection.close();


    }


}
