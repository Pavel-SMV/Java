package Seminars;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;


//Дан список ArrayList<String>. Удалить из него все строки, которые являются числами.
// Пример: ArrayList<String> list = new ArrayList<>(List.of("string", "s", "5", "10", "-12", "my_value"));
// ["string", "s", "my_value"]


public class Seminar_3_HW_2 {
        public static void main(String[] args) {

            List<String> string = new ArrayList<>(List.of("string", "s", "5", "10", "-12", "my_value"));
            System.out.println(string);
            Function<String,Integer> fun = String::length;

            //ArraysMethod(new ArrayList<>());
            System.out.println (fun .apply ("string"));


        }

        private static List<String> ArraysMethod(List<String> ArrayList) {
            for (String string :ArrayList){

            }


            return ArrayList;
        }
    }


