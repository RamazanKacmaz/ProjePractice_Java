package C02;

import java.time.LocalDateTime;

public class User {
    String name ;
    LocalDateTime registrationDate;

    public User() {
    }

    public User(String name, LocalDateTime registrationDate) {
        this.name = name;
        this.registrationDate = registrationDate;
    }
}
