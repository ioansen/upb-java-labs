package com.ioansen.java.train;

public class MarfaWagon extends AbstractWagon {

    public MarfaWagon() {
        super(0, 400);
    }


    @Override
    public String doorService() {
        return "manual";
    }

    @Override
    public String windowService() {
        return "manual";
    }

    @Override
    public String toString() {
        return "Marfa{passangers: "+ getPassangersCount() +
                " colete: " + getColete() +
                " doorService " + doorService() +
                " windowService " + windowService() + "}";
    }
}
