package Threads.E_2022;

public class MyThread implements Runnable{
    private int answer;

    public MyThread(int numThreads, int start, int end){

        if(numThreads == 1){

        }

        else{

        }

    }

    @Override
    public void run(){

    }

    public void changeAnswer(int newAnswer){
        answer = newAnswer;
    }
}
