package Lesson_3;

import java.util.Arrays;
import java.util.IntSummaryStatistics;

public class Practice {

    public static void main(String[] args) {
        replaceValueArray();
        System.out.println(""); // �������������� ��� ��� ����������
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


    //1. ������ ������������� ������, ��������� �� ��������� 0 � 1.
    // ��������: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
    // � ������� ����� � ������� �������� 0 �� 1, 1 �� 0;
    private static void replaceValueArray() {
        //�������������� ������
        int[] array = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        //������� �������������� �������
        System.out.println(Arrays.toString(array));

        //� ����� ��������� �� ���������� � �������� � ������ �� ���� � ��������
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 1) {
                array[i] = 0;
            } else {
                array[i] = 1;
            }
        }
        //������� �������� �������
        System.out.println(Arrays.toString(array));
    }

    //2. ������ ������ ������������� ������ ������ 100.
    // � ������� ����� ��������� ��� ���������� 1 2 3 4 5 6 7 8 � 100;

    private static void fillArray() {

        int[] array1 = new int[100];

        for (int i = 0; i < array1.length; i++) {
            array1[i] = i + 1; // ������� � ����, � �������� ��������� � �������
        }
        System.out.println(Arrays.toString(array1));
    }


    //3. ������ ������ [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ]
    // ������ �� ���� ������, � ����� ������� 6 �������� �� 2;
    public static void multiplyArray() {
        //�������������� ������
        int[] array2 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};

        //������� �������������� �������
        System.out.println(Arrays.toString(array2));
        //� ����� �������� �� ������� �������� � ���� �� ������ 6, �� �������� �������� �� 2
        for (int i = 0; i < array2.length; i++) {
            if (array2[i] >= 6) {
                array2[i] = array2[i] * 2;
            }
        }
        System.out.println(Arrays.toString(array2));
    }


    //4. ������� ���������� ��������� ������������� ������ (���������� ����� � �������� ����������),
    // � � ������� �����(-��) ��������� ��� ������������ �������� ���������
    // (����� ������ ���� �� ����������, ���� ��� ������).
    // ���������� �������� ����� �� ���������� ����� �� ���������� ��������:
    // ������� ����� ��������� �����, �� ���� [0][0], [1][1], [2][2], �, [n][n];

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

    //5. �������� �����, ����������� �� ���� ��� ���������: len � initialValue
    // � ������������ ���������� ������ ���� int ������ len, ������ ������ �������� ����� initialValue;

    public static int[] createArray(int len, int initialValue) {
        int[] array = new int[len];

        for (int i = 0; i < len; i++) {
            array[i] = initialValue;
        }
        return array;
    }

    //6. * ������ ���������� ������ � ����� � ��� ����������� � ������������ ��������;
    public static void minMaxValueArray() {
        int[] arrays = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        IntSummaryStatistics stat = Arrays.stream(arrays).summaryStatistics();
        System.out.println("Min value = " + stat.getMin());
        System.out.println("Max value = " + stat.getMax());
    }
}


