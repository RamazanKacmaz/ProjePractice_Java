package C02;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;

public class Registration {

    static ArrayList<User> kullanicilar = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    static ArrayList<User> register(){
        System.out.println("Lütfen adinizi giriniz");
        String name = scanner.nextLine();
        LocalDateTime time = LocalDateTime.now();

        User kullanici = new User(name,time);
        kullanicilar.add(kullanici);
        return kullanicilar;
        /*Bu satırda, User sınıfından yeni bir örnek (nesne) oluşturulur.
       Bu örnek, kullanıcının adını ve kaydolma zamanını içerir. Bu örneği kullanici adlı değişkende saklarız.*/

    }

    static void printhapyUsers(ArrayList<User> list){
        for (User each:list
             ) {
            if (each.registrationDate.getSecond() <= 10){
                System.out.println(each.name + "kazandiniz");
            }else {
                System.out.println(each.name + "bir daha kisefere");
            }
        }
    }



    void kullanicilistesini(ArrayList<User> list){
        for (User each:list
             ) {
            System.out.println("isim " + each.name + " Kayit zamani " + each.registrationDate);
        }
    }
}
