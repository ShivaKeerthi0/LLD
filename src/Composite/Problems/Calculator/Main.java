package Composite.Problems.Calculator;

public class Main {

    public static void main(String args[]){

        ArithmeticExpression num_1 = new Number(5);
        ArithmeticExpression exp_1 = new Expression(new Number(1),new Number(2),"ADD");
        ArithmeticExpression exp_2 = new Expression(exp_1, num_1 , "MUL");

        System.out.println(exp_2.result());

    }
}
