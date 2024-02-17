package AbstractFactory;

public class Main {
    public static  void main(String args[]){

        ShapeFactory sf= ShapeFactory.getFactory("Small"); // This is abstract Factory and returns us the Sub-factory or concrete Factory 

        Shape s = sf.getShape("circle");


        s.getDetails();


    }
}
