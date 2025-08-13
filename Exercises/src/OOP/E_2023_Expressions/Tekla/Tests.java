package OOP.E_2023_Expressions.Tekla;

import org.junit.Test;

public class Tests {
    @Test
    public void test(){
        Expression e = new Addition(new Constant(6), new Addition(new Constant(2), new Constant(2)));
        int ans = e.evaluate();

        System.out.println(ans);
    }
}
