package Composite.Problems.Calculator;

public class Expression extends ArithmeticExpression{

    public ArithmeticExpression left;
    public ArithmeticExpression right;

    public String Operation = "";

    Expression(ArithmeticExpression left , ArithmeticExpression right , String Operation){
        this.left = left;
        this.right = right;
        this.Operation = Operation;
    }

    public int result() {
        int val = 0;

        switch (Operation) {
            case "ADD":
                val = this.left.result() + this.right.result();
                break;
            case "SUB":
                val = this.left.result() - this.right.result();
                break;
            case "MUL":
                val = this.left.result() * this.right.result();
                break;
            case "DIV":
                val = this.left.result() / this.right.result();
                break;

        }

        return val;
    }
}
