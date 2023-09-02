package day05;

public class Cember extends Sekil {
    public Cember(double yaricap) {
        super(yaricap);
    }

    @Override
    public String toString() {
        return "Yaricap : " + yaricap + " Alan : "+ alanHesapla(yaricap) +
                " Cevre : " + cevreHesaolama(yaricap);
    }
}
