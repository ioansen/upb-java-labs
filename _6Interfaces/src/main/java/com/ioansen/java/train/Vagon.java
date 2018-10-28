package com.ioansen.java.train;

public interface Vagon extends Comparable<Vagon>{

    int getPassangersCount();

    int getColete();

    String doorService();

    String windowService();

    @Override
    default int compareTo(Vagon o){
        return Integer.compare(o.getColete(), getColete());
    }
}
