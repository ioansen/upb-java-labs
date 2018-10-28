package com.ioansen.java.train;

public class CalatoriAWagon extends AbstractWagon {

    public CalatoriAWagon() {
        super(40, 300);
    }


    @Override
    public String doorService() {
        return "automated";
    }

    @Override
    public String windowService() {
        return "manual";
    }

    @Override
    public String toString() {
        return "CalatoriA{passangers: "+ getPassangersCount() +
                " colete: " + getColete() +
                " doorService " + doorService() +
                " windowService " + windowService() + "}";
    }
}
