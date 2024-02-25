package Flyweight;

import java.util.HashMap;

public class Main {

    public static HashMap<String,String> BallColorMap = new HashMap<String,String>();;
    public static  void main(String args[]){
        // For suppose we are having 3 different color balls in our game
        // we are creating a map for intrinsic properties of object, so that we can pass them to Ball factory class
        BallColorMap.put("Yellow", "url1");
        BallColorMap.put("Green", "url2");
        BallColorMap.put("Red","url2");

        BallFactory bf = new BallFactory();

        Ball ball_1 = bf.getBall("Yellow", BallColorMap.get("Yellow"));
        ball_1.setX("20");
        ball_1.setY("30");
        Ball ball_2 = bf.getBall("Green", BallColorMap.get("Green"));
        ball_2.setX("40");
        ball_2.setY("50");
        Ball ball_3 = bf.getBall("Yellow", BallColorMap.get("Yellow"));
        ball_3.setX("60");
        ball_3.setY("70");
        Ball ball_4 = bf.getBall("Red", BallColorMap.get("Red"));
        ball_4.setX("90");
        ball_4.setY("70");

        // This helps us to check whether the same object is returned or not
        System.out.println(ball_1.hashCode());
        System.out.println(ball_3.hashCode());

    }
}
