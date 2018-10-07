package com.ioansen.java.trains;

import com.ioansen.java.trains.util.Place;
import org.junit.Test;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class TrainTest {


    private static Train generateTrain()
    {
        Place orig = Place.getRandom();
        Place dest = Place.getRandom();

        while (orig.getName().equals(dest.getName())) dest = Place.getRandom();

        Random rnd = ThreadLocalRandom.current();
        int start = rnd.nextInt(23*60);
        int end =  start + orig.timeTo(dest);
        Clock startc = Clock.from(start);
        Clock endc = Clock.from(end);

        return new Train(new Route(orig.getName(), dest.getName()),
                new Schedule(startc, endc),
                orig.getLocal() && dest.getLocal());

    }

    @Test
    public void printTrains(){
        for(int i = 0; i < 10; i++){
            System.out.println(generateTrain());
        }
    }
}
