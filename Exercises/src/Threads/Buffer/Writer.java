package Threads.Buffer;

import java.util.List;
import java.util.concurrent.Semaphore;

public class Writer extends Thread{
    private final List<Integer> buffer;
    private final int bufferLength;
    private final Semaphore newChars;

    public Writer(List<Integer> buffer, int bufferLength, Semaphore newChars){
        this.buffer = buffer;
        this.bufferLength = bufferLength;
        this.newChars = newChars;
    }

    @Override
    public void run(){
        for(int i=0; i<bufferLength; i++){
            buffer.add(i);
            //System.out.println(i + " was written");
            newChars.release();
        }
    }
}
