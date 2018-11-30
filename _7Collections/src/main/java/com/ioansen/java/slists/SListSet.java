package com.ioansen.java.slists;

import java.util.*;

public class SListSet<E extends Comparable<? super E>> extends LinkedList<E> implements SortedSet<E> {

    private Comparator<? super E> comparator;

    public SListSet(Comparator<? super E> comparator) {
        this.comparator = comparator;
    }

    public SListSet() {
        comparator = null;
    }

    @Override
    public Comparator<? super E> comparator() {
        return comparator;
    }

    @Override
    public boolean add(E e) {
        // if size is 0 add the element
        if ( this.size() == 0) return super.add(e);

        //if set already contains element do not add it and return
        if (contains(e)) return false;


        Iterator<E> iterator = iterator();
        int index = 0;
        E current;

        /*since the set is sorted we just need to find the index of the
        first element bigger than the element we want to insert*/
        if ( comparator != null){
            while (iterator.hasNext()){
                current = iterator.next();
                if ( comparator.compare(current, e) > 0){
                    break;
                }
                index++;
            }
        }
        else {
            while (iterator.hasNext()){
                current = iterator.next();
                if ( current.compareTo(e) > 0){
                    break;
                }
                index++;

            }
        }

        /*then just add it there*/
        super.add(index, e);
        return true;
    }

    @Override
    public E first() throws NoSuchElementException {
        if (this.size() == 0) throw new NoSuchElementException("list is empty");
        return this.get(0);
    }

    @Override
    public E last() {
        if (this.size() == 0) throw new NoSuchElementException("list is empty");
        return this.get(size()-1);
    }

    @Override
    public SortedSet<E> subSet(E fromElement, E toElement) {
        SortedSet<E> subset = new SListSet<E>(comparator);

        Iterator<E> iterator = iterator();
        E current;

        /*iterate to fromElement*/
        while (iterator.hasNext()){
            if ( comparator.compare(iterator.next(), fromElement) == 0) {
                break;
            }
        }

        /*insert elements till toElement*/
        while (iterator.hasNext()){
            current = iterator.next();
            if ( comparator.compare(current, toElement) == 0) {
                subset.add(current);
            }
        }

        return subset;
    }

    @Override
    public SortedSet<E> headSet(E toElement) {
        SortedSet<E> subset = new SListSet<>();

        Iterator<E> iterator = iterator();
        E current;

        /*insert elements till toElement*/
        while (iterator.hasNext()){
            current = iterator.next();
            if ( comparator.compare(current, toElement) == 0) {
                subset.add(current);
            }
        }

        return subset;
    }

    @Override
    public SortedSet<E> tailSet(E fromElement) {
        SortedSet<E> subset = new SListSet<E>(comparator);

        Iterator<E> iterator = iterator();
        E current;

        /*iterate to fromElement*/
        while (iterator.hasNext()){
            current = iterator.next();
            if ( comparator.compare(current, fromElement) == 0) {
                break;
            }
        }

        /*insert the rest of the elements*/
        while (iterator.hasNext()){
            subset.add(iterator.next());
        }

        return subset;
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {

        for(E element: c){
            this.add(element);
        }

        return true;
    }
}
