package com.example.demo5;


import javafx.scene.image.ImageView;

import javax.imageio.ImageIO;
import javafx.scene.image.Image;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;


public class Furniture {
    private static  int color = 0;
    private String name;


    // five different color options for each type of furniture
    /*index 0 pink
    * index 1 yellow
    * index 2 red
    * index 3 green
    * index 5 blue
    * */
    private static final List<Image> chairs = new ArrayList<Image>(){
        {   File file1 = new File("D:/ads/finalexam/demo5/src/main/resources/com/example/demo5/Chair/Asset 5.png");
            Image image1 = new Image(file1.toURI().toString());
            add(image1);

            File file2 = new File("D:/ads/finalexam/demo5/src/main/resources/com/example/demo5/Chair/Asset 4.png");
            Image image2 = new Image(file2.toURI().toString());
            add(image2);

            File file3 = new File("D:/ads/finalexam/demo5/src/main/resources/com/example/demo5/Chair/Asset 3.png");
            Image image3 = new Image(file3.toURI().toString());
            add(image3);

            File file4 = new File("D:/ads/finalexam/demo5/src/main/resources/com/example/demo5/Chair/Asset 2.png");
            Image image4 = new Image(file4.toURI().toString());
            add(image4);

            File file5 = new File("D:/ads/finalexam/demo5/src/main/resources/com/example/demo5/Chair/Asset 1.png");
            Image image5 = new Image(file5.toURI().toString());
            add(image5);


        }
    };



    private static final ArrayList<Image> coffeTables = new ArrayList<>(){{

        File file1 = new File("D:/ads/finalexam/demo5/src/main/resources/com/example/demo5/CoffTable/Asset 44.png");
        Image image1 = new Image(file1.toURI().toString());
        add(image1);

        File file2 = new File("D:/ads/finalexam/demo5/src/main/resources/com/example/demo5/CoffTable/Asset 43.png");
        Image image2 = new Image(file2.toURI().toString());
        add(image2);

        File file3 = new File("D:/ads/finalexam/demo5/src/main/resources/com/example/demo5/CoffTable/Asset 42.png");
        Image image3 = new Image(file3.toURI().toString());
        add(image3);

        File file4 = new File("D:/ads/finalexam/demo5/src/main/resources/com/example/demo5/CoffTable/Asset 45.png");
        Image image4 = new Image(file4.toURI().toString());
        add(image4);

        File file5 = new File("D:/ads/finalexam/demo5/src/main/resources/com/example/demo5/CoffTable/Asset 46.png");
        Image image5 = new Image(file5.toURI().toString());
        add(image5);


}
    };
    private static final ArrayList<Image> doubleBeds = new ArrayList<>(){{

        File file1 = new File("D:/ads/finalexam/demo5/src/main/resources/com/example/demo5/DoubleBed/Asset 16.png");
        Image image1 = new Image(file1.toURI().toString());
        add(image1);

        File file2 = new File("D:/ads/finalexam/demo5/src/main/resources/com/example/demo5/DoubleBed/Asset 18.png");
        Image image2 = new Image(file2.toURI().toString());
        add(image2);

        File file3 = new File("D:/ads/finalexam/demo5/src/main/resources/com/example/demo5/DoubleBed/Asset 21.png");
        Image image3 = new Image(file3.toURI().toString());
        add(image3);

        File file4 = new File("D:/ads/finalexam/demo5/src/main/resources/com/example/demo5/DoubleBed/Asset 20.png");
        Image image4 = new Image(file4.toURI().toString());
        add(image4);

        File file5 = new File("D:/ads/finalexam/demo5/src/main/resources/com/example/demo5/DoubleBed/Asset 19.png");
        Image image5 = new Image(file5.toURI().toString());
        add(image5);


    }
    };
    private static ArrayList<Image> nightStands = new ArrayList<Image>(){{

        File file1 = new File("D:/ads/finalexam/demo5/src/main/resources/com/example/demo5/NightStand/Asset 23.png");
        Image image1 = new Image(file1.toURI().toString());
        add(image1);

        File file2 = new File("D:/ads/finalexam/demo5/src/main/resources/com/example/demo5/NightStand/Asset 26.png");
        Image image2 = new Image(file2.toURI().toString());
        add(image2);

        File file3 = new File("D:/ads/finalexam/demo5/src/main/resources/com/example/demo5/NightStand/Asset 22.png");
        Image image3 = new Image(file3.toURI().toString());
        add(image3);

        File file4 = new File("D:/ads/finalexam/demo5/src/main/resources/com/example/demo5/NightStand/Asset 25.png");
        Image image4 = new Image(file4.toURI().toString());
        add(image4);

        File file5 = new File("D:/ads/finalexam/demo5/src/main/resources/com/example/demo5/NightStand/Asset 24.png");
        Image image5 = new Image(file5.toURI().toString());
        add(image5);


    }
    };
    private static ArrayList<Image> ovalCarpets = new ArrayList<Image>(){{

        File file1 = new File("D:/ads/finalexam/demo5/src/main/resources/com/example/demo5/OvalCarpet/Asset 36.png");
        Image image1 = new Image(file1.toURI().toString());
        add(image1);

        File file2 = new File("D:/ads/finalexam/demo5/src/main/resources/com/example/demo5/OvalCarpet/Asset 33.png");
        Image image2 = new Image(file2.toURI().toString());
        add(image2);

        File file3 = new File("D:/ads/finalexam/demo5/src/main/resources/com/example/demo5/OvalCarpet/Asset 34.png");
        Image image3 = new Image(file3.toURI().toString());
        add(image3);

        File file4 = new File("D:/ads/finalexam/demo5/src/main/resources/com/example/demo5/OvalCarpet/Asset 32.png");
        Image image4 = new Image(file4.toURI().toString());
        add(image4);

        File file5 = new File("D:/ads/finalexam/demo5/src/main/resources/com/example/demo5/OvalCarpet/Asset 35.png");
        Image image5 = new Image(file5.toURI().toString());
        add(image5);


    }
    };
    private static final ArrayList<Image> rectCarpets = new ArrayList<Image>(){{

        File file1 = new File("D:/ads/finalexam/demo5/src/main/resources/com/example/demo5/RectCarpet/Asset 41.png");
        Image image1 = new Image(file1.toURI().toString());
        add(image1);

        File file2 = new File("D:/ads/finalexam/demo5/src/main/resources/com/example/demo5/RectCarpet/Asset 37.png");
        Image image2 = new Image(file2.toURI().toString());
        add(image2);

        File file3 = new File("D:/ads/finalexam/demo5/src/main/resources/com/example/demo5/RectCarpet/Asset 40.png");
        Image image3 = new Image(file3.toURI().toString());
        add(image3);

        File file4 = new File("D:/ads/finalexam/demo5/src/main/resources/com/example/demo5/RectCarpet/Asset 38.png");
        Image image4 = new Image(file4.toURI().toString());
        add(image4);

        File file5 = new File("D:/ads/finalexam/demo5/src/main/resources/com/example/demo5/RectCarpet/Asset 39.png");
        Image image5 = new Image(file5.toURI().toString());
        add(image5);


    }
    };
    private static final ArrayList<Image> shelves = new ArrayList<Image>(){{

        File file1 = new File("D:/ads/finalexam/demo5/src/main/resources/com/example/demo5/Shelf/Asset 15.png");
        Image image1 = new Image(file1.toURI().toString());
        add(image1);

        File file2 = new File("D:/ads/finalexam/demo5/src/main/resources/com/example/demo5/Shelf/Asset 11.png");
        Image image2 = new Image(file2.toURI().toString());
        add(image2);

        File file3 = new File("D:/ads/finalexam/demo5/src/main/resources/com/example/demo5/Shelf/Asset 14.png");
        Image image3 = new Image(file3.toURI().toString());
        add(image3);

        File file4 = new File("D:/ads/finalexam/demo5/src/main/resources/com/example/demo5/Shelf/Asset 12.png");
        Image image4 = new Image(file4.toURI().toString());
        add(image4);

        File file5 = new File("D:/ads/finalexam/demo5/src/main/resources/com/example/demo5/Shelf/Asset 13.png");
        Image image5 = new Image(file5.toURI().toString());
        add(image5);


    }
    };
    private static final ArrayList<Image> singleBeds = new ArrayList<Image>(){{

        File file1 = new File("D:/ads/finalexam/demo5/src/main/resources/com/example/demo5/SingleBed/Asset 49.png");
        Image image1 = new Image(file1.toURI().toString());
        add(image1);

        File file2 = new File("D:/ads/finalexam/demo5/src/main/resources/com/example/demo5/SingleBed/Asset 47.png");
        Image image2 = new Image(file2.toURI().toString());
        add(image2);

        File file3 = new File("D:/ads/finalexam/demo5/src/main/resources/com/example/demo5/SingleBed/Asset 48.png");
        Image image3 = new Image(file3.toURI().toString());
        add(image3);

        File file4 = new File("D:/ads/finalexam/demo5/src/main/resources/com/example/demo5/SingleBed/Asset 51.png");
        Image image4 = new Image(file4.toURI().toString());
        add(image4);

        File file5 = new File("D:/ads/finalexam/demo5/src/main/resources/com/example/demo5/SingleBed/Asset 50.png");
        Image image5 = new Image(file5.toURI().toString());
        add(image5);


    }
    };
    private static final ArrayList<Image> sofas = new ArrayList<Image>(){{

        File file1 = new File("D:/ads/finalexam/demo5/src/main/resources/com/example/demo5/Sofa/Asset 30.png");
        Image image1 = new Image(file1.toURI().toString());
        add(image1);

        File file2 = new File("D:/ads/finalexam/demo5/src/main/resources/com/example/demo5/Sofa/Asset 29.png");
        Image image2 = new Image(file2.toURI().toString());
        add(image2);

        File file3 = new File("D:/ads/finalexam/demo5/src/main/resources/com/example/demo5/Sofa/Asset 31.png");
        Image image3 = new Image(file3.toURI().toString());
        add(image3);

        File file4 = new File("D:/ads/finalexam/demo5/src/main/resources/com/example/demo5/Sofa/Asset 27.png");
        Image image4 = new Image(file4.toURI().toString());
        add(image4);

        File file5 = new File("D:/ads/finalexam/demo5/src/main/resources/com/example/demo5/Sofa/Asset 28.png");
        Image image5 = new Image(file5.toURI().toString());
        add(image5);


    }
    };
    private static ArrayList<Image> tables = new ArrayList<Image>(){{

        File file1 = new File("D:/ads/finalexam/demo5/src/main/resources/com/example/demo5/Table/Asset 9.png");
        Image image1 = new Image(file1.toURI().toString());
        add(image1);

        File file2 = new File("D:/ads/finalexam/demo5/src/main/resources/com/example/demo5/Table/Asset 10.png");
        Image image2 = new Image(file2.toURI().toString());
        add(image2);

        File file3 = new File("D:/ads/finalexam/demo5/src/main/resources/com/example/demo5/Table/Asset 9.png");
        Image image3 = new Image(file3.toURI().toString());
        add(image3);

        File file4 = new File("D:/ads/finalexam/demo5/src/main/resources/com/example/demo5/Table/Asset 7.png");
        Image image4 = new Image(file4.toURI().toString());
        add(image4);

        File file5 = new File("D:/ads/finalexam/demo5/src/main/resources/com/example/demo5/Table/Asset 6.png");
        Image image5 = new Image(file5.toURI().toString());
        add(image5);


    }
    };
    private static ArrayList<Image> wardRobes = new ArrayList<Image>(){{

        File file1 = new File("D:/ads/finalexam/demo5/src/main/resources/com/example/demo5/Wardrobes/Asset 52.png");
        Image image1 = new Image(file1.toURI().toString());
        add(image1);

        File file2 = new File("D:/ads/finalexam/demo5/src/main/resources/com/example/demo5/Wardrobes/Asset 55.png");
        Image image2 = new Image(file2.toURI().toString());
        add(image2);

        File file3 = new File("D:/ads/finalexam/demo5/src/main/resources/com/example/demo5/Wardrobes/Asset 56.png");
        Image image3 = new Image(file3.toURI().toString());
        add(image3);

        File file4 = new File("D:/ads/finalexam/demo5/src/main/resources/com/example/demo5/Wardrobes/Asset 53.png");
        Image image4 = new Image(file4.toURI().toString());
        add(image4);

        File file5 = new File("D:/ads/finalexam/demo5/src/main/resources/com/example/demo5/Wardrobes/Asset 54.png");
        Image image5 = new Image(file5.toURI().toString());
        add(image5);


    }
    };

    private ImageView picture;
    private int[] cornerCordinates;

    public Furniture(String name) throws IOException {
        this.name = name;
        addPicture();
    }

    public void addPicture() throws IOException {

        ImageView imageView;
        switch (this.name){
            case "chair":
                imageView = new ImageView(chairs.get(color));
                this.picture = imageView;
                break;
            case "coffeTable":
                imageView = new ImageView(coffeTables.get(color));
                this.picture = imageView;
                break;

            case "doubleBed":
                imageView = new ImageView(doubleBeds.get(color));
                this.picture = imageView;
                break;
            case "nightStand":
                imageView = new ImageView(nightStands.get(color));
                this.picture = imageView;
                break;
            case "ovalCarpet":
                imageView = new ImageView(ovalCarpets.get(color));
                this.picture = imageView;
                break;
            case "rectCarpet":
                imageView = new ImageView(rectCarpets.get(color));
                this.picture = imageView;
                break;
            case "shelf":
                imageView = new ImageView(shelves.get(color));
                this.picture = imageView;
                break;
            case "singleBed":
                imageView = new ImageView(singleBeds.get(color));
                this.picture = imageView;
                break;
            case "sofa":
                imageView = new ImageView(sofas.get(color));
                this.picture = imageView;
                break;
            case "table":
                imageView = new ImageView(tables.get(color));
                this.picture = imageView;
                break;
            case "wardrobe":
                imageView = new ImageView(wardRobes.get(color));
                this.picture = imageView;
                break;
        }
    }

    public  ImageView getPicture(){
        return picture;
    }

    public static void setColor(int color){
        Furniture.color = color;
    }

}
