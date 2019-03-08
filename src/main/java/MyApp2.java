import java.sql.*;

/**
 * Created by 401-06 on 3/7/2019.
 */
public class MyApp2 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("org.sqlite.JDBC");
        String connectionString = "jdbc:sqlite://C://Users/401-06/Desktop/myapp.db";
        Connection conn= DriverManager.getConnection(connectionString);

//        String sql = "SELECT * FROM student";
//        Statement statement=conn.createStatement();
//        ResultSet resultSet=statement.executeQuery(sql);
//
//        while (resultSet.next()){
//            System.out.println(resultSet.getInt("id")+" "+resultSet.getString(2)+" "+resultSet.getString(3));
//        }
//
//        sql = "INSERT INTO student values(1004 , 'ABC' , 'XYZ')";
//        statement.execute(sql);
    }

}
