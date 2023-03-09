package Seminars;

/** Дано четное число N (>0) и символы c1 и c2. Написать метод, который вернет строку длины N,
* которая состоит из чередующихся символов c1 и c2, начиная с c1. (6, 'a', 'b') -> "ababab"
 */

 public class Seminar_2_HW_1 {
    public static void main(String[] args) {
        System.out.println(buildString(6, 'a', 'b'));
    }
    static String buildString(int n,char c1, char c2){
        String string = new String();
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0){
                string+= c1;
            }
            else {
                string+= c2;
            }
        }
        return string;
    }


    }

