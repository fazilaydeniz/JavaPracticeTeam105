package day04;

import java.util.Scanner;

public class Q7_DenemeStringteGecenRakamlariToplama {
    /*
     * write a method which accepts a String as parameter
     * and prints the sum of the digits, present in the given string
     *
     * Parametre olarak bir String kabul eden ve verilen Stringde
     * bulunan rakamların toplamını yazdiran bir method yazın.
     *
     * Input : ade1r4d3
     * Output : 1+4+3 = 8
     *
     * Use Character.isDigit()
     *     Integer.valueOf()
     */

    public static void main(String[] args) {
        String input = "ade1r4d3   ";

        rakamlarıTopla(input);

    }

    private static void rakamlarıTopla(String input) {
        int toplam=0;

        for (int i = 0; i < input.length() ; i++) {

            if (Character.isDigit(input.charAt(i))){

                toplam+= Integer.valueOf(""+input.charAt(i));
            }

        }
        System.out.println(toplam);
    }
}
