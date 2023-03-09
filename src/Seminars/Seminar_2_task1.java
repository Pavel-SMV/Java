package Seminars;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;



public class Seminar_2_task1 {
        public static void main(String[] args) throws IOException {

        FileOutputStream fileOutputStream = new FileOutputStream("file.txt");

        String text = " My text";
        byte[] bytes = text.getBytes(StandardCharsets.UTF_8);
        fileOutputStream.write(bytes);

        fileOutputStream.close();

    }
}
