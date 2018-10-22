package com.ioansen.java.scanner;

import java.util.Collections;
import java.util.Scanner;
import java.util.Vector;

public class Main {

    private static Vector<Integer> nums = new Vector<>();

    public static void myRead() throws NumarNegativ{
        Scanner in = new Scanner(System.in);
        int num;
        /*don't try this at home*/
        while (true){
            num = in.nextInt();
            /*exceptions shouldn't be used like this*/
            if ( num < 0) throw new NumarNegativ();
            nums.add(num);
        }


    }

    public static void main(String[] args){

        try{
            myRead();
        }catch (NumarNegativ nn){
            System.out.println(nn.getMessage());
        }

        System.out.println(nums);
        Collections.sort(nums);
        System.out.println("sorted: " + nums);
    }
}
