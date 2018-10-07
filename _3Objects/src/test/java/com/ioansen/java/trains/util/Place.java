package com.ioansen.java.trains.util;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public enum Place {
    BUCURESTI("Bucuresti", true, new MapPoint(0,0)),
    TIMISOARA("Timisoara", true, new MapPoint(-200, 100)),
    CLUJ("Cluj", true, new MapPoint(-100, 185)),
    IASI("Iasi", true, new MapPoint(70, 200)),
    CRAIOVA("Craiova", true, new MapPoint(-90, -15)),
    ORADEA("Oradea", true, new MapPoint(-185, 195)),
    CONSTANTA("Constanta", true, new MapPoint(100, -30)),
    BUDAPESTA("Budapesta", false, new MapPoint(-300, 230)),
    VIENA("Viena", false, new MapPoint(-400, 260)),
    SOFIA("Sofia", false, new MapPoint(-110, -80));

    private final String name;
    private final boolean local;
    private final MapPoint point;

    Place(String name, boolean local, MapPoint point)
    {
        this.name = name;
        this.local = local;
        this.point = point;
    }

    public String getName() { return name; }
    public boolean getLocal() { return local; }
    public MapPoint getPoint() { return point; }

    public static Place getRandom()  {
        return Place.values()[ThreadLocalRandom.current().nextInt(Place.values().length)];
    }

    public int timeTo(Place other)
    {
        Random rnd = ThreadLocalRandom.current();
        return rnd.nextInt(50) + this.point.time(other.point);
    }
}