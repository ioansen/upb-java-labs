package com.ioansen.java.array;


public class SortedArray extends Array {

    @Override
    public void addElement(Integer x) {
        int i = 0;
        for (; super.get(i) < x; i++);
        super.addElement(x, i);
    }

    @Override
    public void addElement(Integer x, int poz) {
        throw new UnsupportedOperationException("cannot add on poz " + poz + "array is sorted");
    }
}
