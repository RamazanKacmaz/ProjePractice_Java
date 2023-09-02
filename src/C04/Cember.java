package C04;

public class Cember extends Sekil{
    public Cember(double yaricap) {
        super(yaricap);
    }

    @Override
    public String toString() {
        return "Cember{" +
                "yaricap=" + yaricap + "Alan hesapla: " + alanHesapla(yaricap)+"Cevre hesapla : "+ cevreHesaplama(yaricap);
    }
}
