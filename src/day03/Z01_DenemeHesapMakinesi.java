package day03;

import java.util.Scanner;

/*
   Kullanicidan alacaginiz iki sayiyi yine kullaniciya sectireceginiz
   dort islemden biri ile isleme koyup sonucunu yazdiriniz
     */
public class Z01_DenemeHesapMakinesi {
        public static void main(String[] args) {
            Scanner scan= new Scanner(System.in);
            System.out.println("Lütfen iki tamsayı giriniz.");
            int sayi1= scan.nextInt();
            int sayi2= scan.nextInt();

            System.out.println("Yapmak istediğiniz işlemi seçiniz:" +
                    "\n\tToplama işlemi için : 1 " +
                    "\n\tÇıkarma işlemi için : 2 " +
                    "\n\tBölme işlemi için   : 3 " +
                    "\n\tÇarp işlemi için    : 4 " + " tuşlayınız");
            //char islem= scan.next().charAt(0);
            int islem=scan.nextInt();


            if (islem== 1) {
                System.out.println("Girilen sayıların toplamı :" + (sayi1 + sayi2));
            }else if (islem== 2){
                System.out.println("Girilen sayıların farkı :" +(sayi1-sayi2));
            } else if (islem== 3) {
                System.out.println("Girilen sayıların bölümü :" +(sayi1/sayi2));
           } else if (islem== 4) {
                System.out.println("Girilen sayıların çarpımı :" +(sayi1*sayi2));
            }else{
                System.out.println("Hatalı giriş yaptınız.");
            }

        }
}
