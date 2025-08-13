package Threads.Buffer;

import java.util.List;
import java.util.concurrent.Semaphore;

public class Reader extends Thread{
    private final List<Integer> buffer;
    private final int bufferLength;
    private final Semaphore newChars;

    public Reader(List<Integer> buffer, int bufferLength, Semaphore newChars){
        this.buffer = buffer;
        this.bufferLength = bufferLength;
        this.newChars = newChars;
    }

    @Override
    public void run(){
        for(int i=0; i<bufferLength; i++){
            try {
                newChars.acquire();
            }

            catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            int x = buffer.get(i);
            //System.out.println(i + " was read");
        }
    }
}
