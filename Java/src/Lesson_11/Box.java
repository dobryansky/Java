package Lesson_11;

import java.util.ArrayList;
import java.util.Collections;

public class Box<T extends Fruit> {
    private ArrayList<T> list;
    public T[] fruits;

    public ArrayList<T> getList() {
        return list;
    }

    public Box(T... fruits) {
        this.fruits = fruits;
        list = new ArrayList<>();
        Collections.addAll(list, fruits);
    }

    public int getWeight() {
        int weight = 0;
        for (int i = 0; i < this.list.size(); i++) {
            weight = weight + this.list.get(i).getWeight();
        }
        return weight;

    }

    public boolean compare(Box<?> anotherBox) {
        return this.getWeight() == anotherBox.getWeight();
    }

    public boolean replace(Box<T> anotherBox, T fruit) {
        for (int i = 0; i < this.list.size(); i++) {
            if (this.list.get(i) == fruit) {
                this.list.remove(fruit);
                anotherBox.list.add(fruit);
                return true;
            }

        }
        return false;
    }

    public boolean addFruit(T fruit) {
        return this.list.add(fruit);
    }
}
