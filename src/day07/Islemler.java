package day07;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Islemler {

    Map<Integer, Urun> urunler = new HashMap<>();
    Scanner scanner = new Scanner(System.in);
    double tutar;

    void urunlisteleme (){
        System.out.println("****** ÜRÜNLER *****");
        for (int i = 0; i <urunler.size() ; i++) {
            System.out.println(i + " . ÜRÜN = " + urunler.get(i).getUrunAdi() + "FIATI = " + urunler.get(i).getUrunFiati());
        }

    }
    void alisveris(){
        System.out.println("ÜRÜN KODU GIRINIZ");
        int urunKodu = scanner.nextInt();
        System.out.println("ÜRÜN MIKTARI GIRINIZ");

        double miktar = scanner.nextDouble();
        tutar+=miktar*urunler.get(urunKodu).getUrunFiati();



    }
}
