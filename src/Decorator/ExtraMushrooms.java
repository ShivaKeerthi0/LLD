package Decorator;

public class ExtraMushrooms extends  Toppings{


    ExtraMushrooms(Pizza pza){
        super(pza);
    }

    public int cost(){
        return this.pza.cost()+50;
    }
}
