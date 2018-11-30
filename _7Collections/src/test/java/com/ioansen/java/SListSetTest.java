package com.ioansen.java;

import com.ioansen.java.slists.SListSet;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.fail;

import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class SListSetTest {

    private SListSet<String> sListSet;

    {

        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        ThreadLocalRandom r = ThreadLocalRandom.current();
        List<String> someList = new ArrayList<>();

        for ( int i = 0; i < 40; i++)
            someList.add(String.valueOf(alphabet.charAt(r.nextInt(alphabet.length()))));

        sListSet = new SListSet<>();
        sListSet.addAll(someList);
    }

    @Test
    public void testAdd(){
        Iterator<String> iter = sListSet.iterator();

        String prev = null;
        if (iter.hasNext()) {
            prev = iter.next();
        }

        String curr = null;
        while (iter.hasNext()) {
            curr = iter.next();
            if (curr.compareTo(prev) < 0) {
                fail();
            }
            prev = curr;
        }

        SListSet<String> reversedSet = new SListSet<>(Comparator.reverseOrder());
        reversedSet.addAll(sListSet);

        Iterator<String> iterRev = reversedSet.iterator();

        String prevRev = null;
        if (iterRev.hasNext()) {
            prevRev = iterRev.next();
        }

        String currRev = null;
        while (iterRev.hasNext()) {
            currRev = iterRev.next();
            if (currRev.compareTo(prevRev) > 0) {
                fail();
            }
            prevRev = currRev;
        }
    }
}
