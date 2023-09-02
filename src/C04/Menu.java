package C04;

import java.util.Scanner;

public class Menu {
    static Scanner scanner= new Scanner(System.in);

    public static void menu(){
        System.out.println("SECMEK ISTEDIGINIZ GEOMETRIK SEKLI GIRINIZ.\n"+
                "1.CEMBER\n Secim yap");

        int secim = scanner.nextInt();
        switch (secim){
            case 1:{
                cerberolustur();
                break;
            }

            default:{
                System.out.println("yanlis deger girdiiz");
                menu();
            }

        }
    }

    private static void cerberolustur() {
        System.out.println("Cebrein yari capini giriniz");
        double yaricap = scanner.nextDouble();
        Cember cember = new Cember(yaricap);
        System.out.println(cember);
    }
}
