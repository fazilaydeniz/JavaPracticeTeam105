package Practice01;
import java.util.Scanner;
public class Q3_Odev {
    public static void main(String[] args) {
        /*
   Kullanicidan alacaginiz iki sayiyi yine kullaniciya sectireceginiz
   dort islemden biri ile isleme koyup sonucunu yazdiriniz
 */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen iki sayi giriniz");
        double sayi1= scan.nextDouble();
        double sayi2= scan.nextDouble();
        System.out.println("Lutfen \n" +
                "Toplama icin 1\n" +
                "Cikarma icin 2 \n" +
                "Carpma icin 3 \n" +
                "Bolme icin 4 giriniz ");
        int islem=scan.nextInt();
        if (islem==1){
            System.out.println("iki sayinin toplami: " +(sayi1+sayi2));
        } else if (islem==2) {
            System.out.println("iki sayinin farki: " + (sayi1-sayi2));
        } else if (islem==3) {
            System.out.println("iki sayinin carpimi: "+ (sayi1*sayi2));
        } else if (islem==4) {
            System.out.println("iki sayinin bolumu: "+ (sayi1/sayi2));
        }else {
            System.out.println("hatali giris");
        }
    }}