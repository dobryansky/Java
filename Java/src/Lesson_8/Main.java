package Lesson_8;

public class Main {
    public static void main(String[] args) {

        Object[] obstacles = new Object[5];
        Object[] members = new Object[5];
        members[0] = new Cat(randMeter(), randMeter());
        members[1] = new Robot(randMeter(), randMeter());
        members[2] = new Human(randMeter(), randMeter());
        members[3] = new Cat(randMeter(), randMeter());
        members[4] = new Human(randMeter(), randMeter());
        obstacles[0] = new Track(100);
        obstacles[1] = new Wall(100);
        obstacles[2] = new Track(100);
        obstacles[3] = new Wall(100);
        obstacles[4] = new Track(100);


        for (int i = 0; i < members.length; i++) {

                if (members[i] instanceof Cat) {
                    for (int j = 0; j < obstacles.length; j++) {
                        if (obstacles[j] instanceof Track) {
                            ((Cat) members[i]).run((Track) obstacles[j]);
                        } else {
                            ((Cat) members[i]).jump((Wall) obstacles[j]);
                        }
                    }

                }
                if (members[i] instanceof Robot) {
                    for (int j = 0; j < obstacles.length; j++) {
                        if (obstacles[j] instanceof Track) {
                            ((Robot) members[i]).run((Track) obstacles[j]);
                        } else {
                            ((Robot) members[i]).jump((Wall) obstacles[j]);
                        }
                    }
                }
                if (members[i] instanceof Human) {
                    for (int j = 0; j < obstacles.length; j++) {
                        if (obstacles[j] instanceof Track) {
                            ((Human) members[i]).run((Track) obstacles[j]);
                        } else {
                            ((Human) members[i]).jump((Wall) obstacles[j]);
                        }
                    }
                }

            }

        }



    public static int randMeter() {
        return (int) (1 + Math.random() * 30);
    }
}
