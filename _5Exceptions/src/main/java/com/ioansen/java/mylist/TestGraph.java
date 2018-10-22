package com.ioansen.java.mylist;



/**
 * Clasa folosita pentru testarea problemei 2
 * @author Nan Mihai
 */
public class TestGraph {
    public static void main(String args[]) {
        Graph g = new Graph(8);
        g.add(0, 1);
        g.add(0, 4);
        g.add(0, 7);
        g.add(1, 2);
        g.add(4, 5);
        g.add(3, 1);
        g.add(5, 2);
        g.add(5, 6);
        g.add(5, 7);
        g.add(2, 3);
        System.out.println(g);
        g.dfs(0);
    }
}
