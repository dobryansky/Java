package Lesson_6;

public class Cat extends Animal {
    static int count;


    public Cat(String name) {
        super(name);
        Animal.count--;
        Cat.count++;

    }

    @Override
    public void run(int distance) {
        if (distance >= 0 && distance <= 200) {
            System.out.println("кот " + name + " бежит - " + distance + "м");
        } else System.out.println("Кот на такие расстояния не бегает");
    }

    @Override
    public void swim(int distance) {
        System.out.println("кот не любит плавать!!!");
    }
}
