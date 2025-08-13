package OOP.E_2023_Expressions.Tekla;

public class Addition implements Expression{
    private final Expression left;
    private final Expression right;

    public Addition(Expression left, Expression right){
        this.left = left;
        this.right = right;
    }

    @Override
    public int evaluate(){
        return left.evaluate() + right.evaluate();
    }
}
