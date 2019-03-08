import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.sql.*;

/**
 * Created by 401-06 on 3/7/2019.
 */
public class MyApp {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        String connectionString = "jdbc:mysql://localhost/myapp";
        Connection conn= DriverManager.getConnection(connectionString , "root" , "");

        String sql = "SELECT * FROM student";
        Statement statement=conn.createStatement();
        ResultSet resultSet=statement.executeQuery(sql);

        while (resultSet.next()){
            System.out.println(resultSet.getInt("id")+" "+resultSet.getString(2)+" "+resultSet.getString(3));
        }

        sql = "INSERT INTO student values(1004 , 'ABC' , 'XYZ')";
        statement.execute(sql);
    }

}
