import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

import java.sql.*;

/**
 * Created by 401-06 on 3/7/2019.
 */
public class LoginApp extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        FlowPane pane=new FlowPane();
        Scene scene=new Scene(pane , 300,300);

        TextField username = new TextField();
        PasswordField passwordField=new PasswordField();
        Button button=new Button("login");
        button.setOnAction((event)->{
            try {
                Class.forName("org.sqlite.JDBC");
                String connectionString = "jdbc:sqlite://C://Users/401-06/Desktop/myapp.db";
                Connection conn = DriverManager.getConnection(connectionString);
                String sql = "select * from users where username=? and password=?";
                PreparedStatement statement=conn.prepareStatement(sql);
                statement.setString(1 , username.getText());
                statement.setString(2 , passwordField.getText());
                //Statement statement=conn.createStatement();
                ResultSet resultSet=statement.executeQuery(sql);
                if(resultSet.next()){
                    System.out.println("welcome");
                }else{
                    System.out.println("wrong pass");
                }

                System.out.println(sql);
            }catch (Exception e){
                System.out.println(e);
            }

        });

        pane.getChildren().addAll(username , passwordField , button);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
