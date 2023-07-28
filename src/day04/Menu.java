package day04;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    Scanner scanner = new Scanner(System.in);

    ArrayList<User> kullanicilar = new ArrayList<>();
    Registration registration = new Registration();

    boolean cikis = true;
    void menu(){
        boolean cikis = true;
        do {
            System.out.println("1. Kayit\n"+
                    "2.Kisi Listele\n"+
                    "3. Sansli kisiler\n" +
                    "4. Cikis\n" +
                    " Seciminiz: ");
            int secim = scanner.nextInt();
            switch (secim){
                case 1:
                    kullanicilar = Registration.register();
                break;
                case 2:
                      registration.kullaicilistesi(kullanicilar);
                case 3:
                    Registration.printHappyUsers(kullanicilar);
                    break;
                case 4:
                    cikis = false;
                    break;
                default:
                    System.out.println("Hatali giris yaptiniz.");
                    break;
            }
        }while (cikis);
    }

}
