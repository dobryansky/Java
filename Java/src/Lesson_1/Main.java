package Lesson_1;

public class Main {
    byte a=4;
    short b=7;
    int c=4;
    long d =5;
    double e=3444;
    float f= 23.2f;
    char g='f';
    boolean isA =true;


    public static void main(String[] args) {
        System.out.println(calc(2,3,4,5));
        System.out.println(isRange1020(5,7));
        number(4);
        System.out.println(isNegative(-4));
        name("Артём");
        isLeapYear(4);

    }

    public static float calc (float a,float b,float c,float d ){
        return (a * (b + (c / d)));
    }

    public static boolean isRange1020 (int a,int b){
        return ((a + b) > 10) && ((a + b) <= 20);

    }

    public static void number (int a){
        if(a>=0){
            System.out.println("Positive");
        }
        else{
            System.out.println("Negative");
        }

    }
    public static boolean isNegative(int a){
       return a < 0;
    }

    public static void name (String name){
        System.out.println("Привет,"+name);
    }

    public static void isLeapYear (int year){
        if (year%4 != 0){
            System.out.println("Обычный");
        }
        else
        if (year%100 == 0 && year%400 != 0){
            System.out.println("Обычный");
        }
        else System.out.println("Високосный");
    }
}
