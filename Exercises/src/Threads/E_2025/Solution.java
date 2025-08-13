package Threads.E_2025;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Solution {
    private final int m;
    private final int n;
    private final int p;
    private final int[][] A;  //m X n
    private final int[][] B;  //n X p

    public Solution(int m, int n, int p, int[][]A, int[][]B){
        this.m = m;
        this.n = n;
        this.p = p;
        this.A = A;
        this.B = B;
    }

    public int[][] answer(){
        int[][] ans = new int[m][p];
        Lock[][] locks = new Lock[m][p];
        Thread[] threads = new Thread[m*n*p];
        CountDownLatch latch = new CountDownLatch(m*p);

        for(int i=0; i<m; i++)
            for(int j=0; j<p; j++)
                locks[i][j] = new ReentrantLock();

        int o = 0;
        for(int i=0; i<m; i++){
            for(int j=0; j<p; j++){
                for(int k=0; k<n; k++){
                    threads[o] = new Thread(new MyThread(ans, locks, i, j, k, A, B, latch));
                    threads[o].start();
                    o++;
                }
            }
        }

        for(int i=0; i<m*n*p; i++){
            try {
                threads[i].join();
            }

            catch(Exception e){
                e.printStackTrace();
            }
        }

        return ans;
    }

    public int[][] answer2(){

        int[][] ans = new int[m][p];
        Lock[][] locks = new Lock[m][p];
        CountDownLatch latch = new CountDownLatch(m*n*p);

        for(int i=0; i<m; i++)
            for(int j=0; j<p; j++)
                locks[i][j] = new ReentrantLock();

        for(int i=0; i<m; i++){
            for(int j=0; j<p; j++){
                for(int k=0; k<n; k++){
                    Thread t = new Thread(new MyThread(ans, locks, i, j, k, A, B, latch));
                    t.start();
                }
            }
        }

        try {
            latch.await();
        }
        catch(Exception e){

        }

        return ans;
    }



    public static void main(String[] args) {

    }

}
