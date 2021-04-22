package Lesson_9;

public class Main {
    public static void main(String[] args) throws Exception {
        String[][] arr = {{"1", "6", "2", "3"}, {"2", "3", "5", "3"}, {"5", "3", "4", "4"}, {"5", "df", "4", "4"}};
        checkSizeData(arr);

    }

    public static void checkSizeData(String[][] arr) throws MyArraySizeException {

        if (arr.length != arr[0].length) {
            throw new MyArraySizeException("Error SIZE");
        }
        if ((arr[0].length != 4) && (arr[1].length != 4) && (arr[2].length != 4) && (arr[3].length != 4)) {
            throw new MyArraySizeException("Error SIZE");
        }


        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                try {
                    sum = sum + Integer.parseInt(arr[i][j]);

                } catch (NumberFormatException e) {
                    System.out.println("Ячейка номер -" + i + " " + j);
                    throw new MyArrayDataException("Error DATA");

                }

            }

        }
        System.out.println("Сумма элементов массива -" + sum);

    }
}
