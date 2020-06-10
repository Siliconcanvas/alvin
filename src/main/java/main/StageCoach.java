package main;

import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

public class StageCoach implements Initializable {

    //LOGIN SCREEN
    private Parent loginpage;
    private Scene login;
    private Stage lgn = new Stage();


    public StageCoach(){
        System.out.println("StageCoach initialized.");
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
}
