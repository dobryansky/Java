package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;

public class Cat {

    private String name;

    public Cat(String name) {
        this.name = name;
    }

    public static void main(String[] args) {


        HashSet<Integer> cat2= new HashSet<>();
        cat2.add(1);
        cat2.add(2);
        cat2.add(3);
        cat2.add(4);
        cat2.add(5);
        cat2.add(6);
        cat2.add(7);
        cat2.add(124464567);
        cat2.add(56463567);
        cat2.add(656464567);
        for(Integer cat:cat2)
            System.out.println(cat);

    }


}