package day04;

import java.util.Arrays;
import java.util.Scanner;

import static day04.Q3_StringCumledenArrayOlusturma.kelimeninHarfleriArrayi;

public class Q6_DenemeStringCumledenArrayolusturma {
    /*
         * create a custom return type method accepts a name as parameter
         * and prints the name as a char array
         *
         * (do not use toCharArray() method)
         *
         * Input : John
         * Output : [J, o, h, n]
         *
         Parametre olarak String bir isim girdiginiz, size o ismin harflerini
         bir char Array olarak yazdiran bir method olusturunuz.

         toCharArray() methodunu kullanmayiniz!

         * Input : John
         * Output : [J, o, h, n]

         */
    public static void main(String[] args) {

      Scanner scan= new Scanner(System.in);
        System.out.println("Lütfen bir kelime giriniz");
        String kelime= scan.nextLine();

        girilenKelimeninHarfleriArrayi(kelime);

}

    private static void girilenKelimeninHarfleriArrayi(String kelime) {
        char [] output= new char[kelime.length()];

        for (int i = 0; i < kelime.length(); i++) {
            output[i] = kelime.charAt(i);

        }
        System.out.println(Arrays.toString(output));
    }
}
