package Threads.GameOfLife;

import java.util.Random;

public class MyThread implements Runnable{
    private final boolean[][] grid;
    private final int x;
    private final int y;
    private final int numIterations;

    public MyThread(boolean[][] grid, int x, int y, int numIterations){
        this.grid = grid;
        this.x = x;
        this.y= y;
        this.numIterations = numIterations;
    }


    @Override
    public void run(){

    }



}
