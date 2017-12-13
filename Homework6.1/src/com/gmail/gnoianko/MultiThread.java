package com.gmail.gnoianko;

public class MultiThread {
    private Thread[] threadArray;
    private int n;

    public MultiThread(int n) {
        super();
        this.n = n;
        this.threadArray = new Thread[this.n];
    }

    public MultiThread() {
        super();
        this.threadArray = new Thread[0];
    }

    public void startCompute() {
        for (int i = 0; i < threadArray.length; i++) {
            threadArray[i] = new Thread(new FactorialThread(i));
            threadArray[i].start();
        }
    }
}
