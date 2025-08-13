package Streams.Problems;

import java.util.ArrayList;
import java.util.stream.Stream;


public class Solutions {

    static int solution_0(ArrayList<String> list){

        Stream<Integer> stream = list.stream().map(s -> s.length());
        int ans = stream.reduce(0, (a, b) -> (a + b));

        return ans;
    }

    static int solution_1(ArrayList<Integer> list){
        Stream<Integer> odds = list.stream().filter(n -> (n % 2 == 1));
        int ans = odds.reduce(0, (a, b) -> (a+b));
        return ans;
    }

    static ArrayList<String> solution_10(ArrayList<String> list){
        Stream<String> stream1 = list.stream().filter(s -> {
            return s.length() >= 5;
        });

        Stream<ArrayList<String>> stream2 = stream1.map(s -> {
            ArrayList<String> l = new ArrayList<>();
            l.add(s);
            return l;
        });

        ArrayList<String> stream3 = stream2.reduce(new ArrayList<String>(),
                (a, b) ->{
                    String s = b.getFirst();

                    String iden = "";
                    String k = a.stream().reduce(iden, (m, n) -> {
                        if(s.compareTo(n) > 0)
                            m += "1";
                        return m;
                    });

                    int i = k.length();
                    a.add(i, s);
                    return a;
                });

        return stream3;
    }

    static void solution_11(ArrayList<Integer> list){
        class Couple{
          Integer value;
          int index;

          public Couple(Integer value, int index){
              this.value = value;
              this.index = index;
          }

            public Integer getValue() {
                return value;
            }

            public int getIndex() {
                return index;
            }

            @Override
            public String toString() {
                return "Couple{" +
                        "value=" + value +
                        ", index=" + index +
                        '}';
            }
        };

        Stream<ArrayList<Couple>> stream = list.stream().map(n -> {
            ArrayList<Couple> l = new ArrayList<>();
            l.add(new Couple(n, -1));
            return l;
        });

        ArrayList<Couple> l = new ArrayList<>();
        l.add(new Couple(null, -1));

        ArrayList<Couple> couples = stream.reduce(l, (a,b) ->{
            Integer value = b.getFirst().getValue();
            int index = a.getLast().getIndex() + 1;
            a.add(new Couple (value, index));
            return a;
        });

        Stream<Couple> coupleStream = couples.stream().filter(c ->{return c.getIndex() != -1;});

        for(Couple c: couples){
            System.out.println(c.toString());
        }
    }


}
