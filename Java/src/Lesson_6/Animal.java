package Lesson_6;

public class Animal {
    String name;
    static int count;


    public Animal(String name) {
        this.name = name;
        count++;
    }

    public void run(int distance) {
        System.out.println("Животное " + name + " бежит - " + distance + "м");
    }

    public void swim(int distance) {
        System.out.println("Животное " + name + " плывёт - " + distance + "м");
    }


    public static void main(String[] args) {
        Animal animal1 = new Animal("Оно");
        Animal animal2 = new Animal("Оно");
        Animal animal3 = new Animal("Оно");
        Cat cat1 = new Cat("Барсик");
        Dog dog1 = new Dog("Шарик");
        Dog dog2 = new Dog("Бобик");
        cat1.run(12);
        dog1.run(24);

        System.out.println("Объектов животных - " + Animal.count);
        System.out.println("Объектов котов - " + Cat.count);
        System.out.println("Объектов собак - " + Dog.count);

    }

}

