package day05;

public class Dikdortgen extends Sekil{
    public Dikdortgen(double uzunKenar, double kisaKenar) {
        super(uzunKenar, kisaKenar);
    }

    @Override
    public String toString() {
        return "Dikdortgen{" +
                "uzunKenar=" + uzunKenar +
                ", kisaKenar=" + kisaKenar + "cevresi: " + cevreHesaplama(uzunKenar, kisaKenar);

    }
}
