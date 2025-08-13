package Threads.MySemaphore;

import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MySemaphore {
    private int permits;
    private final Lock lock;
    private final Condition condition;

    public MySemaphore(int permits){
        this.permits = permits;
        lock = new ReentrantLock();
        condition = lock.newCondition();
    }

    public void acquire(){
        lock.lock();

        try{
            while(permits <= 0){
                try {
                    condition.await();
                }
                catch(InterruptedException e){
                    throw new RuntimeException(e);
                }
            }

            permits--;
        }

        finally{
            lock.unlock();
        }
    }

    public void release(){
        lock.lock();

        try{
            permits++;
            condition.signalAll();
        }

        finally{
            lock.unlock();
        }
    }
}
