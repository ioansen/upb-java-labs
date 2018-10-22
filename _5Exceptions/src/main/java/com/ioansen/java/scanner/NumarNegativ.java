package com.ioansen.java.scanner;

public class NumarNegativ extends Exception {

    /*shouldn't do this, no need to override message*/
    public NumarNegativ(){
        super("Numarul introdus este negativ");
    }
}
