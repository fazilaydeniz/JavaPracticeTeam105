package day02;

import java.util.Scanner;

public class Q4_Odev2 {
    /*
        Kullanicidan bir pozitif tam sayi isteyin===> scanner    girin===>int,string,double
        sayının tam kare olup olmadığını bulunuz,
        tamkare ise true değilse false yazdırınız.
         */
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz");
        int sayi= scan.nextInt();
        // int sayi =16;
        int flag=0;
        for (int i = 1; i <=(sayi/2); i++) {
            if (sayi==i*i){
                flag=+1;
                break;
            }
        }
        if (flag==0){
            System.out.println("Tam kare değil");
        } else {
            System.out.println("Tam kare");
        }

    }
}
