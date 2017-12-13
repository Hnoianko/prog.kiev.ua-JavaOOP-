package com.gmail.gnoianko;

import java.math.BigInteger;

public class FactorialThread implements Runnable {
    private int number;

    public FactorialThread(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public BigInteger calculateFact() {
        BigInteger fact = new BigInteger("1");
        for (int i = 1; i <= this.number; i++) {
            fact = fact.multiply(new BigInteger("" + i));
        }
        return fact;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " "
                + this.number + "! = " + this.calculateFact());

    }
}
