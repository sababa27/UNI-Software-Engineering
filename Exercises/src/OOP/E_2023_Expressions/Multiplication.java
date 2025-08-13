package OOP.E_2023_Expressions;

public class Multiplication extends BinaryExpression{

    public Multiplication(Expression left, Expression right){
        super(left, right);
    }

    @Override
    public int apply(int a, int b){
        return a*b;
    }

    @Override
    public String getOperationSymbol(){
        return "*";
    }
}
