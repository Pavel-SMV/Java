package Seminar_1;

import java.util.Arrays;

import static java.util.Arrays.deepToString;

public class Seminar_1_HW {
    public static void main(String[] args) {
        System.out.println(isSumBetween10And20(5, 20)); // true
        System.out.println(isSumBetween10And20(7, 15)); // false

        System.out.println(isPositive(5)); // true
        System.out.println(isPositive(-3)); // false
        System.out.println(isLeapYear(2001));
        printString("abcd", 5); // abcdabcdabcdabcdabcd
        System.out.println();
        System.out.println(Arrays.toString(createArray(10, 5)));
        System.out.println();
        int[]array_1 = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        System.out.println(Arrays.toString(ExchangeSymbol(array_1)));
        System.out.println();
        int[] array_2 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
        System.out.println(Arrays.toString(NumberSixExchange(array_2)));
        System.out.println();
        int[][] array_3 = new int[4][4]; // [[1, 0, 0, 0], [0, 1, 0, 0], [0, 0, 1, x], [0, 0, 0, 1]]
        System.out.println(QwatrArray(array_3));
        //int x = array[2][3];


    }

    /**
     * 1. Написать метод, принимающий на вход два целых числа и проверяющий,
     * что их сумма лежит в пределах от 10 до 20 (включительно), если да – вернуть true, в противном случае – false.
     */
    private static boolean isSumBetween10And20(int a, int b) {
        int num = (a + b);
        if (10 <= num && num <= 20) {
            return true;
        } else {

            return false;
        }
    }

    private static boolean isPositive(int x) {
        if (x > 0) {
            return true;
        } else {

            return false;
        }
    }

    private static void printString(String source, int repeat) {
        // напечатать строку source repeat раз
        int i = 0;
        while (i < repeat) {
            System.out.print(source + " ");
            i++;
        }
    }

    private static boolean isLeapYear(int year) {
        // проверить, является ли год високосным. если да - return true
        if ((year % 400 == 0) ||
                (year % 4 == 0 && year % 100 != 0)) {
            return true;
        } else {
            return false;

        }


    }

    private static int[] createArray(int len, int initalValue) {
        // должен вернуть массив длины len, каждое значение которого равно initialValue
        int[] array = new int[len];
        for (int i = 0; i < array.length; i++) {
            array[i] = initalValue;}

        return array;
        }
    //* 1. Задать целочисленный массив, состоящий из элементов 0 и 1.
    // * Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;

    private static int[] ExchangeSymbol(int[] array){
        int[] array_1 = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        int [] newArray = new int[array_1.length];
        for (int i = 0;i<array_1.length;i++){
            if (array_1[i] == 0){
                newArray[i] = 1;
            }
            else {
                newArray[i] = 0;
            }

        }
        System.out.println(Arrays.toString(array_1));
        return newArray;
    }




   //* 2. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;

    private static int[] NumberSixExchange(int[] array) {
        int[] array_2 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        int[] newArray = new int[array_2.length];
        for (int i = 0; i < array_2.length; i++) {
            if (array_2[i] < 6) newArray[i] = array_2[i] * 2;
            else newArray[i] = array_2[i];}

        System.out.println(Arrays.toString(array_2));
        return newArray;

        }
        
    //* 3. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
    private  static int[][] QwatrArray(int[][] array) {
        int[][] newArray = new int[5][5];
        for (int i = 0; i < newArray.length; i++) {
            for (int j = 0; j < newArray.length; j++) {
                newArray[i][j] = 5;
                System.out.print(newArray[i][j] + " ");
            }
            System.out.println();
        }



        return newArray;
    }


/**

 * 3. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
 * и с помощью цикла(-ов) заполнить его диагональные элементы единицами (можно только одну из диагоналей, если обе сложно).
 * Определить элементы одной из диагоналей можно по следующему принципу: индексы таких элементов равны, то есть [0][0], [1][1], [2][2], …, [n][n];
 * * Также заполнить элементы побочной диагонали
 */


    }