package com.ioansen.java.Person;

public interface Person extends Comparable<Person> {

    double calculMedieGenerala();

    String getNume();

    void setNume(String nume);

    void addMedie(double medie);

    @Override
    default int compareTo(Person o){
        int nameComp = this.getNume().compareTo(o.getNume());
        return nameComp == 0 ? Double.compare(o.calculMedieGenerala(), calculMedieGenerala()) : nameComp;
    }
}
