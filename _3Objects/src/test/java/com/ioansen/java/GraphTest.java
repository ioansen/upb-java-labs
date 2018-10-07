package com.ioansen.java;

import org.junit.Test;

public class GraphTest {

    private static void printMatrix(int[][] matrix){
        StringBuilder res = new StringBuilder();

        for ( int i = 0; i < matrix.length; i++){
            res.append(i).append(": ");
            for ( int j = 0 ; j < matrix[i].length; j++)
            {
                res.append(matrix[i][j]).append(' ');
            }
            res.append('\n');
        }

        System.out.println(res);
    }


    @Test
    public void testGraph(){
        Graph g = new Graph(4);
        g.addArc(0, 2, -2);
        g.addArc(1, 0, 4);
        g.addArc(1, 2, 3);
        g.addArc(2, 3, 2);
        g.addArc(3, 1, -1);
        System.out.println(g);
        printMatrix(g.floydWarshall());


    }
}
