package Lesson_11;

public class Main {


    public static void main(String[] args) {

        Apple apple1 = new Apple(5);
        Apple apple2 = new Apple(5);
        Apple apple3 = new Apple(10);
        Apple apple4 = new Apple(10);
        Orange orange1 = new Orange(10);
        Orange orange2 = new Orange(10);
        Box<Apple> appleBox1 = new Box<>(apple1, apple2);
        Box<Apple> appleBox2 = new Box<>(apple3, apple4);
       /* Box<Orange> OrangeBox= new Box<>(orange1,orange2);
        System.out.println(appleBox1.compare(OrangeBox));
        System.out.println(appleBox1.getWeight());
        System.out.println(OrangeBox.getWeight());*/
        System.out.println("до перемещения");
        System.out.println("вес 1ой коробки " + appleBox1.getWeight());
        System.out.println("вес 2ой коробки " + appleBox2.getWeight());
        appleBox1.replace(appleBox2, apple1);
        System.out.println("после перемещения");
        System.out.println("вес 1ой коробки " + appleBox1.getWeight());
        System.out.println("вес 2ой коробки " + appleBox2.getWeight());
        appleBox1.addFruit(new Apple(13));
        System.out.println("после добавления фрукта");
        System.out.println("вес 1ой коробки " + appleBox1.getWeight());

    }


}
