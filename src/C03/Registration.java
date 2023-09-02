package C03;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;

public class Registration {

    static ArrayList<User> kullanicilar = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    static ArrayList<User> register(){
        System.out.println("Isminizi girnizi");
        String name = scanner.nextLine();
        LocalDateTime time = LocalDateTime.now();
        User kullanici = new User(name,time);
        kullanicilar.add(kullanici);
        return kullanicilar;
    }

}
