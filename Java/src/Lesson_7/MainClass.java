package Lesson_7;

public class MainClass {
    public static void main(String[] args) {

        Cat[] cats = new Cat[5];
        cats[0] = new Cat("Барсик", 5);
        cats[1] = new Cat("Фунтик", 7);
        cats[2] = new Cat("Черныш", 6);
        cats[3] = new Cat("Кролик", 10);
        cats[4] = new Cat("Пиздюк", 13);
        Plate plate = new Plate(20);
        plate.info();
        cats[0].eat(plate);
        cats[1].eat(plate);
        cats[2].eat(plate);
        cats[3].eat(plate);
        cats[4].eat(plate);
        cats[0].isWellFed();
        cats[1].isWellFed();
        cats[2].isWellFed();
        cats[3].isWellFed();
        cats[4].isWellFed();
        plate.addFood(20);
        cats[3].eat(plate);
        cats[4].eat(plate);
        cats[3].isWellFed();
        cats[4].isWellFed();
        plate.info();
        plate.addFood(1);
        plate.info();
        cats[4].eat(plate);
        cats[4].isWellFed();


    }
}

