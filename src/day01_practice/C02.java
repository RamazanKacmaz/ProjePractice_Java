package day01_practice;

import java.util.Scanner;

public class C02 {

    static String KartNo = "123456";
    static String sifre = "1234";

    static Scanner scanner = new Scanner(System.in);
    static double bakiye = 50000;


    public static void main(String[] args) {
        giris();
    }

    public static void giris() {

        System.out.println("Kart Numarasi giriniz...");
        String kkartNo = scanner.nextLine().replace("", "");
        System.out.println("Sifrenizi giriniz...");
        String kullaniciSifre = scanner.nextLine();


        if (kkartNo.equals(KartNo) && kullaniciSifre.equals(sifre)) {
            menu();
        } else {
            System.out.println("HATALI GIRIS YAPTINIZ...");
            giris();
        }


    }

    public static void menu() {
        System.out.println("****** NUTELLA BANK ****** \n" +
                "1. Bakiye Sorgulama\n" +
                "2. Para Yatirma\n" +
                "3. Para Cekme\n" +
                "4. Para gonderme\n" +
                "5. Sifre Degistirme\n" +
                "6. Cikis\n" +
                "Secim :  ");

        int secim = scanner.nextInt();

        switch (secim) {
            case 1: {
                bakiyesorgulama();
            }

            case 2: {
                System.out.println("Yatirmal istedginiz tutari girin");
                double miktar = scanner.nextDouble();
                parayatirma(miktar);
            }
            case 3: {
                System.out.println("Cekmek istediginiz miktari giriniz : ");
                double miktar = scanner.nextDouble();
                paracekme(miktar);
            }
            case 4: {
                paraGonderme();
            }
            case 5: {
                sifredegistirme();
            }
            case 6: {
                System.out.println("Bizi sectiginiz icin teskurler...");
                System.exit(0);
            } default:
                System.out.println("YANLIS GIRIS YAPTINIZ...");
                menu();
        }


    }

    public static void sifredegistirme() {
        System.out.println("Mevcut sifreyi giriniz");
        String ksifre = scanner.next();
        if (ksifre.equals(sifre)){
            System.out.println("yeni sifre gir");
            sifre = scanner.next();
            giris();
        }else {
            System.out.println("kimsin");
            sifredegistirme();
        }
    }

    public static void paraGonderme() {
        scanner.nextLine();
        System.out.println("Para gonderilecek iban giriniz..");
        String iban = scanner.nextLine().toLowerCase().replace("", "");
        if (iban.startsWith("TR") && iban.length() == 26) {
            System.out.println("Gonderilecek miktari giriniz..");
            double miktar = scanner.nextDouble();
            if (miktar <= bakiye) {
                bakiye -= miktar;
            } else {
                System.out.println("Bakiyniz yetersiz..");
                menu();
            }
        } else {
            System.out.println("hatali iban girdiniz.. ");
            menu();
        }
    }


    public static void paracekme(double miktar) {
        if (miktar <= bakiye) {
            bakiye -= miktar;
            bakiyesorgulama();
        } else {
            System.out.println("Bakiyeden buyuk miktar cekmesessiniz..\n" +
                    "Miktari  giriniz : ");
            double yeniMiktar = scanner.nextDouble();
            paracekme(yeniMiktar);
        }
    }

    public static void parayatirma(double miktar) {
        System.out.println("gittt");
        bakiye += miktar;
        bakiyesorgulama();
    }

    public static void bakiyesorgulama() {
        System.out.println(" Bakiyeniz : " + bakiye + " $ dir.");
        System.out.println(" \n \n");
        menu();
    }
}


