package Threads.GameOfLife;

import java.util.Random;

public class Solution {
    public static void initialize(boolean[][] grid){
        Random r = new Random();
        for(int i=0; i<grid.length; i++)
            for(int j=0; j<grid[i].length; j++)
                grid[i][j] = r.nextBoolean();
    }

    public static void main(String[] args) {
        int m = 5;
        int n = 5;

        boolean[][] grid = new boolean[m][n];
        initialize(grid);

        Thread[][] threads = new Thread[m][n];

        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                //threads[i][j] = new Thread(new MyThread(grid, ));
                threads[i][j].start();
            }
        }

        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                try{
                    threads[i][j].join();
                }
                catch(Exception e){

                }
            }
        }
    }
}
