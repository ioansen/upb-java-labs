package com.ioansen.java.wordsmap;

import com.ioansen.java.treeset.Main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WordsMap extends TreeMap<String, LinkedList<Integer>> {


    private WordsMap(){
    }

    public static WordsMap of(String filename){

        WordsMap wordsMap = new WordsMap();
        SortedSet<String> words = Main.getWords(filename);

        Iterator<String> iter = words.iterator();
        String curr;
        LinkedList<Integer> lines;

        Pattern pattern;
        Matcher matcher;

        int count;


        while (iter.hasNext()){
            curr = iter.next();
            lines = new LinkedList<>();
            pattern = Pattern.compile(curr);
            count = 0;


            try(BufferedReader bf = new BufferedReader(new FileReader(new File(filename)))){
                String line;

                while((line = bf.readLine()) != null){
                    matcher = pattern.matcher(line);
                    count++;
                    if (matcher.find()){
                        lines.add(count);
                    }
                }

            }catch (Exception e){
                e.printStackTrace();
            }

            wordsMap.put(curr, lines);

        }
        return wordsMap;
    }

    public static void main(String[] args){

        String filename = WordsMap.class.getClassLoader().getResource("words.in").getFile();
        System.out.println(WordsMap.of(filename));
    }
}
