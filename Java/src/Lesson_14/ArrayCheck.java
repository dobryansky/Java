package Lesson_14;

public class ArrayCheck {

    public static void main(String[] args) {
        ArrayCheck arrayCheck = new ArrayCheck();

        System.out.println(arrayCheck.check(new int[]{4, 4, 4, 4, 4, 4}));
    }

    public boolean check(int[] arr) {
        boolean result = false;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 1 && arr[i] != 4) {
                result = false;
                break;
            } else if (sum == arr[i] * arr.length) {
                result = false;
            } else result = true;


        }
        return result;
    }


}
