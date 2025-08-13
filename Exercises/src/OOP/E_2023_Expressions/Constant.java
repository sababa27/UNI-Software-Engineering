package OOP.E_2023_Expressions;

public class Constant implements Expression{
    private final int value;

    public Constant(int value){
        this.value = value;
    }

    @Override
    public int evaluate(){
        return value;
    }

    @Override
    public String expressionToString(){
        return String.valueOf(value);
    }
}
