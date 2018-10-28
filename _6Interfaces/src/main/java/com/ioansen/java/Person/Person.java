package com.ioansen.java.Person;

public interface Person extends Comparable<Person> {

    double calculMedieGenerala();

    String getNume();

    void setNume(String nume);

    void addMedie(double medie);

    @Override
    default int compareTo(Person o){
        int nameComp = this.getNume().compareTo(o.getNume());
        if(nameComp != 0)
            return nameComp;
        int medieComp = Double.compare(this.calculMedieGenerala(), o.calculMedieGenerala());
        return  -medieComp;
    }
}
