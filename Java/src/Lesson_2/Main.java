package Lesson_2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr1 = {1, 1, 1, 1, 0, 0, 0, 0};
        invertArray(arr1);
        int[] arr2 = new int[8];
        fillArray(arr2);
        int[] arr3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        changeArray(arr3);

        int[][] arr4 = {
                {0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0}

        };
        fillDiagonal(arr4);
        int[] arr5 = {1, 2, 3, 0, 45, 12, 34, 11};
        findMaxMin(arr5);
        int[] arr6 = {1, 1, 1, 1, 1, 5};
        System.out.println(findSumEqual(arr6));
        int[] arr7 = {1, 2, 3, 4, 5};
        shiftArray(arr7, -4);

        int[] arr8 = {1, 2, 3, 4, 5};
        shiftArray(arr8, 3);

    }

    public static void invertArray(int[] arr) {

        if (!isArrayEmpty(arr)) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == 0) {
                    arr[i] = 1;
                } else {
                    arr[i] = 0;
                }

            }
            System.out.println(Arrays.toString(arr));
        } else {
            System.out.println("Вы ввели пустой массив!");
        }

    }

    public static void fillArray(int[] arr) {

        if (!isArrayEmpty(arr)) {
            for (int i = 1; i < arr.length; i++) {
                arr[i] = arr[i - 1] + 3;
            }
            System.out.println(Arrays.toString(arr));
        } else {
            System.out.println("Вы ввели пустой массив!");
        }
    }

    public static void changeArray(int[] arr) {

        if (!isArrayEmpty(arr)) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] < 6) {
                    arr[i] = arr[i] * 2;
                }
            }
            System.out.println(Arrays.toString(arr));
        } else {
            System.out.println("Вы ввели пустой массив!");
        }
    }

    public static void fillDiagonal(int[][] arr) {
        if (isSymmetric(arr)) {
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr.length; j++) {
                    if (i == j) {
                        arr[i][j] = 1;
                    }
                    if (i == arr.length - 1 - j) {
                        arr[i][j] = 1;
                    }
                    System.out.print(arr[i][j] + "\t");

                }
                System.out.println();
            }
        } else {
            System.out.println(" Массив несимметричный");
        }

    }

    public static void findMaxMin(int[] arr) {
        int max = arr[0];
        int min = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("Max = " + max);
        System.out.println("Min = " + min);

    }

    public static boolean findSumEqual(int[] arr) {
        int sum = 0;
        int halfSum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        for (int i = 0; i < arr.length; i++) {
            halfSum = halfSum + arr[i];
            if (halfSum == ((double) sum / 2)) {
                return true;
            }

        }
        return false;
    }

// положительное n - сдвиг вправо
// отрицательное n -  сдвиг влево
    public static void shiftArray(int[] arr, int n) {

        if (!isArrayEmpty(arr)) {
            System.out.println("исходный");
            System.out.println(Arrays.toString(arr));
            int tempRight = arr[arr.length - 1];
            int tempLeft = arr[0];
            if (n > 0) {

                for (int j = 0; j < n; j++) {
                    for (int i = arr.length - 1; i >= 0; i--) {
                        if (i == 0) {
                            arr[0] = tempRight;
                        } else {
                            arr[i] = arr[(i - 1) % arr.length];
                        }

                    }
                    tempRight = arr[arr.length - 1];
                }
            } else if (n < 0) {
                for (int j = 0; j < Math.abs(n); j++) {
                    for (int i = 0; i < arr.length; i++) {

                        if (i == arr.length-1) {
                            arr[i] = tempLeft;
                        } else {
                            arr[i] = arr[(i + 1) % arr.length];
                        }
                    }
                    tempLeft = arr[0];
                }

            }

            System.out.println("сдвинутый, n= "+n);
            System.out.println(Arrays.toString(arr));

        } else {
            System.out.println("Вы ввели пустой массив!");
        }





    }


    public static boolean isArrayEmpty(int[] array) {
        return array.length == 0;
    }

    private static boolean isSymmetric(int[][] arr) {
        return arr.length == arr[0].length;
    }
}

