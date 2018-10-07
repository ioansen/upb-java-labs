package com.ioansen.java;

public class Number {

    private final int number;

    public Number(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public int sum(int a){
        return number + a;
    }

    public int sum(int a, int b){
        return a + sum(b);
    }

    public int sum(int a, int b, int c){
        return a + sum(b, c);
    }

    public int sum(int a, int b, int c, int d){
        return a + sum(b, c, d);
    }
}
