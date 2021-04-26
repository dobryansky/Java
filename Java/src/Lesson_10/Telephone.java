package Lesson_10;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Telephone {
    private HashMap<String, ArrayList<Integer>> catalog=new HashMap<>();
    private ArrayList<Integer> contacts=new ArrayList<>();
    public void add(String name, int number) {
        contacts.add(number);
        catalog.put(name, contacts);
    }

    public void get(String name) {

        System.out.println(catalog.get(name));
    }

    public static void main(String[] args) {
        Telephone telephone = new Telephone();
        telephone.add("Иванов",47848484);
        telephone.add("Иванdgdов",478448484);
        telephone.add("Иванgegов",47843284);
        telephone.add("Ива454нов",345453);
        telephone.add("Иванов",555555);
        telephone.get("Иванов");
    }


}
