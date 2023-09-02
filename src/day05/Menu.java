package day05;

import java.util.Scanner;

public class Menu {

    static Scanner scanner= new Scanner(System.in);
   public static void menu(){
        System.out.println("SECMEK ISTEDIGINIZ GEOMETRIK SEKLI GIRINIZ.\n"+
                "1.CEMBER\n"+
                "2. dikdortgen\n"+
                "3.Kare\n"+
                "4.Cikis: ");
        int secim = scanner.nextInt();
        switch (secim){
            case 1:{
                cerberolustur();
                break;
            }
            case 2:{
                dikdortgenolustur();
                break;
            }
            case 3:
                kareolustur();
                break;
            case 4:
                System.exit(0);
            default:{
                System.out.println("yanlis deger girdiiz");
                menu();
            }

        }
    }

    private static void kareolustur() {
        System.out.println("Karenin uzunlugunu giriniz. ");
        double kareuzunlugu = scanner.nextDouble();
        Kare kare = new Kare(kareuzunlugu ,kareuzunlugu);
        System.out.println(kare);
        menu();



    }

    private static void dikdortgenolustur() {
        System.out.println("Uzun kenari giriniz; ");
        double uzunkenar = scanner.nextDouble();
        System.out.println("Kisa kenar giriniz");
        double kisakenar = scanner.nextDouble();
        Dikdortgen dikdortgen = new Dikdortgen(uzunkenar,kisakenar);
        System.out.println(dikdortgen);
        menu();
    }

    private static void cerberolustur() {
        System.out.println("Cebrein yari capini giriniz");
        double yaricap = scanner.nextDouble();
        Cember cember= new Cember(yaricap);
        System.out.println(cember    );
    }
}
