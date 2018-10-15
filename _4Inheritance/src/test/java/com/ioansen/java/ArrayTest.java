package com.ioansen.java;

import com.ioansen.java.array.Array;
import com.ioansen.java.array.MyStack;
import com.ioansen.java.array.SortedArray;
import org.junit.Test;
import static org.junit.Assert.*;


public class ArrayTest {

    @Test
    public void testSortedArray(){
        Array array = new SortedArray();
        array.addElement(20);
        array.addElement(56);
        array.addElement(14);
        array.addElement(29);
        array.addElement(34);

        assertEquals(array.get(0), 14);
        assertEquals(array.get(1), 20);
        assertEquals(array.get(2), 29);
        assertEquals(array.get(3), 34);
        assertEquals(array.get(4), 56);

    }

    @Test
    public void testMyStack(){
        MyStack stack = new MyStack();
        stack.push(10);
        stack.push(21);
        stack.push(45);

        assertEquals(45, stack.pop());
        assertEquals(21, stack.pop());
        assertEquals(10, stack.pop());

    }


}
