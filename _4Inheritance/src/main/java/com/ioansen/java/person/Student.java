package com.ioansen.java.person;

import java.util.Vector;

public class Student extends PersonImpl{

    private Vector<String> courses = new Vector<>();
    private Vector<Double> grades = new Vector<>();

    public Student(String name, String address) {
        super(name, address);
    }

    public void printGrades(){
        System.out.println(grades);
    }

    public void addCourseGrade(String course, double grade){
        courses.add(course);
        grades.add(grade);
    }


    public double getAverageGrade(){
        double average = 0.0;
        for(Double grade: grades){
            average += grade;
        }

        return average/grades.size();
    }

    @Override
    public String toString(){
        return "Student " + this.getName() + " @" + this.getAddress();
    }
}
