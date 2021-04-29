package Lesson_11;

import java.util.ArrayList;

public class Box<T> {
    public ArrayList<T> box;

    public Box(T...fruits) {
        box.add((T) fruits);
    }
}
