package com.ioansen.java.trains;

import java.lang.*;

/**Emulates a simple hh:mm clock*/
class Clock {

    private final int hour;
    private final int minute;

    public Clock(int h, int m) throws IllegalArgumentException
    {
        if ( h > 23) throw new IllegalArgumentException("h should be < 24 given: " + h);
        if ( m > 59) throw new IllegalArgumentException("m should be < 60 given: " + m);

        hour = h;
        minute = m;
    }

    /**Returns this clock as number of minutes starting from 00:00
     * @return the number of minutes*/
    public int asMinutes()
    {
        return hour * 60 + minute;
    }

    /**Transforms a number of minutes into a Clock instance
     * by transforming the minutes into hours
     * @param minutes the number of minutes to be transformed
     * @return the Clock instance */
    public static Clock from(int minutes)
    {
        int hour = minutes/60;
        while ( hour > 23 ) hour -= 24;
        int minute = minutes % 60;
        return new Clock(hour, minute);
    }

    /**Transforms the given String into a Clock instance
     * the String has to be in the form 'hh:mm' otherwise
     * an IllegalArgumentException will be thrown
     * @param time the String to be converted
     * @throws IllegalArgumentException if the String cannot be parsed
     * @return the CLock instance*/
    public static Clock from(String time)
            throws IllegalArgumentException
    {
        if (!time.matches("(((0|1)[0-9])|(2[0-3])):[0-5][0-9]"))
            throw new IllegalArgumentException("bad clock pattern: expected hh:mm");
        String[] values = time.split(":");
        return new Clock(Integer.parseInt(values[0]),
                Integer.parseInt(values[1]));
    }

    @Override
    public String toString()
    {
        String min = minute < 10 ? "0" + minute : "" + minute;
        String hr = hour < 10 ? "0" + hour : "" + hour;

        return hr + ":" + min;
    }
}
