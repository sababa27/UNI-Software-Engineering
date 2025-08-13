package OOP.E_2023_Expressions;

public abstract class BinaryExpression implements Expression{
    private final Expression left;
    private final Expression right;

    public BinaryExpression(Expression left, Expression right){
        this.left = left;
        this.right = right;
    }

    @Override
    public int evaluate(){
        return apply(left.evaluate(), right.evaluate());
    }

    @Override
    public String expressionToString(){
        return "(" + left.expressionToString() + getOperationSymbol() + right.expressionToString() + ")";
    }

    abstract int apply(int a, int b);
    abstract String getOperationSymbol();
}
