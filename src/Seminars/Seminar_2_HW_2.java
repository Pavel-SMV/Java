package Seminars;

import java.io.IOException;
import java.io.File;
import java.io.PrintWriter;


public class Seminar_2_HW_2 {
    public static void main(String[] args) {


        try
        {
            File file = new File("file.txt");
            if (!file.exists())             // Если файл не существует -> создаём
                file.createNewFile();
            PrintWriter pw = new PrintWriter(file); // Создание объекта pw на основании класса PrintWriter
            int i = 1;
            while (i<101){
                pw.println(" Java - java");
                i++;
            }

            pw.close();

        } catch (IOException e) {
            System.out.println("Error: file exists");

        }


    }
}
