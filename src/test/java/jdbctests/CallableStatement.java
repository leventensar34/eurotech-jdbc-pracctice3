package jdbctests;

import java.sql.*;

public class CallableStatement {

    public static void main(String[] args) throws SQLException {

        String dbUrl="jdbc:mysql://localhost:3306/kurs";
        String dbUsername="root";
        String dbPassword="Gs19052008";

        Connection connection=DriverManager.getConnection(dbUrl,dbUsername,dbPassword);

        String sql="CALL kurs.Sp_ögrenci_select";
        java.sql.CallableStatement callableStatement=connection.prepareCall(sql);

        ResultSet resultSet=callableStatement.executeQuery();


        while (resultSet.next()){
            System.out.println(resultSet.getInt(1)+"-"+resultSet.getString(2)+"-"+resultSet.getString(3)+"-"+
                    resultSet.getString(4)+"-"+resultSet.getInt(5));
        }

        resultSet.close();
        callableStatement.close();
        connection.close();
    }
}
