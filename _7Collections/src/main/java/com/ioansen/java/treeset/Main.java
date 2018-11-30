package com.ioansen.java.treeset;

import com.ioansen.java.slists.SListSet;

import java.io.*;
import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {


    public static SortedSet<String> getWords(String filename){
        SortedSet<String> fillWords = new SListSet<>();

        Pattern pattern = Pattern.compile("[\\w']+");
        Matcher matcher;


        try(BufferedReader bf = new BufferedReader(new FileReader(new File(filename)))){
            String line;

            while((line = bf.readLine()) != null){
                matcher = pattern.matcher(line);
                while (matcher.find()){
                    fillWords.add(matcher.group());
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }

        return fillWords;
    }


    public static void main(String[] args){
        SortedSet<String> words = getWords(Main.class.getClassLoader().getResource("words.in").getFile());

        Comparator<String> comparator = Comparator.reverseOrder();

        SortedSet<String> sameTreeWords = new TreeSet<>(comparator);
        sameTreeWords.addAll(words);
        SortedSet<String> sameSListWords = new SListSet<>(comparator);
        sameSListWords.addAll(words);

        System.out.println(words);
        System.out.println(sameTreeWords);
        System.out.println(sameSListWords);

    }
}
