package Seminars;

// Дан список ArrayList<Integer> целых чисел. Удалить из него нечетные числа.


import java.util.*;

public class Seminar_3_HW_1 {
    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9));
        System.out.println(integers);
        DeleteOddNumbers(integers);
        System.out.println(integers);

    }

    private static List<Integer> DeleteOddNumbers(List<Integer> sourse) { // sourse означает исходник

        sourse.removeIf(i -> i % 2 != 0);

        return sourse;

            }

        }




