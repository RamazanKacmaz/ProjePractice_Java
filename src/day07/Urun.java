package day07;

public class Urun {

    private  String urunAdi;
    private double urunFiati;

    public Urun() {
    }

    public Urun(String urunAdi, double urunFiati) {
        this.urunAdi = urunAdi;
        this.urunFiati = urunFiati;
    }

    public String getUrunAdi() {
        return urunAdi;
    }

    public double getUrunFiati() {
        return urunFiati;
    }
}
