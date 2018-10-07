package com.ioansen.java.trains;

public class Route {

    private String origin;
    private String destination;

    public Route(String origin, String destination)
    {
        this.origin = origin;
        this.destination = destination;
    }

    /**Checks if this route combined with the given route
     * is a round-trip
     * @param other the other Route to test
     * @return false if it isn't true if it is*/
    public boolean isTR(Route other)
    {
        return this.origin.equals(other.destination) && this.destination.equals(other.origin) ;
    }
}
