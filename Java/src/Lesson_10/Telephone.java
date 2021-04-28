package Lesson_10;


import java.util.*;

public class Telephone {
    private HashMap<String, Set<Integer>> catalog = new HashMap<>();

    public void add(String name, int number) {
        HashSet<Integer> contacts = new HashSet<>();
        contacts.add(number);
        if (catalog.containsKey(name)) {
            catalog.get(name).addAll(contacts);
        } else {
            catalog.put(name, contacts);
        }

    }


    public void get(String name) {
        System.out.println(name+", номера телефонов :");
        for (Integer integer : catalog.get(name)) {
            System.out.println(integer);
        }
    }

    public static void main(String[] args) {
        Telephone telephone = new Telephone();
        telephone.add("Иванов", 111111);
        telephone.add("Петров", 222222);
        telephone.add("Петров", 333333);
        telephone.add("Петров", 444444);
        telephone.add("Иванов", 555555);
        telephone.add("Иванов", 6666666);
        telephone.get("Петров");
    }


}
