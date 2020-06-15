package main;

import controllers.LoginController;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import static com.mongodb.client.model.Filters.eq;
import static com.mongodb.client.model.Updates.combine;

public class StageCoach {

    //LOGIN SCREEN
    private Parent loginpage;
    private Scene login;
    private Stage lgn = new Stage();


    public StageCoach(){

        System.out.println("StageCoach initialized.");
    }


    public void stopLgn(){
        lgn.close();
    }


    public void callLogin(){



        try {
            lgn.initStyle(StageStyle.UNDECORATED);
            loginpage = FXMLLoader.load(getClass().getClassLoader().getResource("LoginScreen.fxml"));

            login = new Scene(loginpage);
            lgn.setScene(login);
            lgn.show();
        } catch (IOException exception) {
            System.out.println("commander" + exception.getMessage());

            throw new RuntimeException(exception);
        }finally{

        }

    }

}
