package Flyweight;

import java.util.HashMap;

public class BallFactory {

    public static HashMap<String , Ball>  CacheMap=  new HashMap<String,Ball>();

    public Ball getBall(String color, String url){

        if(CacheMap.containsKey(color)){
            return CacheMap.get(color);
        }

        Ball  b = new Ball(color,url);
        System.out.println("Creating a new Ball as there is no ball with given parameters");
        CacheMap.put(color,b);
        return  b;
    }

}
