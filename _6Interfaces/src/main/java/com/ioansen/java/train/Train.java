package com.ioansen.java.train;

import java.util.Collections;
import java.util.Vector;

public class Train implements Comparable<Train>{

    private Vector<Vagon> vagoane = new Vector<>();

    public void addVagon(Vagon vagon){
        vagoane.add(vagon);
    }

    @Override
    public String toString() {
        return "Train{" +
                "vagoane=" + vagoane +
                '}';
    }

    @Override
    public int compareTo(Train o) {
        int thisCap = 0, otherCap = 0;
        for (Vagon v: vagoane){
            thisCap += v.getColete();
        }
        for (Vagon v: o.vagoane){
            otherCap += v.getColete();
        }

        return Integer.compare(otherCap, thisCap);
    }

    public static void main(String[] args){

        Train t = new Train();
        t.addVagon(new CalatoriAWagon());
        t.addVagon(new CalatoriBWagon());
        t.addVagon(new CalatoriAWagon());
        t.addVagon(new CalatoriAWagon());
        t.addVagon(new CalatoriAWagon());
        t.addVagon(new CalatoriBWagon());
        t.addVagon(new CalatoriBWagon());
        t.addVagon(new MarfaWagon());
        System.out.println(t);
    }
}
