package Lesson_1;

public class HomeWorkApp {

    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }

    static void printThreeWords() {

        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");

    }

    static void checkSumSign() {
        int a = 10;
        int b = 5;
        float result = a + b;

        if (result < 0) {
            System.out.println("Сумма чисел отрицательная");
        } else {
            System.out.println("Сумма чисел положительная");
        }
    }

    static void printColor() {
        int value = 101;

        if (value <= 0) {
            System.out.println("Красный");
        } else if (0 < value && value <= 100) {
            System.out.println("Желтый");
        } else if (value > 100) {
            System.out.println("Зеленый");
        } else {
            System.out.println("Неправильный ввод");
        }
    }
    static void compareNumbers() {
        int a = 10;
        int b = 50;

        if (a > b) {
            System.out.println("a > b");
        } else {
            System.out.println("a < b");
        }
    }
}