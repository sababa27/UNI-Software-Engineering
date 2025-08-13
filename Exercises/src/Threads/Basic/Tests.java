package Threads.Basic;

import java.util.ArrayList;
import java.util.List;

public class Tests {

    @org.junit.Test
    public void test1() throws InterruptedException {
        int k = 10;
        for (int p = 0; p < k; p++) {
            MyInteger count = new MyInteger(0);
            int n = 500;

            List<Thread> threads = new ArrayList<>();

            Thread t = null;
            for (int i = 0; i < 100; i++) {
                t = new Thread(new MyThread(count, n));
                threads.add(t);
                t.start();
            }

            for (int i = 0; i < threads.size(); i++) {
                threads.get(i).join();
            }

            System.out.println(count.getValue());
        }
    }

}
