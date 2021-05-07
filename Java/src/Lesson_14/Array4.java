package Lesson_14;

import java.util.Arrays;

public class Array4 {

    public static void main(String[] args) {
        Array4 array4 = new Array4();
        // System.out.println(Arrays.toString(array4.changeArr(new int[]{1, 1, 1, 1, 4, 5, 6, 7, 8})));
        int[] arr = array4.changeArr(new int[]{1, 1, 4, 1, 3, 5, 6, 7, 8});
        System.out.println(Arrays.toString(array4.changeArr(new int[]{1, 1, 4, 1, 3, 5, 6, 7, 8})));
    }


    public int[] changeArr(int[] arr) {
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 4) {
                index = i;
            }
        }
        if (index == -1) {
            throw new RuntimeException();
        }
        return Arrays.copyOfRange(arr, index + 1, arr.length);

    }
}
