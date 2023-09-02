package C01;

import java.time.LocalDateTime;

public class user {
       // 1- Bir user(Kullanıcı) class oluşturun fields: name , registerDate(kayıtZamanı) (LocalDateTime cinsinden)

    String name ;
    LocalDateTime registerDate;

    public user() {
    }

    public user(String name, LocalDateTime registerDate) {
        this.name = name;
        this.registerDate = registerDate;
    }
}
