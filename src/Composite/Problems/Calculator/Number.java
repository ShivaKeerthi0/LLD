package Composite.Problems.Calculator;

public class Number extends ArithmeticExpression{

    public int value = 0;

    Number(int number){
        value = number;
    }

    public int result(){
        return  value;
    }
}
