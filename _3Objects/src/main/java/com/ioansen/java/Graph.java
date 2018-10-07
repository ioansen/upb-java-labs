package com.ioansen.java;

import java.util.Arrays;

public class Graph {

    private static final int INFINITE = 9500;
    private final int[][] matrix;
    private final int nodes;

    public Graph(int nodes) {
        this.matrix = new int[nodes][nodes];
        for(int i = 0; i < nodes; i++){
            Arrays.fill(matrix[i], INFINITE);
        }
        this.nodes = nodes;
    }

    public int[][] getMatrix() {
        return matrix;
    }

    public int getSize() {
        return nodes;
    }


    /**Adds an arc to this graph
     * @param v arc origin
     * @param w arc destination
     * @param cost arc cost*/
    public void addArc(int v, int w, int cost){
        matrix[v][w] = cost;
    }

    /**Verifies if an arc is in this graph
     * @param v arc origin
     * @param w arc destination*/
    public boolean isArc(int v, int w){
        return !(matrix[v][w] == INFINITE);
    }

    @Override
    public String toString(){
        StringBuilder res = new StringBuilder();

        for ( int i = 0; i < nodes; i++){
            res.append(i).append(": ");
            for ( int j = 0 ; j < nodes; j++)
            {
                res.append(matrix[i][j]).append(' ');
            }
            res.append('\n');
        }

        return res.toString();
    }

    /**Floyd Warshall algorithm on this graph
     * @return a matrix containing the shortest paths*/
    public int[][] floydWarshall() {
        int result[][];
        result = new int[this.nodes][this.nodes];
        int k, i, j;
        for(i = 0; i < this.nodes; i++) {
            for(j = 0; j < this.nodes; j++) {
                if(i == j) {
                    result[i][j] = 0;
                } else if(this.isArc(i, j)) {
                    result[i][j] = this.matrix[i][j];
                } else {
                    result[i][j] = INFINITE;
                }
            }
        }
        for(k = 0; k < this.nodes; k++) {
            for(i = 0; i < this.nodes; i++) {
                for(j = 0; j < this.nodes; j++) {
                    int dist;
                    dist = result[i][k] + result[k][j];
                    if(result[i][j] > dist) {
                        result[i][j] = dist;
                    }
                }
            }
        }
        return result;
    }
}
