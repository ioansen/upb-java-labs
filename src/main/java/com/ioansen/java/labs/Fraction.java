package com.ioansen.java.labs;

import java.util.Objects;

/**A simple class that emulates the mathematical fraction
 * This class is immutable and thread-safe
* */
public class Fraction {

    private final double numerator;
    private final double denominator;

    public Fraction(double numerator, double denumitor) {
        this.numerator = numerator;
        this. denominator = denumitor;
    }

    public Fraction(){
        this(1,1);
    }

    public double getNumerator() {
        return numerator;
    }

    public double getDenumitor() {
        return  denominator;
    }

    /**Performs the addition of two fractions. This one
     * and one given as param
     *
     * @param other the fraction to add to this fraction
     * @return another fraction that represents the addition
     * */
    public Fraction adition(Fraction other){
        double num = this.numerator*other. denominator + this. denominator*other.numerator;
        double denom = this. denominator*other. denominator;

        return new Fraction(num,denom);
    }
    /**Perform division of the denominator from the numerator
     * @return the division result as double*/
    public double toDecimal(){
        return this.numerator / this.denominator;
    }


    @Override
    public String toString(){
        return this.numerator + "/" + this. denominator;
    }

    @Override
    public boolean equals(Object other){
        if (!(other instanceof Fraction)) {
            return false;
        }

        return Double.compare(this.toDecimal(),((Fraction) other).toDecimal()) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(numerator, denominator);
    }

}
