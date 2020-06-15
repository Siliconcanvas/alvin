package controllers;

import animations.objects.Bird;

import javafx.animation.*;
import javafx.fxml.FXML;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
import javafx.animation.*;
import javafx.util.Duration;

public class LoginController extends Transition{

    private PathTransition pathTransition;


    @FXML
    private GridPane baseGrid;




    public LoginController(){

        Rectangle rect = new Rectangle (100, 40, 100, 100);
        rect.setArcHeight(50);
        rect.setArcWidth(50);
        rect.setFill(Color.VIOLET);
        baseGrid.getChildren().add(rect);

//        Path path = new Path();
//        path.getElements().add (new MoveTo (0f, 50f));
//        path.getElements().add (new CubicCurveTo (40f, 10f, 390f, 240f, 1904, 50f));
////
////        pathTransition.setDuration(Duration.millis(10000));
//        pathTransition.setNode(rect);
//        pathTransition.setPath(path);
//        pathTransition.setOrientation(PathTransition.OrientationType.ORTHOGONAL_TO_TANGENT);
//        pathTransition.setCycleCount(4);
//        pathTransition.setAutoReverse(true);
//
//        pathTransition.play();
    }

    @Override
    protected void interpolate(double frac) {


    }


    private void test(){

    }





}
