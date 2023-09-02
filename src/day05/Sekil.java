package day05;

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

    double cevreHesaolama(double yaricap){
        return 2*3.14*yaricap;
    }

    double alanHesapla(double yaricap){
        return 3.14*(yaricap*yaricap);
    }

    double cevreHesaplama( double uzunKenar, double kisaKenar){
        return (kisaKenar+uzunKenar)*2;
    }

    double alanHesapla( double uzunKenar , double kisaKenar){
        return (kisaKenar*uzunKenar);
    }
}
