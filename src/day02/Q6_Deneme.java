package day02;

import java.util.Scanner;

public class Q6_Deneme {
    /*
        Kullanicidan bir pozitif tam sayi isteyin
        sayının tam kare olup olmadığını bulunuz,
        tamkare ise true değilse false yazdırınız.
         */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir tamsayı giriniz");
       int sayi = scan.nextInt();

       int flag= 0;

        for (int i = 1; i <=(sayi/2) ; i++) {
            if (sayi==i*i) {
                flag=+1;
                break;
            }

            }if (flag==0){
            System.out.println(false);
        }else {

            System.out.println(true);


        }

    }
}
