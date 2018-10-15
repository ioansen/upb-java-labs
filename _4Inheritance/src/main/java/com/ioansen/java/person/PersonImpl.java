package com.ioansen.java.person;

public class PersonImpl implements Person {

    private String name;
    private String address;

    public PersonImpl(String name, String address) {
        this.name = name;
        this.address = address;
    }

    @Override
    public String getName() {
        return name;
    }


    @Override
    public String getAddress() {
        return address;
    }

    @Override
    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString(){
        return "Person: " + name + " @" + address;
    }
}
