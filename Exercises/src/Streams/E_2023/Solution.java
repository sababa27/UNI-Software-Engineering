package Streams.E_2023;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class Solution {
    public static <T> List<T> removeEveryNth(Stream<T> items, int n){

        class Couple{
            private T val;
            private int index;

            public Couple(T val){
                this.val = val;
                this.index = -1;
            }

            public void setIndex(int index){
                this.index = index;
            }

            public int getIndex(){
                return index;
            }

            public T getValue(){
                return val;
            }

            @Override
            public String toString(){
                return "value = " + val.toString() + " index = " + index;
            }
        };

        /*
        items = t0, t1, t2, t3, t4 ...
        stream = [{t0, -1}], [{t1, -1}], [{t2, -1}], [{t3, -1}] ...
        list = {null, -1}, {t0, 0}, {t1, 1}, {t2, 2} ...
         */

        Stream< List<Couple> > stream = items.map(i -> {
            Couple c = new Couple(i);
            List<Couple> l = new ArrayList<>();
            l.add(c);
            return l;
        });

        List<Couple> l0 = new ArrayList<>();
        l0.add(new Couple(null));

        List<Couple> list = stream.reduce(l0, (a, b) ->{
            Couple c1 = a.get(a.size() -1);
            Couple c2 = b.get(b.size() -1);
            c2.setIndex(c1.getIndex() + 1);
            a.add(c2);
            return a;
        });

        Stream<Couple> stream2 = list.stream().filter(c -> {
           if(c.getIndex() == -1 || (c.getIndex() + 1) % n == 0)
               return false;
           return true;
        });

        List<T> ans = stream2.map(c -> c.getValue()).toList();

        return ans;
    }

    public <T> List<T> removeConsecutiveDuplicates(Stream<T> items, Comparator<T> cmp){

        return null;
    }
}
