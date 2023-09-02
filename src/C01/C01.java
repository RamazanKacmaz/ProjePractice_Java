package C01;

public class C01 {

    String name;
    int yas ;

    public C01(String name, int yas) {
        this.name = name;
        this.yas = yas;
    }

    public C01(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "C01{" +
                "name='" + name + '\'' +
                ", yas=" + yas +
                '}';
    }
}
