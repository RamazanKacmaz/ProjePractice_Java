package day05;

public class Kare extends Dikdortgen{
    public Kare(double uzunKenar, double kisaKenar) {
        super(uzunKenar, kisaKenar);
    }

    @Override
    public String toString() {
        return "Kare{" +
                "uzunKenar=" + uzunKenar + " cEvre :" + cevreHesaplama(uzunKenar,kisaKenar) +" Alan : "+alanHesapla(uzunKenar,kisaKenar);
    }
}
