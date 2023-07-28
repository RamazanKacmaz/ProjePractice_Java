package day03_KaffeeOtamat;

import java.util.Scanner;

public class C02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num ;

        do {
            System.out.println("Lütfen sayi girin ( 0 cikis yapar)");
            num = scanner.nextInt();
            System.out.println("Girilen sayi : " + num);
        }while (num != 0);

        System.out.println("Program sonlandirildi");
    }
}
