package Lesson_7;

public class Cat {
    private String name;
    private int appetite;
    private boolean wellFed;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }

    public boolean isWellFed() {
        if (wellFed) System.out.println(name + "- сыт");
        else System.out.println(name + "- голоден");
        return wellFed;
    }


    public void eat(Plate p) {
        if (appetite <= p.getFood()) {
            p.decreaseFood(appetite);
            wellFed = true;
        } else {
            System.out.println("в тарелке не хватает еды");
            wellFed = false;
        }
    }

}