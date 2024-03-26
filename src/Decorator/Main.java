package Decorator;

public class Main {

    public static void main(String [] args){

        Pizza pza = new PannerPizza();

        Toppings cheese =  new ExtraCheese(pza);

        Toppings mushrooms = new ExtraMushrooms(cheese);

        System.out.println("Total cost of pizza orderd is :"+ mushrooms.cost());
    }
}

