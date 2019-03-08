import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.util.Locale;
import java.util.Observable;
import java.util.ResourceBundle;

/**
 * Created by 401-06 on 3/7/2019.
 */
public class Myapp3 extends Application{

    @Override
    public void start(Stage primaryStage) throws Exception {
        ResourceBundle resourceBundle=ResourceBundle.getBundle("texts" , Locale.CHINA);
        Pane pane=new Pane();
        Scene scene=new Scene(pane , 400,400);
        Label label=new Label(resourceBundle.getString("label.username"));
        ObservableList<String> languages = FXCollections.observableArrayList(Locale.US.getDisplayLanguage() , Locale.FRENCH.getDisplayLanguage(Locale.FRANCE) , Locale.CHINA.getDisplayLanguage(Locale.CHINA));
        ChoiceBox<String> choiceBox=new ChoiceBox<>(languages);
        pane.getChildren().addAll(choiceBox ,label);
        label.setTranslateY(100);
        primaryStage.setScene(scene);
        primaryStage.show();

    }
}
