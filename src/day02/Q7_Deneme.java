package day02;

import java.util.Scanner;

public class Q7_Deneme {
     /*
   Kullanicidan alacaginiz iki sayiyi yine kullaniciya sectireceginiz
   dort islemden biri ile isleme koyup sonucunu yazdiriniz
 */
     public static void main(String[] args) {
         Scanner scan= new Scanner(System.in);
         System.out.println("Lütfen iki sayı giriniz");
         double sayi1= scan.nextDouble();
         double sayi2= scan.nextDouble();

         System.out.println("Toplama işlemi için 1'i\n" +
                            "çıkarma işlemi için 2'yi\n" +
                            "Çarpma işlemi için 3'ü\n" +
                            "Bölme işlemi için 4'ü tuşlayınız");
         double islem= scan.nextDouble();

         if (islem==1){
             System.out.println("Girilen sayıların toplamı :" + (sayi1+sayi2));
         }
         if (islem==2){
             System.out.println("Girilen sayıların çıkarma sonucu :" + (sayi1-sayi2));
         }
        if (islem==3){
         System.out.println("Girilen sayıların çarpımı :" + (sayi1*sayi2));
         }
        if (islem==4){
            System.out.println("Girilen sayıların bölümü :" + (sayi1/sayi2));
        }

     }

}
