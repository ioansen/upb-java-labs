package com.ioansen.java.treeset;

import java.io.*;
import java.util.Comparator;
import java.util.TreeSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static TreeSet<String> printWords(String filename){
        TreeSet<String> words = new TreeSet<>();
        File file = new File(filename);

        Pattern pattern = Pattern.compile("[\\w']+");
        Matcher matcher;


        try(BufferedReader bf = new BufferedReader(new FileReader(new File(filename)))){
            String line;

            while((line = bf.readLine()) != null){
                matcher = pattern.matcher(line);
                while (matcher.find()){
                    words.add(matcher.group());
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }

        return words;
    }

    public static TreeSet<String> printWordsComparator(TreeSet<String> words){

        TreeSet<String> sameWords = new TreeSet<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            }
        });
        sameWords.addAll(words);
        return sameWords;
    }

    public static void main(String[] args){
        TreeSet<String> words = printWords(Main.class.getClassLoader().getResource("words.in").getFile());
        TreeSet<String> sameWords = printWordsComparator(words);

        System.out.println(words);
        System.out.println(sameWords);

    }
}
