package Threads.E_2025;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.locks.Lock;

public class MyThread implements Runnable{
    private final int m0;
    private final int n0;
    private final int p0;
    private final int[][] A;  //m X n
    private final int[][] B;
    private final int[][] ans;
    private final Lock[][] locks;
    CountDownLatch latch;

    public MyThread(int[][] ans, Lock[][] locks, int m0, int p0, int n0, int[][]A, int[][]B, CountDownLatch latch){
        this.m0= m0;
        this.n0 = n0;
        this.p0 = p0;
        this.A = A;
        this.B = B;
        this.ans = ans;
        this.locks = locks;
        this.latch = latch;
    }

    @Override
    public void run(){
        try {
            int mult = A[m0][n0] * B[n0][p0];
            locks[m0][p0].lock();
            try {
                ans[m0][p0] += mult;
            } finally {
                locks[m0][p0].unlock();
            }
        }

        finally {
            latch.countDown();
        }
    }
}
