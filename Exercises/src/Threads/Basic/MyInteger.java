package Threads.Basic;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MyInteger {
    private int value;
    private final Lock lock = new ReentrantLock();

    public MyInteger(int value){
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public void increment(int delta){
        lock.lock();

        try {
            value += delta;
        }

        finally {
            lock.unlock();
        }
    }
}

