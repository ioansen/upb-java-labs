package com.ioansen.java.warrior;

import com.ioansen.java.warrior.warriors.MarshWarrior;
import com.ioansen.java.warrior.warriors.OgreWarrior;
import com.ioansen.java.warrior.warriors.SnakeWarrior;

import java.util.*;

public class WarriorPack {
    private Vector<Warrior> warriors ;

    public WarriorPack () {
        warriors = new Vector<>();
    }

    public void addWarrior(Warrior newWarrior) {
        warriors.add(newWarrior);
    }

    public Vector getWarriors() {
        return warriors ;
    }

    public int calculateDamage() {
        int damage = 0;
        for (Warrior w : warriors ) {
            damage += w.getDamage();
        }
        return damage;
    }

    public static void main(String[] args){

        WarriorPack warriorPack = new WarriorPack();
        warriorPack.addWarrior(new SnakeWarrior());
        warriorPack.addWarrior(new OgreWarrior());
        warriorPack.addWarrior(new MarshWarrior());

        System.out.println(warriorPack.calculateDamage());

    }
}