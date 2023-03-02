package com.example.demo5;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TitledPane;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import jfxtras.labs.util.event.MouseControlUtil;

import java.io.IOException;
import java.net.URL;
import java.util.Objects;
import java.util.ResourceBundle;

public class DesignScreenHandler implements Initializable {
    public Pane roomBoarder;
    public ImageView room;
    public Button yellowButton;
    public Button redButton;
    public Button greenButton;
    public Button blueButton;
    public Button pinkButton;
    public AnchorPane addFurniture;
    public Label color;

    public void save(ActionEvent actionEvent) {
    }

    public void exit(ActionEvent actionEvent) {
        Platform.exit();
    }

    public void addRoom(ActionEvent actionEvent) {
    }


    public void addFurniture(String furniture) throws IOException {
        Furniture furniture1 = new Furniture( furniture);

        ImageView imageView = furniture1.getPicture();
        MouseControlUtil.makeDraggable(imageView);
        roomBoarder.getChildren().add(imageView);
    }



    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        pinkButton.setStyle("-fx-background-color: #ff00c3");
        blueButton.setStyle("-fx-background-color: #004bff");
        yellowButton.setStyle("-fx-background-color: #ffb900");
        greenButton.setStyle("-fx-background-color: #00ff19");
        redButton.setStyle("-fx-background-color: #ff1900");
        roomBoarder.getChildren().add(Room.getPic());

    }

    public void pink(ActionEvent actionEvent) {
        Furniture.setColor(0);
        color.setText("Pink");
    }


    public void blue(ActionEvent actionEvent) {
        Furniture.setColor(4);
        color.setText("Blue");
    }

    public void green(ActionEvent actionEvent) {
        Furniture.setColor(3);
        color.setText("Green");
    }

    public void red(ActionEvent actionEvent) {
        Furniture.setColor(2);
        color.setText("Red");
    }

    public void yellow(ActionEvent actionEvent) {
        Furniture.setColor(1);
        color.setText("Yellow");
    }

    public void addTable(ActionEvent actionEvent) throws IOException {
        addFurniture("table");
    }

    public void addDoubleBed(ActionEvent actionEvent) throws IOException {
        addFurniture("doubleBed");
    }

    public void addDoubleWardobe(ActionEvent actionEvent) throws IOException {
        addFurniture("wardrobe");
    }

    public void addCoffeeTable(ActionEvent actionEvent) throws IOException {
        addFurniture("coffeTable");
    }

    public void addSingleWardobe(ActionEvent actionEvent) throws IOException {
        addFurniture("wardrobe");
    }

    public void addOvalCarpet(ActionEvent actionEvent) throws IOException {
        addFurniture("ovalCarpet");
    }

    public void addRectCarpet(ActionEvent actionEvent) throws IOException {
        addFurniture("rectCarpet");
    }

    public void addShelf(ActionEvent actionEvent) throws IOException {
        addFurniture("shelf");
    }

    public void addSofa(ActionEvent actionEvent) throws IOException {
        addFurniture("sofa");
    }

    public void addNightStand(ActionEvent actionEvent) throws IOException {
        addFurniture("nightStand");
    }

    public void addSingleBed(ActionEvent actionEvent) throws IOException {
        addFurniture("singleBed");
    }

    public void addChair(ActionEvent actionEvent) throws IOException {
        addFurniture("chair");
    }
}
