package Streams.E_2022;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;
import util.Pair;

public class Shops {
    ArrayList<Product> products;

    public ArrayList<Product> findTwoMostExpensiveProductsInCategory(Category category){

        ArrayList<Product> ans = new ArrayList<>();

        Stream<Product> filteredStream = products.stream().filter(p -> {
           return p.getCategory() == category;
        });

        List<Product> filteredProducts = filteredStream.toList();

        Product p0 = new Product(null, Integer.MIN_VALUE);

        Product max = filteredProducts.stream().reduce(p0, (a,b) ->{
           if(a.getPrice() > b.getPrice())
               return a;
           return b;
        });

        if(max == p0)
            return ans;

        ans.add(max);

        Stream<Product> filteredStream2 = filteredProducts.stream().filter(p -> {
           return p.getPrice() != max.getPrice();
        });

        List<Product> filteredProducts2 = filteredStream2.toList();

        if(filteredProducts.size() - filteredProducts2.size() > 1){
            ans.add(max);
        }

        else{
            Product secondMax = filteredProducts2.stream().reduce(p0, (a,b) ->{
                if(a.getPrice() > b.getPrice())
                    return a;
                return b;
            });

            if(secondMax == p0)
                return ans;

            ans.add(secondMax);
        }

        return ans;
    }

    public Category findTheMostExpensiveCategory() {
        Stream<HashMap<Category, Integer>> stream = products.stream().map(p ->{
           Category key = p.getCategory();
           Integer value = p.getPrice();
           HashMap<Category, Integer> hm = new HashMap<>();
           hm.put(key, value);
           return hm;
        });

        HashMap<Category, Integer> map0 = new HashMap<>();
        HashMap<Category, Integer> map = stream.reduce(map0, (a, b) ->{
            Map.Entry<Category, Integer> entryB = b.entrySet().iterator().next();

            int delta = 0;
            if(a.containsKey(entryB.getKey()))
                delta = a.get(entryB.getKey());

            a.put(entryB.getKey(), entryB.getValue() + delta);

            return a;
        });

        Stream<Pair<Category, Integer>> stream2 = map.entrySet().stream().map(e ->{
            Pair<Category, Integer> p = new Pair(e.getKey(), e.getValue());
            return p;
        });

        Pair p0 = new Pair(null, Integer.MIN_VALUE);
        Pair<Category, Integer> ans = stream2.reduce(p0, (a,b) ->{
           if(a.getSecond() > b.getSecond())
               return a;
           return b;
        });

        return ans.getFirst();
    }
}
