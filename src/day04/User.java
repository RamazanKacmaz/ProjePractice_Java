package day04;

import java.time.LocalDateTime;

public class User {

    public String name ;
    public LocalDateTime registerDate;

    public User() {
    }

    public User(String name, LocalDateTime registerDate) {
        this.name = name;
        this.registerDate = registerDate;
    }
}
