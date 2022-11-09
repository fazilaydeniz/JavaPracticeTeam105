package day04;

import java.util.Scanner;

public class Q5_DenemeCumledeKelimeBulma {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Lütfen bir cümle giriniz.");
        String str=scan.nextLine();
        System.out.println("Cümlede aratmak istediğiniz kelimeyi giriniz");
        String arananKelime= scan.nextLine();
        int sayac=0;

        for (int i = 0; i <str.length()-arananKelime.length() ; i++) {
             // Beykozda bahar güzeldir
            if (str.substring(i,i+arananKelime.length()).equalsIgnoreCase(arananKelime)){
                sayac++;
            }

        }
        System.out.println(sayac);

        if (sayac>1){
            System.out.println("Cümlenin içerisinde " + sayac + " tane " + arananKelime + " var");

        } else if (sayac==1) {
            System.out.println("Cümlede " + sayac + " tane " + arananKelime + " var ");

        }else System.out.println("Cümlede aradığınız kelime geçmemektedir");
    }


}
