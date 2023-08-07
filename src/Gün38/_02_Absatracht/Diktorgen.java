package Gün38._02_Absatracht;

public class Diktorgen extends Sekil{

    private double kisaKenar;
    private double uzunKenar;

    public Diktorgen(double kisaKenar, double uzunKenar) {
        this.kisaKenar = kisaKenar;
        this.uzunKenar = uzunKenar;
    }

    @Override
    double alan() {
        return this.uzunKenar*this.kisaKenar;
    }

    @Override
    double cevre() {
        return (this.kisaKenar+this.uzunKenar)*2;
    }

    public double getKisaKenar() {
        return kisaKenar;
    }

    public void setKisaKenar(double kisaKenar) {
        this.kisaKenar = kisaKenar;
    }

    public double getUzunKenar() {
        return uzunKenar;
    }

    public void setUzunKenar(double uzunKenar) {
        this.uzunKenar = uzunKenar;
    }
}
