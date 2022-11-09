package day06;

import java.sql.Array;
import java.util.Arrays;

public class Q4_Arrays {
    //Önce üç isimli bir array oluştur. Sonra 0.indexteki isimle 1. indexteki isimlerin
    //yerlerini değiştir.

    public static void main(String[] args) {
        String[] isimler=new String[3];
        isimler[0]= "Ayşe";
        isimler[1]= "Fatma";
        isimler[2]= "Hayriye";
        System.out.println(Arrays.toString(isimler));
        // [Ayşe, Fatma, Hayriye]  şeklinde yazdı.
        // Şimdi Ayşe ile Fatmanın yerlerini değiştireceğiz.

        String boskova = isimler[0];
        isimler[0] = isimler[1];
        isimler[1] = boskova;
        //Ayşeyi boşa aldık. Fatmayı Ayşenin yerine gönderdik. Fatmanın yerine de boştaki
        // Ayşeyi aldık. İşlem tamamdır. Yazdıralım görelim.
        System.out.println(Arrays.toString(isimler));


    }
}
