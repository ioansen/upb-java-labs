package com.ioansen.java.warrior;

public class WarriorImpl implements Warrior {

    private final String name;
    private int health;
    private int damage;

    public WarriorImpl(String name, int health, int damage) {
        this.name = name;
        this.health = health;
        this.damage = damage;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    @Override
    public  int getDamage(){
        return damage;
    }

    @Override
    public int getHealth() {
        return health;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String toString(){
        return "Warrior -> name: " + getName() + " health: " + getHealth() + " damage: " + getDamage();
    }
}
