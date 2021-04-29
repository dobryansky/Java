package Lesson_11;

public class Apple extends Fruit {
    int weight;
    public Apple(int weight) {
        this.weight=weight;
    }

    @Override
    public int getWeight() {
        return weight;
    }
}
