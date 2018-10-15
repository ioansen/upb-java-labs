package com.ioansen.java.array;

public class MyStack {

    private Array array = new Array();

    public void push(Integer x){
        array.addElement(x,array.getSize());
    }

    public int pop(){
        return array.remove(array.getSize()-1);
    }
}
