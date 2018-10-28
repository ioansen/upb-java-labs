package com.ioansen.java.filefilter;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class MyFileFilter implements FileFilter {

    private final List<String> okFileExtensions = new ArrayList<>();
    private final List<String> okNames = new ArrayList<>();

    {
        read("extension.in", okFileExtensions);
        read("words.in", okNames);
    }

    private void read(String filename, List<String> list){

        try(RandomAccessFile rad = new RandomAccessFile(new File(
                MyFileFilter.class.getClassLoader().getResource(filename).getFile()), "r"))
        {

            String line;
            while ((line = rad.readLine()) != null){
                list.add(line);
            }

        }catch (IOException e){
            System.out.println(e.getMessage());
        }

    }


    @Override
    public boolean accept(File file)
    {
        if ( file.isDirectory()) return true;

        for (String extension : okFileExtensions)
        {
            if (file.getName().toLowerCase().endsWith(extension))
            {
                for (String name : okNames){
                    if ( file.getName().contains(name)){
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static void main(String[] args){
        File dir = new File(
                MyFileFilter.class.getClassLoader().getResource("director").getFile());

        recursiveFileSearch(dir, new MyFileFilter());
    }

    public static void recursiveFileSearch(File file, FileFilter filter){
        File[] files = file.listFiles(filter);
        if(files == null) return;
        for (File f : files)
        {
            if (f.isDirectory()){
                recursiveFileSearch(f, filter);
            } else {
                System.out.println("file: " + f.getName());
            }
        }
    }
}
