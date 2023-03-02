package com.example.demo5;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;

public class HelloController {
    public Button designButton;




    public void design(ActionEvent actionEvent) throws IOException {
            Stage stage = (Stage) designButton.getScene().getWindow();
            stage.close();
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("chooseRoomShape.fxml"));


            Stage stage1 = new Stage();

            stage1.setTitle("ChooseRoomShape");
            stage1.setScene(new Scene(fxmlLoader.load()));
            stage1.show();



        }

    }
