package C01;

import day04.User;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;

public class Registration {
    /* 2- Registration(Kayıt) isminde bir class oluşturun ve register()(kayıtAl()) isminde bir metod
    ekleyerek Kullanıcıdan user ismini alarak ArrayList e ekleyin ve bu list i
     return edin.
     3- Registration(Kayıt) classı na aynı zamanda kendine verilen
    ArrayListteki userlardan(kullanıcı) her dakikanın ilk 10  saniyesinde kaydolanları
    yazdıran printHappyUsers(sanslıKullanıcı) isminde bir metod daha ekleyiniz.*/

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

    static void printHappyUsers(ArrayList<User> list){
        for (User each:list
             ) {
            if (each.registerDate.getSecond()<= 10){
                System.out.println(each.name + " Kazandiniz... ");
            }else {
                System.out.println(each.name + " Baska bir sefere... ");
            }
        }

    }

    void kullanicilistesi(ArrayList<User> list){
        for (User each:list
             ) {
            System.out.println("Isim : " + each.name + " Kayit zamani : " + each.registerDate);
        }
    }
}
