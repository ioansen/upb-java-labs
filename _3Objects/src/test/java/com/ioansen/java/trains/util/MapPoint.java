package com.ioansen.java.trains.util;

class MapPoint {
    private final int x;
    private final int y;

    public MapPoint(int x, int y)
    {
        this.x = x;
        this.y = y;
    }

    public double distance(MapPoint other)
    {
        int s = this.x-other.x;
        int d = this.y-other.y;
        return Math.sqrt(s * s + d * d);
    }

    public int time(MapPoint other)
    {
        Double dist = distance(other);
        return dist.intValue() * 2;
    }

}