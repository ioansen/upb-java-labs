package com.ioansen.java.mylist;

import java.util.HashMap;
import java.util.Map;

public class Graph {

    private Map<Integer, MyList> nodesAseLists = new HashMap<>();
    private int nrNodes;
    //not legit at all, dfs will only work once
    //either make resetVizitat(still not legit) method or make dfs non recursive
    private boolean[] vizitat;



    public Graph(int nrNodes){
        this.nrNodes = nrNodes;
        vizitat = new boolean[nrNodes];
        for(int i = 0; i < nrNodes; i++){
            nodesAseLists.put(i, new MyList());
            vizitat[i] = false;
        }
    }
    public void add(int x, int y){
        nodesAseLists.get(x).add(y);
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < nrNodes; i++){
            sb.append(i).append(':').append(nodesAseLists.get(i)).append('\n');
        }


        return sb.toString();
    }

    /*not very legit but w/e*/
    public void dfs(int x){

        MyList l = nodesAseLists.get(x);
        System.out.print(x + " ");
        vizitat[x] = true;

        if (l.size() != 0){
            for(int j = 0; j < l.size(); j++){
                int e = (Integer) l.get(j);
                if(!vizitat[e]) dfs(e);
            }
        }
    }
}
