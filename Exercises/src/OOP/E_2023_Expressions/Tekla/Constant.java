package OOP.E_2023_Expressions.Tekla;

public class Constant implements Expression {
    private int value;

    public Constant(int value){
        this.value= value;
    }

    @Override
    public int evaluate(){
        return value;
    }
}
