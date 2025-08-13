package Streams.Basics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Demo {
    public static List<Integer> nums = new ArrayList<>(Arrays.asList(1, 2, 3));

    public static Stream<Integer>  filterUse(){
        Predicate<Integer> p1 = new Predicate<Integer>(){
            @Override
            public boolean test(Integer n) {
                return n % 2 == 0;
            }
        };

        Predicate<Integer> p2 = n -> n%2 == 0;

        Stream<Integer> numsStream = nums.stream().filter(p2);
        return numsStream;
    }

    public static Stream<String> mapUse(){
        //       takes    returns
        Function<Integer, String> fun1 = new Function<Integer, String>(){
            @Override
            public String apply(Integer n) {
                return ":" + n;
            }
        };


        Function<Integer, String> fun2 = n -> ":"+n;

        Stream<String> numsStream = nums.stream().map(fun2);
        return numsStream;
    }


    public static Integer reduceUse(){

        Integer ans = nums.stream().reduce(0, (a, b) -> a+b);


        return ans;
    }

    public static void main(String[] args) {
        Stream<String> numsStream = mapUse();
        System.out.println(numsStream.toList());

        Integer ans = reduceUse();
        System.out.println(ans);
    }
}
