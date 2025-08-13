package Threads.Buffer;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Semaphore;

public class Tests {
    @Test
    public void test() throws InterruptedException {

        for (int i = 0; i < 500; i++) {
            List<Integer> buffer = new ArrayList<>();
            int bufferLength = 500;

            Semaphore newChars = new Semaphore(0);

            Writer writer = new Writer(buffer, bufferLength, newChars);
            Reader reader = new Reader(buffer, bufferLength, newChars);

            writer.start();
            reader.start();

            writer.join();
            reader.join();
        }
    }
}
