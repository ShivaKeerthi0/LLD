package Flyweight;

public class Ball {

    private String color;
    private String image;

    private String x_cordinate;

    private String y_coordinate;


    Ball(String color, String url){
        this.color = color;
        this.image = url;
    }

    public  void setX(String x){
        this.x_cordinate = x;
    }

    public void setY(String y){
        this.y_coordinate = y;
    }

    public void draw(){
        // logic for drawing a ball on screen;
    }

}
