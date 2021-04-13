package Lesson_6;

public class Dog extends Animal {
    static int count;

    public Dog(String name) {
        super(name);
        Animal.count--;
        Dog.count++;
    }

    @Override
    public void run(int distance) {
        if (distance >= 0 && distance <= 500) {
            System.out.println("Собака " + name + " бежит - " + distance + "м");
        } else System.out.println("Собака на такие расстояния не бегает");
    }

    @Override
    public void swim(int distance) {
        if (distance >= 0 && distance <= 10) {
            System.out.println("Собака " + name + " плывёт - " + distance + "м");
        } else System.out.println("Собака на такие расстояния не плавает");
    }
}
