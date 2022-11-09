package day03;

import java.util.Scanner;

public class Q3_DogumGünüHesaplama {
    /*
    Kullanicidan iki farkli dogum gunu tarihini alip,
    kimin once dogdugunu consolda yazdiran bir program yaziniz.
    */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen karşılaştırmak istediğiniz  ilk doğum tarihini yıl / ay / gün olarak giriniz.");
        int yil1 = scan.nextInt();
        int ay1 = scan.nextInt();
        int gun1 = scan.nextInt();  //Ahmetin doğum tarihi

        System.out.println("Lütfen karşılaştırmak istediğiniz ikinci doğum tarihini yıl / ay / gün olarak giriniz.");
        int yil2 = scan.nextInt();
        int ay2= scan.nextInt();
        int gun2 = scan.nextInt(); // Ayşenin doğum tarihi

        if (yil1>yil2) System.out.println("Ayşe, Ahmetten büyüktür");
        else if (yil2>yil1) System.out.println("Ahmet, Ayşeden büyüktür");
        else{ System.out.println();
            if (ay1>ay2) System.out.println("Ayşe, Ahmetten büyüktür");
            else if (ay2>ay1) System.out.println("Ahmet, Ayşeden büyüktür");
            else {System.out.println();
                if (gun1>gun2) System.out.println("Ayşe, Ahmetten büyüktür");
                else if (gun2>gun1) System.out.println("Ahmet, Ayşeden büyüktür");
                else {
                    System.out.println("Aynı yıl, aynı ay aynı günde doğmuşlardır");

                }


            }

        }


    }
}
