package com.ioansen.java.train;

public abstract class AbstractWagon implements Vagon {

    private final int passangersCount;
    private final int colete;

    public AbstractWagon(int passangersCount, int colete) {
        this.passangersCount = passangersCount;
        this.colete = colete;
    }

    @Override
    public int getPassangersCount() {
        return passangersCount;
    }

    @Override
    public int getColete() {
        return colete;
    }
}
