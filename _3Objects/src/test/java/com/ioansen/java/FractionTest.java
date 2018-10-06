package com.ioansen.java;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Unit test for simple Fraction class.
 */
public class FractionTest
{
    @Test
    public void toDecimalTest()
    {
        assertEquals("should be 3.5", new Fraction(7,2).toDecimal(), 7.0/2, 0.001);
        assertEquals("should be -0.4", new Fraction(14,-35).toDecimal(), 14.0/(-35.0), 0.001);
        assertEquals("should be 2.33", new Fraction(21,9).toDecimal(), 21.0/9.0, 0.001);
        assertEquals("should be 2", new Fraction(10,5).toDecimal(), 2, 0.001);
        assertEquals("should be 3.36", new Fraction(7.4,2.2).toDecimal(), 7.4/2.2, 0.001);
        assertEquals("should be 0.69", new Fraction(12.12,17.56).toDecimal(), 12.12/17.56, 0.001);
        assertEquals("should be 21.16", new Fraction(91,4.3).toDecimal(), 91/4.3, 0.001);
        assertEquals("should be -2.2", new Fraction(135,-61.1).toDecimal(), 135/(-61.1), 0.001);
        assertEquals("should be 0.19", new Fraction(19.43,98.98).toDecimal(), 19.43/98.98, 0.001);
        assertEquals("should be 0.98", new Fraction(120,122).toDecimal(), 120.0/122.0, 0.001);
        assertEquals("should be -0.46", new Fraction(-41.51,90).toDecimal(), (-41.56/90), 0.001);
        assertEquals("should be 1.23", new Fraction(-12.23,-9.87).toDecimal(),  12.23/9.87, 0.001);
    }

    @Test
    public void additionTest()
    {
        Fraction f = new Fraction(41.34, 29.87);
        double fdec = f.toDecimal();
        assertEquals(f.adition(new Fraction(7,2)).toDecimal(), 4.88399, 0.001);
        assertEquals(f.adition(new Fraction(14,-35)).toDecimal(), fdec+ 14.0/(-35.0), 0.001);
        assertEquals(f.adition(new Fraction(21,9)).toDecimal(), fdec + 21.0/9.0, 0.001);
        assertEquals(f.adition(new Fraction(10,5)).toDecimal(), fdec + 2, 0.001);
        assertEquals(f.adition(new Fraction(7.4,2.2)).toDecimal(), fdec + 7.4/2.2, 0.001);
        assertEquals(f.adition(new Fraction(12.12,17.56)).toDecimal(), fdec + 12.12/17.56, 0.001);
        assertEquals(f.adition(new Fraction(91,4.3)).toDecimal(), fdec + 91/4.3, 0.001);
        assertEquals(f.adition(new Fraction(135,-61.1)).toDecimal(), fdec + 135/(-61.1), 0.001);
        assertEquals( f.adition(new Fraction(19.43,98.98)).toDecimal(), fdec + 19.43/98.98, 0.001);
        assertEquals( f.adition(new Fraction(120,122)).toDecimal(), fdec + 120.0/122.0, 0.001);
        assertEquals(f.adition(new Fraction(-21.51,90)).toDecimal(), fdec + (-21.56/90), 0.001);
        assertEquals(f.adition(new Fraction(-12.23,-9.87)).toDecimal(), fdec + 12.23/9.87, 0.001);

    }


    @Test
    public void equalsTest()
    {
        Fraction f = new Fraction(41.34, 29.87);
        Fraction f2 = new Fraction(41.34*4.3, 29.87*4.3);
        Fraction f3 = new Fraction(41.34*4.3, 29.87*4.4);
        assertEquals(f.toDecimal(),f2.toDecimal(), 0.001);
        if ( f.equals(f2)){
            System.out.println(f +  " " + f2 + " " + f.toDecimal() + " " + f2.toDecimal());
            assertEquals(f.hashCode(), f2.hashCode());
        }
        if( !f.equals(f3)){
            assertNotEquals(f.hashCode(),f3.hashCode());
        }

    }

}
