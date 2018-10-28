package com.ioansen.java.Person;

import java.util.Collections;
import java.util.Vector;
import java.util.concurrent.ThreadLocalRandom;

public class Student implements Person {

    private String nume;
    private Vector<Double> medii;

    public Student(String nume) {
        this.nume = nume;
        medii = new Vector<>();
    }

    @Override
    public String getNume() {
        return nume;
    }

    @Override
    public void setNume(String nume) {
        this.nume = nume;
    }

    @Override
    public void addMedie(double medie) {
        medii.add(medie);
    }

    @Override
    public double calculMedieGenerala() {
        double sum = 0;

        for( Double medie : medii){
            sum += medie;
        }

        return sum/medii.size();
    }

    @Override
    public String toString(){
        return String.format("Student %s medie: %.2f%n", getNume(), calculMedieGenerala());
    }

    public static void main(String[] args){
        Vector<Person> persons = new Vector<>();

        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        ThreadLocalRandom r = ThreadLocalRandom.current();

        for ( int i = 0; i < 40; i++){
            Person person = new Student(String.valueOf(alphabet.charAt(r.nextInt(alphabet.length()))));
            for ( int j = 0; j < 10; j++){
                person.addMedie(r.nextDouble(10));
            }
            persons.add(person);
        }

        System.out.println(persons);
        Collections.sort(persons);
        System.out.println(persons);

    }
}
