package jdbctests;

import java.sql.*;

public class PreInsert {

    public static void main(String[] args) throws SQLException {

        String dbUrl = "jdbc:mysql://localhost:3306/kurs";
        String dbUsername = "root";
        String dbPassword = "Gs19052008";

       String sql = "INSERT INTO kurs.ögrenci(ad,soyad,ders,notu) VALUES" + "(?,?,?,?)";

        Connection connection = DriverManager.getConnection(dbUrl, dbUsername, dbPassword);

        PreparedStatement preparedStatement = connection.prepareStatement(sql);

        preparedStatement.setString(1, "Ali");
        preparedStatement.setString(2, "Levent");
        preparedStatement.setString(3, "JAVA");
        preparedStatement.setInt(4, 95);

        preparedStatement.executeUpdate();

        System.out.println("Insert table tamam...");

        preparedStatement.close();
        connection.close();
    }


}
