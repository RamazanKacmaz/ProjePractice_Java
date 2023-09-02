package C04;

public class Sekil {

    double uzunKenar ;
    double kisaKenar;
    double yaricap;

    public Sekil(double uzunKenar, double kisaKenar) {
        this.uzunKenar = uzunKenar;
        this.kisaKenar = kisaKenar;
    }

    public Sekil(double yaricap) {
        this.yaricap = yaricap;
    }

    double cevreHesaplama(double yaricap){
        return 2*3.14*yaricap;
    }
    double alanHesapla(double yaricap){
        return 3.14*(yaricap*yaricap);
    }
}
