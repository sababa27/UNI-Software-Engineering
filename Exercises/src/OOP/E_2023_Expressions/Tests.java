package OOP.E_2023_Expressions;
import org.junit.jupiter.api.Test;

public class Tests {

    @Test
    public void test(){
        Expression exp = new Division(
              new Multiplication(new Constant(4), new Addition(new Constant(2), new Constant(3))),
                new Subtraction(new Multiplication(new Constant(2), new Constant(5)), new Constant(6))
        );
        System.out.println(exp.expressionToString());
        System.out.println(exp.evaluate());
    }
}
