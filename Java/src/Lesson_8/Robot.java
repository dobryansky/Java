package Lesson_8;

public class Robot implements Runnable,Jumpable {
    private int  jumpDistance;
    private int  runDistance;

    public Robot(int jumpDistance, int runDistance) {
        this.jumpDistance = jumpDistance;
        this.runDistance = runDistance;
    }

    public int getJumpDistance() {
        return jumpDistance;
    }

    public void setJumpDistance(int jumpDistance) {
        this.jumpDistance = jumpDistance;
    }

    public int getSwimDistance() {
        return runDistance;
    }

    public void setSwimDistance(int swimDistance) {
        this.runDistance = swimDistance;
    }


    @Override
    public void jump(Wall wall) {
        if (wall.height>this.jumpDistance){
            System.out.println("Робот не перепрыгнул");
        }
        else {
            System.out.println("Робот перепрыгнул");
        }
    }




    @Override
    public void run(Track track) {
        if (track.length>this.runDistance){
            System.out.println("Робот не пробежал");
        }
        else {
            System.out.println("Робот пробежал");
        }

    }
}
