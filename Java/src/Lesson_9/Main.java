package Lesson_9;

public class Main {
    public static void main(String[] args)   {
        String[][] arr={{"1","2","2"},{"2","3","е"},{"5","3","4"}};
        System.out.println("сумма = "+ sumArr(arr));

    }

    public static int sumArr(String[][] arr)  {
        int sum =0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                try {
                    sum = sum + Integer.parseInt(arr[i][j]);

                }
                catch (MyArraySizeException e){
                    e.printStackTrace();
                }
            }

        }
        return sum;
    }
}
