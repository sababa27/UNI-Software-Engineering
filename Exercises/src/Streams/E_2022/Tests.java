package Streams.E_2022;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.*;

public class Tests {
    @Test
    public void testFindTwoMostExpensiveProductsInCategory() {
        Shops shop = new Shops();
        shop.products = new ArrayList<>(Arrays.asList(
            new Product(Category.makeup, 100),
            new Product(Category.makeup, 200),
            new Product(Category.makeup, 150),
            new Product(Category.skincare, 500),
            new Product(Category.clothes, 50),
            new Product(Category.clothes, 60)
        ));

        ArrayList<Product> result = shop.findTwoMostExpensiveProductsInCategory(Category.makeup);
        List<Integer> prices = Arrays.asList(result.get(0).getPrice(), result.get(1).getPrice());
        assertTrue(prices.contains(200));
        assertTrue(prices.contains(150));
        assertEquals(2, result.size());
    }

    @Test
    public void testFindTheMostExpensiveCategory() {
        Shops shop = new Shops();
        shop.products = new ArrayList<>(Arrays.asList(
            new Product(Category.makeup, 100),
            new Product(Category.makeup, 200),
            new Product(Category.makeup, 150),
            new Product(Category.skincare, 500),
            new Product(Category.clothes, 50),
            new Product(Category.clothes, 60)
        ));

        Category mostExpensive = shop.findTheMostExpensiveCategory();
        assertEquals(Category.skincare, mostExpensive);
    }
}
