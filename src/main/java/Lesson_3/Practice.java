package Lesson_3;

import java.util.Arrays;
import java.util.IntSummaryStatistics;

public class Practice {

    public static void main(String[] args) {
        replaceValueArray();
        System.out.println(""); // разграничиваем код дл€ читаемости
        fillArray();
        System.out.println("");
        multiplyArray();
        System.out.println("");
        doubleArray();
        System.out.println("");
        System.out.println(Arrays.toString(createArray(5, 10)));
        System.out.println("");
        minMaxValueArray();
        System.out.println("");


    }


    //1. «адать целочисленный массив, состо€щий из элементов 0 и 1.
    // Ќапример: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
    // — помощью цикла и услови€ заменить 0 на 1, 1 на 0;
    private static void replaceValueArray() {
        //инициализируем массив
        int[] array = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        //выводим первоначальный вариант
        System.out.println(Arrays.toString(array));

        //в цикле провер€ем на совпадение с единицей и мен€ем на ноль и наоборот
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 1) {
                array[i] = 0;
            } else {
                array[i] = 1;
            }
        }
        //выводим конечный вариант
        System.out.println(Arrays.toString(array));
    }

    //2. «адать пустой целочисленный массив длиной 100.
    // — помощью цикла заполнить его значени€ми 1 2 3 4 5 6 7 8 Е 100;

    private static void fillArray() {

        int[] array1 = new int[100];

        for (int i = 0; i < array1.length; i++) {
            array1[i] = i + 1; // индексы с нол€, а значени€ заполн€ем с единицы
        }
        System.out.println(Arrays.toString(array1));
    }


    //3. «адать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ]
    // пройти по нему циклом, и числа меньшие 6 умножить на 2;
    public static void multiplyArray() {
        //инициализируем массив
        int[] array2 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};

        //выводим первоначальный вариант
        System.out.println(Arrays.toString(array2));
        //¬ цикле проходим по каждому элементу и если он больше 6, то умножаем значение на 2
        for (int i = 0; i < array2.length; i++) {
            if (array2[i] >= 6) {
                array2[i] = array2[i] * 2;
            }
        }
        System.out.println(Arrays.toString(array2));
    }


    //4. —оздать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
    // и с помощью цикла(-ов) заполнить его диагональные элементы единицами
    // (можно только одну из диагоналей, если обе сложно).
    // ќпределить элементы одной из диагоналей можно по следующему принципу:
    // индексы таких элементов равны, то есть [0][0], [1][1], [2][2], Е, [n][n];

    public static void doubleArray() {

        int[][] doubleArray = new int[5][5];

        for (int i = 0; i < doubleArray.length; i++) {
            for (int j = 0; j < doubleArray[i].length; j++) {
                if (i == j || j == doubleArray.length - 1 - i) {
                    doubleArray[i][j] = 1;
                } else {
                    doubleArray[i][j] = 0;
                }
                System.out.printf("%3d", doubleArray[i][j]);
            }
            System.out.println();
        }
    }

    //5. Ќаписать метод, принимающий на вход два аргумента: len и initialValue
    // и возвращающий одномерный массив типа int длиной len, кажда€ €чейка которого равна initialValue;

    public static int[] createArray(int len, int initialValue) {
        int[] array = new int[len];

        for (int i = 0; i < len; i++) {
            array[i] = initialValue;
        }
        return array;
    }

    //6. * «адать одномерный массив и найти в нем минимальный и максимальный элементы;
    public static void minMaxValueArray() {
        int[] arrays = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        IntSummaryStatistics stat = Arrays.stream(arrays).summaryStatistics();
        System.out.println("Min value = " + stat.getMin());
        System.out.println("Max value = " + stat.getMax());
    }
}


