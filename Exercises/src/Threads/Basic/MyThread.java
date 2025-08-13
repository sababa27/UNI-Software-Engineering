package Threads.Basic;

public class MyThread implements Runnable{
    MyInteger count;
    int n;

    public MyThread(MyInteger count, int n){
        this.count = count;
        this.n = n;
    }

    public void run(){
        for(int i=0; i<n; i++)
            incrementCount();
    }

    private void incrementCount(){
            count.increment(1);
    }


}
