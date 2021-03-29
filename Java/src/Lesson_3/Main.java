package Lesson_3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        guessGame();
        wordQuiz();
    }


    public static void guessGame() {
        int trueAnswer = (int) (Math.random() * 10);
        Scanner scanner = new Scanner(System.in);
        int count = 3;
        int gameOver = 1;


        while (gameOver == 1) {
            count = 3;
            do {
                System.out.println(" Введите число от 0 до 9. У вас " + count + " попыток");
                int numberUser = scanner.nextInt();
                if (numberUser > trueAnswer) {
                    System.out.println("Вы ввели большое число!");
                    count--;
                } else if (numberUser < trueAnswer) {
                    System.out.println("Вы ввели маленькое число!");
                    count--;
                } else {
                    System.out.println("Вы угадали!!!");
                    break;
                }
                if (count == 0)
                    System.out.println("Вы проиграли!");
            } while (count > 0);

            System.out.println("Повторить игру еще раз? 1 – да / 0 – нет");
            gameOver = scanner.nextInt();
        }

    }


    public static void wordQuiz() {
        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado",
                "broccoli", "carrot", "cherry", "garlic", "grape", "melon",
                "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea",
                "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};

        char [] blur={'#','#','#','#','#','#','#','#','#','#','#','#','#','#','#'};

        String trueAnswer = words[(int) (Math.random() * words.length)];
        Scanner scanner = new Scanner(System.in);
        boolean gameover= false;

        do{
            System.out.println("Отгадайте слово!");
            String userWord = scanner.nextLine().toLowerCase();
            if (userWord.equals(trueAnswer)){
                System.out.println("Вы угадали!");
                gameover=true;
            }
            else {
                System.out.println("Вы не угадали");
if(userWord.length()>=trueAnswer.length())
                {
                    for (int i = 0; i < trueAnswer.length(); i++) {


                    if (trueAnswer.charAt(i) == userWord.charAt(i)) {
                        blur[i] = trueAnswer.charAt(i);
                    }
                }
            }
                else {

    for (int i = 0; i < userWord.length(); i++) {


        if (trueAnswer.charAt(i) == userWord.charAt(i)) {
            blur[i] = trueAnswer.charAt(i);
        }
    }
}
                for (char c : blur) {
                    System.out.print(c);
                }
                System.out.println();



            }

        }while(!gameover);
    }
}
