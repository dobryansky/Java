package Lesson_4;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static char[][] map;
    public static final int SIZE = 4;
    public static final int DOTS_TO_WIN = 3;
    public static final char DOT_EMPTY = '•';
    public static final char DOT_X = 'X';
    public static final char DOT_O = 'O';
    public static char finish ='Y';
    public static Scanner sc = new Scanner(System.in);
    public static Random rand = new Random();

    public static void main(String[] args) {
       do {
       initMap();
        printMap();
        while (true) {
            humanTurn();
            printMap();
            if (checkWin(DOT_X)) {
                System.out.println("Победил человек");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья");
                break;
            }
            aiTurn();
            printMap();
            if (checkWin(DOT_O)) {
                System.out.println("Победил Искуственный Интеллект");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья");
                break;
            }
        }
           System.out.println("Игра закончена");
           System.out.println("Сыграем ещё раз?  Y/N ");
           finish= sc.next().charAt(0);

        } while(finish=='Y'||finish=='y');
        sc.close();
    }


    public static void humanTurn() {
        int x, y;
        do {
            System.out.println("Ходит человек, введите координаты X,Y ");
            x = sc.nextInt() - 1;
            y = sc.nextInt() - 1;
        }
        while (isNotCellValid(x, y));
        map[y][x] = DOT_X;
    }

    public static void aiTurn() {
        int x, y;
        do {
            x = rand.nextInt(SIZE);
            y = rand.nextInt(SIZE);
        } while (isNotCellValid(x, y));
        System.out.println("Компьютер походил в точку " + (x + 1) + " " + (y + 1));
        map[y][x] = DOT_O;
    }

    public static boolean isMapFull() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == DOT_EMPTY) return false;
            }
        }
        return true;
    }

    public static boolean checkWin(char symb) {
        return (isGorizontal(symb)||isVertical(symb)||isDiagonal(symb));
    }

    public static boolean isGorizontal(char symb) {
        int k = 0;
        int win = 0;

        while (k < SIZE) {
            for (int i = 0; i < map.length; i++) {
                if (map[k][i] == symb) {
                    win++;
                    if (win == DOTS_TO_WIN) {
                        return true;
                    }
                }

            }
            win = 0;
            k++;
        }

        return false;
    }

    public static boolean isVertical(char symb) {
        int k = 0;
        int win = 0;
        while (k < SIZE) {
            for (int i = 0; i < map.length; i++) {
                if (map[i][k] == symb) {
                    win++;
                    if (win == DOTS_TO_WIN) {
                        return true;
                    }
                }
            }
            win = 0;
            k++;
        }

        return false;
    }

    public static boolean isDiagonal(char symb) {

        int winMain = 0;
        int winSide = 0;
        for (int i = 0; i < map.length; i++) {
            if (map[i][i] == symb) {
                winMain++;
                if (winMain == DOTS_TO_WIN) {
                    return true;
                }
            }

            if (map[map.length - i - 1][i] == symb) {
                winSide++;
                if (winSide == DOTS_TO_WIN) {
                    return true;
                }
            }


        }


        return false;
    }

    public static boolean isNotCellValid(int x, int y) {
        if (x < 0 || x >= SIZE || y < 0 || y >= SIZE) return true;
        if (map[y][x] == DOT_EMPTY) return false;
        return true;
    }

    public static void printMap() {
        for (int i = 0; i <= map.length; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i < map.length; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < map.length; j++) {

                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void initMap() {
        map = new char[SIZE][SIZE];
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map.length; j++) {
                map[i][j] = DOT_EMPTY;
            }
        }
    }


}
