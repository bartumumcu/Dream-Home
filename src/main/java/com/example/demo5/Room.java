package com.example.demo5;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;

import java.io.File;
import java.util.ArrayList;

public class Room {
    private  String shape;
    private static ImageView pic;





    public void setRoomPic(String shape){
        if (shape.equals("LShaped")){
            File file = new File("D:/ads/finalexam/demo5/src/main/resources/com/example/demo5/Room/unnamed (2).png ");
            Image image = new Image(file.toURI().toString());
            ImageView imageView = new ImageView(image);
            pic = imageView;
            pic.setFitWidth(1000);
            pic.setFitHeight(300);


        } else if(shape.equals("sideCuted")){
            File file = new File("D:/ads/finalexam/demo5/src/main/resources/com/example/demo5/Room/Asset 60 (1).png");
            Image image = new Image(file.toURI().toString());
            ImageView imageView = new ImageView(image);
            pic = imageView;
            pic.setFitWidth(1000);
            pic.setFitHeight(300);


        } else {
            File file = new File("D:/ads/finalexam/demo5/src/main/resources/com/example/demo5/Room/unnamed (3).png ");
            Image image = new Image(file.toURI().toString());
            ImageView imageView = new ImageView(image);
            pic = imageView;
            pic.setFitWidth(1000);
            pic.setFitHeight(300);

        }

    }

    public static ImageView getPic(){
        return pic;
    }

}
