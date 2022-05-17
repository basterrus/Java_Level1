package Lesson_2;

public class BasicStructures {


    public static void main(String[] args) {
        System.out.println(examinationSumNums(5, 6));
        positiveOrNegative(0);
        System.out.println(positiveOrNegativeBool( 6));
        printString("HelloWorld", 5);
        System.out.println(isLipYear(2020));
    }

    //1. �������� �����, ����������� �� ���� ��� ����� ����� � �����������,
    // ��� �� ����� ����� � �������� �� 10 �� 20 (������������),
    // ���� �� � ������� true, � ��������� ������ � false.

    static boolean examinationSumNums(float a, float b) {
        float sumNum = a + b;
        return 10 <= sumNum && sumNum <= 20;
    }

    //�������� �����, �������� � �������� ��������� ���������� ����� �����,
    // ����� ������ ���������� � �������, ������������� �� ����� �������� ��� �������������.
    // ���������: ���� ������� ������������� ������.

    static void positiveOrNegative(int num){
        if(num >= 0) {
            System.out.println("����� " + num + " �������������");
        } else {
            System.out.println("����� " + num + " �������������");
        }
    }

    //3. �������� �����, �������� � �������� ��������� ���������� ����� �����.
    // ����� ������ ������� true, ���� ����� �������������, � ������� false ���� �������������.

    static boolean positiveOrNegativeBool(int num){
        return num <= 0;
    }

    //4. �������� �����, �������� � �������� ���������� ���������� ������ � �����,
    // ����� ������ ���������� � ������� ��������� ������, ��������� ���������� ���;

    static void printString(String word, int num) {
        for (int i=0; i<num + 1; i++){
            System.out.print(word + " ");
        }
        System.out.println();
    }

    //5. * �������� �����, ������� ����������, �������� �� ��� ����������, � ���������� boolean
    // (���������� - true, �� ���������� - false). ������ 4-� ��� �������� ����������,
    // ����� ������� 100-��, ��� ���� ������ 400-� � ����������.

    static boolean isLipYear(int year) {
        return ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0));
    }
}




