package jdbctests;

import java .sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;

public class CreateTable {

    public static void main(String[] args) throws SQLException {

        String dbUrl="jdbc:mysql://localhost:3306/kurs";
        String dbUsername="root";
        String dbPassword="Gs19052008";

        Connection connection=DriverManager.getConnection(dbUrl,dbUsername,dbPassword);

        Statement statement=connection.createStatement();

        String sql="CREATE TABLE kurs.ögrenci (id INT NOT NULL AUTO_INCREMENT,\n"+
                "ad VARCHAR(45),\n"+
                "soyad VARCHAR(45),\n"+
                "ders VARCHAR(30),\n"+
                "notu INT,\n"+
                "PRIMARY KEY (id))";

        statement.executeUpdate(sql);

        System.out.println("Table olusturma tamam....");

        statement.close();
        connection.close();
    }

}
