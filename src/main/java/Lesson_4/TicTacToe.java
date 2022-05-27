package Lesson_4;

import java.util.Random;
import java.util.Scanner;

public class TicTacToe {


    private static final int FIELD_SIZE = 3;
    private static final int DOTS_TO_WIN = 3;

    private static final String FIRST_SYMBOL_HEADER_TABLE = "*";
    private static final String SPACE = " ";
    private static final char DOT_EMPTY = '•';
    private static final char DOT_HUMAN = 'X';
    private static final char DOT_COMPUTER = 'O';

    private static char[][] MAP = new char[FIELD_SIZE][FIELD_SIZE];

    private static int turnsCount = 0;

    private static Scanner dot_variant = new Scanner(System.in);
    private static Random random = new Random();


    public static void main(String[] args) {
        //Инициализация игры
        initFieldMap();         //Инициализация игрового поля
        printHeaderMap();       //Заполнение шапки игрового поля
        printFieldsMap();       //Заполнение значений поля
        gameProcess();
    }


    private static void initFieldMap() {

        for (int i = 0; i < FIELD_SIZE; i++) {
            for (int j = 0; j < FIELD_SIZE; j++) {
                MAP[i][j] = DOT_EMPTY;
            }
        }

    }


    private static void printHeaderMap() {
        System.out.print(FIRST_SYMBOL_HEADER_TABLE + SPACE);
        for (int i = 0; i < FIELD_SIZE; i++) {
            System.out.print(i + 1 + SPACE);

        }
        System.out.println();
    }

    private static void printFieldsMap() {
        // Заполняем поле пустыми значениями
        for (int i = 0; i < FIELD_SIZE; i++) {
            System.out.print(i + 1 + SPACE);
            for (int j = 0; j < FIELD_SIZE; j++) {
                System.out.print(MAP[i][j] + SPACE);
            }
            System.out.println();
        }
    }

    private static void gameProcess() {
        while (true) {
            humanTorn();
            printHeaderMap();
            printFieldsMap();
            if (result(DOT_HUMAN)) {
                break;
            }

            computerTurn();
            printHeaderMap();
            printFieldsMap();
            if (result(DOT_COMPUTER)) {
                break;
            }
        }
    }

    private static boolean result(char symbol) {
        if (isWin(MAP, 'X')) {
            System.out.println("Вы выиграли!");
            return true;
        }
        if (isWin(MAP, 'O')) {
            System.out.println("Вы Проиграли!");
            return true;
        }
        if (checkDraw()) {
            System.out.println("Ничья!");
            return true;
        }
        return false;
    }

    private static boolean checkDraw() {
        return turnsCount >= FIELD_SIZE * FIELD_SIZE;
    }

    private static boolean isCellFree(int row, int column) {
        return MAP[row][column] == DOT_EMPTY;
    }

    private static boolean correctInput(int row, int column) {
        return row > FIELD_SIZE && column > FIELD_SIZE;
    }

    private static void humanTorn() {
        int row;
        int column;
        System.out.println("ВАШ ХОД! ");

        while (true) {
            do {
                System.out.println("ВВЕДИТЕ КООРДИНАТУ СТРОКИ: ");
                row = dot_variant.nextInt() - 1;

                System.out.println("ВВЕДИТЕ КООРДИНАТУ СТОЛБЦА: ");
                column = dot_variant.nextInt() - 1;
            } while (correctInput(row, column));

            if (isCellFree(row, column)) {
                break;
            }

            System.out.printf("Ячейка с координатами : %d:%d уже занята%n", row + 1, column + 1);
        }
        MAP[row][column] = DOT_HUMAN;
        turnsCount += 1;
    }

    private static void computerTurn() {
        int row;
        int column;
        System.out.println("ХОД КОМПЬЮТЕРА! ");

        do {
            row = random.nextInt(FIELD_SIZE);
            column = random.nextInt(FIELD_SIZE);
            if (isCellFree(row, column)) {
                break;
            }
        } while (!isCellFree(row, column));

        MAP[row][column] = DOT_COMPUTER;
        turnsCount += 1;
    }

    static boolean isWin(char[][] field, char dot) {

        // Проверка по горизонтали
        for (int i = 0; i < field.length; i++) {
            if (field[i][0] == dot && field[i][1] == dot && field[i][2] == dot) {
                return true;
            }
        }

        // Проверка по вертикали
        for (int i = 0; i < field.length; i++) {
            if (field[0][i] == dot && field[1][i] == dot && field[2][i] == dot) {
                return true;
            }
        }

        // Проверка в диагоналях
        if (field[0][0] == dot && field[1][1] == dot && field[2][2] == dot) {
            return true;
        }
        if (field[0][2] == dot && field[1][1] == dot && field[2][0] == dot) {
            return true;
        }

        return false;
    }

}
