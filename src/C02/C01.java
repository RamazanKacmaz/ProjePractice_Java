package C02;

public class C01 {
    public static void modifyValue(int num) {
        num = num * 2;
        System.out.println(num);
    }

    public static void main(String[] args) {
        int x = 5;
        System.out.println("Önce: " + x);
        modifyValue(x);
        System.out.println("Sonra: " + x);
    }

}
