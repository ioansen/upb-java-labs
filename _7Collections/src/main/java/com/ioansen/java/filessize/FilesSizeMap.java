package com.ioansen.java.filessize;

import java.io.File;
import java.util.Comparator;
import java.util.TreeMap;

public class FilesSizeMap extends TreeMap<String, Long> {

    public FilesSizeMap(String directory){
        File file = new File(directory);
        recursiveFileSearch(file);

    }

    public FilesSizeMap(Comparator<? super String> comparator, String directory) {
        super(comparator);
        File file = new File(directory);
        recursiveFileSearch(file);
    }

    private void recursiveFileSearch(File directory){

        File[] files = directory.listFiles();
        if(files == null) return;

        for (File f : files)
        {
            if (f.isDirectory()){
                recursiveFileSearch(f);
            } else {
              put(f.getName(), f.length());
            }
        }
    }

    public static void main(String[] args){

        String directory = FilesSizeMap.class.getClassLoader().getResource("director").getFile();

        System.out.println( new FilesSizeMap(directory));
        System.out.println( new FilesSizeMap(Comparator.reverseOrder(), directory));
    }

}
