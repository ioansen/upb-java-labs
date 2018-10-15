package com.ioansen.java.hset;

import java.util.Hashtable;

public class HSet extends Hashtable {

    //Adauga un element in multime, daca nu exista deja
    public boolean add(Object value){
        if (super.contains(value)) return false;
        super.put(value,value);
        return true;
    }
    //returneaza un String cu elementele multimii (doar cheile, nu perechi)
    public String toString(){
        StringBuilder result = new StringBuilder("[");

        for(Object o : super.values()){
            result.append(o).append(", ");
        }

        return result.append("]").toString();
    }
    //Sterge perechea corespunzatoare cheii, intorcand valoarea
    public Object remove(Object key){
        return super.remove(key);
    }
}
