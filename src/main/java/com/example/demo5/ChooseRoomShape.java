package com.example.demo5;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;

import javafx.stage.Stage;

import java.io.*;

public class ChooseRoomShape {



    public Button sideCutBtton;
    public Button Lbutton;
    public Button squareButton;


    public void squaredRoom(ActionEvent actionEvent) throws IOException {
        Stage stage = (Stage) squareButton.getScene().getWindow();
        stage.close();

        Room room = new Room();
        room.setRoomPic("");


        Stage stage1 = new Stage();
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("DesignScreen.fxml"));
        stage1.setTitle("DesignScene");
        stage1.setScene(new Scene(fxmlLoader.load()));
        stage1.show();

    }

    public void sidedCutedRoom(ActionEvent actionEvent) throws IOException {
        Stage stage = (Stage) sideCutBtton.getScene().getWindow();
        stage.close();
        Room room = new Room();
        room.setRoomPic("sideCuted");

        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("DesignScreen.fxml"));


        Stage stage1 = new Stage();

        stage1.setTitle("DesignScene");
        stage1.setScene(new Scene(fxmlLoader.load()));
        stage1.show();

    }

    public void LshapedRoom(ActionEvent actionEvent) throws IOException {
        Stage stage = (Stage) Lbutton.getScene().getWindow();
        stage.close();
        Room room = new Room();
        room.setRoomPic("LShaped");

        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("DesignScreen.fxml"));


        Stage stage1 = new Stage();

        stage1.setTitle("DesignScene");
        stage1.setScene(new Scene(fxmlLoader.load()));
        stage1.show();

    }
}
