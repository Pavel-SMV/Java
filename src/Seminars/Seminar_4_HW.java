package Seminars;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/*
Реализовать консольное приложение, которое:
Принимает от пользователя строку вида text~num
Нужно рассплитить строку по ~, сохранить text в связный список на позицию num.
Если введено print~num, выводит строку из позиции num в связном списке.
Если введено exit, завершаем программу
 Пример:
string~4
num~3
print~3
num
print~4
string
my_value~1
print~1
my_value
*/
public class Seminar_4_HW {
    private static ArrayList<String> saveKeys = new ArrayList<>();

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        while (true) {
            String s = scanner.nextLine();
            if (scanner.nextLine().equals("exit")) {
                break;
            } else {
                String[] split = s.split("~");
               //System.out.println(Arrays.toString(split));// сплит строки в массив
                Integer.parseInt(split[1]);
                saveKeys.add(split[1]);
                if (scanner.nextLine().equals(split[1]));
                System.out.println(split[0]);


            }
        }
    }
}




