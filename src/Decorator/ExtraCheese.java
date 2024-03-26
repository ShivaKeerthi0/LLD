package Decorator;

public class ExtraCheese extends Toppings{


    ExtraCheese(Pizza pza){
        super(pza);
    }

    public int cost(){
        return this.pza.cost() + 30;
    }
}
