package day03;

import java.util.Scanner;

public class Z02_DenemeHesapMakinesi2 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen iki tamsayı giriniz");
        double sayi1= scan.nextDouble();
        double sayi2= scan.nextDouble();
        System.out.println("Yapmak istediginiz islemi seciniz :" +
                           "\n\tToplama icin +" +
                           "\n\tCikarma icin -" +
                           "\n\tCarpma icin *" +
                           "\n\tBolme icin / ");

        char islem = scan.next().charAt(0);
        System.out.println(calculator(islem,sayi1,sayi2));

    }
    public static double calculator(char islemTipi, double num1, double num2){
        double sonuc=0;

        switch (islemTipi){
            case '+':
                sonuc= num1+num2;
                break;
            case '-':
                sonuc= num1-num2;
                break;
            case '*':
                sonuc= num1*num2;
                break;
            case '/':
                sonuc= num1/num2;




        }
        return sonuc;

    }

}
