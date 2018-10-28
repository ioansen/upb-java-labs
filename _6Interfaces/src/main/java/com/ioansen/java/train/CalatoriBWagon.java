package com.ioansen.java.train;

public class CalatoriBWagon extends AbstractWagon {

    public CalatoriBWagon() {
        super(50, 400);
    }

    @Override
    public String doorService() {
        return "automated";
    }

    @Override
    public String windowService() {
        return "automated";
    }

    @Override
    public String toString() {
        return "CalatoriB{passangers: "+ getPassangersCount() +
                " colete: " + getColete() +
                " doorService " + doorService() +
                " windowService " + windowService() + "}";
    }
}
