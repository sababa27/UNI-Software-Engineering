package Threads.E_2023;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ProducerConsumerQueue <T>{
    private final int capacity;
    private final Queue<T> queue;
    private final Lock lock;
    private final Condition conditionPut;
    private final Condition conditionTake;

    public ProducerConsumerQueue(int capacity){
        this.capacity = capacity;
        this.queue = new LinkedList<>();

        lock = new ReentrantLock();
        conditionPut = lock.newCondition();
        conditionTake = lock.newCondition();
    }

    public void put(T value){
        lock.lock();

        try{
            while(queue.size() >= capacity){
                try {
                    conditionPut.await();
                }
                catch(InterruptedException e){
                    throw new RuntimeException(e);
                }
            }

            queue.add(value);
            conditionTake.signalAll();
        }

        finally{
            lock.unlock();
        }
    }

    public T take(){
        lock.lock();
        T ret = null;
        try{

            while(queue.isEmpty()){
                try {
                    conditionTake.await();
                }
                catch(InterruptedException e){
                    throw new RuntimeException(e);
                }
            }

            ret = queue.poll();
            conditionPut.signalAll();
        }

        finally{
            lock.unlock();
        }

        return ret;
    }
}
