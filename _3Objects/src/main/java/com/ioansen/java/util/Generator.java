package com.ioansen.java.util;

import com.sun.tools.javac.jvm.Gen;

import java.util.concurrent.ThreadLocalRandom;

public class Generator {

    private static final String ALPHA_NUMERIC_STRING = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
    private static ThreadLocalRandom r = ThreadLocalRandom.current();

    private Generator(){
    }

    public static int randomInt(int bound){
        return r.nextInt(bound);
    }

    public static int randomInt(int origin,int bound){
       return r.nextInt(origin,bound);
    }

    public static double randomDouble(int bound){
        return r.nextDouble(bound);
    }

    public static double randomDouble(int origin,int bound){
        return r.nextDouble(origin,bound);
    }

    public static String randomString(int count) {
        StringBuilder builder = new StringBuilder();
        while (count-- != 0) {
            int character = (int)(Math.random()*ALPHA_NUMERIC_STRING.length());
            builder.append(ALPHA_NUMERIC_STRING.charAt(character));
        }
        return builder.toString();
    }

}
