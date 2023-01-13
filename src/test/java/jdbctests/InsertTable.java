package jdbctests;

import java .sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;

public class InsertTable {

    public static void main(String[] args) throws SQLException {

        String dbUrl="jdbc:mysql://localhost:3306/kurs";
        String dbUsername="root";
        String dbPassword="Gs19052008";

        Connection connection=DriverManager.getConnection(dbUrl,dbUsername,dbPassword);

        Statement statement=connection.createStatement();

        String sql="INSERT INTO kurs.ögrenci (ad,soyad,ders,notu) VALUES ('Ensar','Levent','SQL',90)";

        System.out.println(sql);

        statement.executeUpdate(sql);

        System.out.println("Table insert tamam....");

        statement.close();
        connection.close();


    }
}
