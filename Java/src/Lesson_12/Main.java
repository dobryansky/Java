package Lesson_12;

import java.util.Arrays;

public class Main extends Thread {
    private static final int SIZE = 10_000_000;
    private static final int HALF = SIZE / 2;

    public static void main(String[] args) {
        Main o = new Main();
        o.calcOneThread();
        o.calcTwoThreads();
    }



    public void calcOneThread() {
        float[] arr = new float[SIZE];
        Arrays.fill(arr, 1.0f);
        long a = System.currentTimeMillis();
        arrCalc(arr);
        System.out.println("Время итераций в 1 потоке - " + (System.currentTimeMillis() - a));
    }

    public void calcTwoThreads() {
        float[] arr = new float[SIZE];
        float[] arr1 = new float[HALF];
        float[] arr2 = new float[HALF];
        Arrays.fill(arr, 1.0f);

        long a = System.currentTimeMillis();
        System.arraycopy(arr, 0, arr1, 0, HALF);
        System.arraycopy(arr, HALF, arr2, 0, HALF);

        new Thread(() -> {
            float[] a1 = arrCalc(arr1);
            System.arraycopy(a1, 0, arr1, 0, a1.length);
        }).start();

        new Thread(() -> {
            float[] a2 = arrCalc(arr2);
            System.arraycopy(a2, 0, arr2, 0, a2.length);
        }).start();

        System.arraycopy(arr1, 0, arr, 0, HALF);
        System.arraycopy(arr2, 0, arr, HALF, HALF);
        System.out.println("Время итераций в 2 потоках - " + (System.currentTimeMillis() - a));
    }
    public float[] arrCalc(float[] arr) {
        for (int i = 0; i < arr.length; i++)
            arr[i] = (float) (arr[i] * Math.sin(0.2f + arr[i] / 5) * Math.cos(0.2f + arr[i] / 5) * Math.cos(0.4f + arr[i] / 2));
        return arr;
    }


}
