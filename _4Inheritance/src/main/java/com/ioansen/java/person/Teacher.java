package com.ioansen.java.person;

import java.util.Vector;

public class Teacher extends PersonImpl {

    private Vector<String> courses = new Vector<>();

    public Teacher(String name, String address) {
        super(name, address);
    }

    @Override
    public String toString(){
        return "Teacher " + this.getName() + " @" + this.getAddress();
    }

    public boolean addCourse(String course){
        if ( courses.contains(course)) return false;
        return courses.add(course);
    }

    public boolean removeCourse(String course){
        return courses.remove(course);
    }
}
