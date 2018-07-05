package com.company;

import sun.reflect.generics.tree.Tree;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
	Elka elka = new Elka();
	Elkaball elkaball1  = new Elkaball("Blue",15);
        Elkaball elkaball2  = new Elkaball("Red",10);
        Elkaball elkaball3  = new Elkaball("Green",20);
        Elkaball elkaball4  = new Elkaball("Yellow",25);
        Elkaball elkaball5  = new Elkaball("Orange",30);
        List<Elkaball>elkaballs  = new ArrayList<>();
        elkaballs.add(elkaball1);
        elkaballs.add(elkaball2);
        elkaballs.add(elkaball3);
        elkaballs.add(elkaball4);
        elkaballs.add(elkaball5);
        int count = elka.getCountBlueBall(elkaballs);
        System.out.println(count);
        for (Elkaball e : elkaballs){
            e.compareTo(e);
        }

        Comparator<Elkaball> elkaballComparator  = new Comparator<Elkaball>() {
            @Override
            public int compare(Elkaball o1, Elkaball o2) {
                return Integer.compare(o1.getCircle(),o2.getCircle());

            }
        };
        TreeSet anotherElkaBalls = new TreeSet<>(elkaballComparator);
        anotherElkaBalls.add(elkaball1);
        anotherElkaBalls.add(elkaball2);
        anotherElkaBalls.add(elkaball3);
        anotherElkaBalls.add(elkaball4);
        anotherElkaBalls.add(elkaball5);



    }

}
