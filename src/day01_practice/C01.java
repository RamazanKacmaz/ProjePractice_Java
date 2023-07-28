package day01_practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Desimal deger giriniz : ");
        int sayi = scanner.nextInt();

        System.out.println(sayi + " desimal sayinin bianry karsiligi : " + binaryConvert(sayi));

    }

    public static List<Integer> binaryConvert(int sayi) {

        List<Integer> binary = new ArrayList<>();

        while (sayi > 0){
            binary.add(sayi%2);
            sayi /= 2 ;
        }

        List<Integer> tersbinary = new ArrayList<>();

        for (int i = binary.size()-1; i >= 0 ; i--) {
            tersbinary.add(binary.get(i));
        }
        return tersbinary;

    }
}
