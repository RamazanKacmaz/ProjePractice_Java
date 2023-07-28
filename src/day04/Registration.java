package day04;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;

public class Registration {

   static ArrayList<User> kullanicilar = new ArrayList<>();

    static Scanner scanner = new Scanner(System.in);

   static ArrayList<User> register(){
        System.out.println("Isminizi giriniz");
        String name = scanner.nextLine();
        LocalDateTime time = LocalDateTime.now();

        User kullanici = new User(name,time);
        kullanicilar.add(kullanici);


        return kullanicilar;
    }

    static void printHappyUsers(ArrayList<User> list) {
        for (User each : list
        ) {
            if (each.registerDate.getSecond() <= 10) {
                System.out.println(each.name + " kazandiniz");
            } else {
                System.out.println(each.name + " olmadi");
            }
        }
    }
        void kullaicilistesi(ArrayList<User> list){
            for (User each:list
                 ) {
                System.out.println("isim :" + each.name + "Kayit zamani" + each.registerDate);
            }
        }
    }

