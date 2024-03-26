package Decorator;

public  abstract  class Toppings extends Pizza {

    Pizza pza;

    Toppings(Pizza pza){
        this.pza = pza;
    }
    public abstract  int cost();
}
