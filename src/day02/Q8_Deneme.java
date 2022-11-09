package day02;

public class Q8_Deneme {
         /*Kullanicidan satin aldigi urun adedi ve ve liste fiyatini alin, kullaniciya musteri karti
         olup olmadigini sorun.
         Musteri karti varsa 10 urunden fazla alirsa %20, yoksa %15 indirimyapin,
         Musteri karti yoksa 10 urunden fazla alirsa %15, yoksa %10 indirim yapin"*/
    public static void main(String[] args) {
        int urunadedi= 10;
        double urunfiyati= 12.5;
        boolean kartVarMi= true;
        double toplamFiyat=0;

        if (kartVarMi && urunadedi>=10){
            toplamFiyat= urunadedi*urunfiyati * (0.8);
            System.out.println("Girilen ürünlerin %20 indirimli toplam fiyatı : " +toplamFiyat + "tl");
        } else if (kartVarMi && urunadedi<10 && urunadedi>0) {
            toplamFiyat= urunadedi*urunfiyati * (0.85);
            System.out.println("Girilen ürünlerin %15 indirimli toplam fiyatı: " + toplamFiyat  + "tl");
        } else if (!kartVarMi && urunadedi>10) {
            toplamFiyat= urunadedi*urunfiyati * (0.85);
            System.out.println("Girilen ürünlerin %15 indirimli toplam fiyatı: " + toplamFiyat + "tl" );

        } else if (!kartVarMi && urunadedi<10 && urunadedi>0) {
            toplamFiyat= urunadedi*urunfiyati * (0.90);
            System.out.println("Girilen ürünlerin %10 iindirimlitoplam fiyatı: " + toplamFiyat + "tl" );

        }else{
            System.out.println("Hatalı Giriş yaptınız");
        }

    }
}
