package Lesson_2;

public class BasicStructures {


    public static void main(String[] args) {
        System.out.println(examinationSumNums(5, 6));
        positiveOrNegative(0);
        System.out.println(positiveOrNegativeBool( 6));
        printString("HelloWorld", 5);
        System.out.println(isLipYear(2020));
    }

    //1. Написать метод, принимающий на вход два целых числа и проверяющий,
    // что их сумма лежит в пределах от 10 до 20 (включительно),
    // если да – вернуть true, в противном случае – false.

    static boolean examinationSumNums(float a, float b) {
        float sumNum = a + b;
        return 10 <= sumNum && sumNum <= 20;
    }

    //Написать метод, которому в качестве параметра передается целое число,
    // метод должен напечатать в консоль, положительное ли число передали или отрицательное.
    // Замечание: ноль считаем положительным числом.

    static void positiveOrNegative(int num){
        if(num >= 0) {
            System.out.println("Число " + num + " положительное");
        } else {
            System.out.println("Число " + num + " отрицательное");
        }
    }

    //3. Написать метод, которому в качестве параметра передается целое число.
    // Метод должен вернуть true, если число отрицательное, и вернуть false если положительное.

    static boolean positiveOrNegativeBool(int num){
        return num <= 0;
    }

    //4. Написать метод, которому в качестве аргументов передается строка и число,
    // метод должен отпечатать в консоль указанную строку, указанное количество раз;

    static void printString(String word, int num) {
        for (int i=0; i<num + 1; i++){
            System.out.print(word + " ");
        }
        System.out.println();
    }

    //5. * Написать метод, который определяет, является ли год високосным, и возвращает boolean
    // (високосный - true, не високосный - false). Каждый 4-й год является високосным,
    // кроме каждого 100-го, при этом каждый 400-й – високосный.

    static boolean isLipYear(int year) {
        return ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0));
    }
}




