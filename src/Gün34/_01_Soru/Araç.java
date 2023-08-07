package Gün34._01_Soru;

public class Araç {

    private String renk;
    private double motorHaacmi;
    private String marka;

    public Araç(String renk, double motorHaacmi, String marka) {
        setRenk(renk);
        setMotorHaacmi(motorHaacmi);
        setMarka(marka);
    }

    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

    public double getMotorHaacmi() {
        return motorHaacmi;
    }

    public void setMotorHaacmi(double motorHaacmi) {
        this.motorHaacmi = motorHaacmi;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    @Override
    public String toString() {
        return "Araç{" +
                "renk='" + renk + '\'' +
                ", motorHaacmi=" + motorHaacmi +
                ", marka='" + marka + '\'' +
                '}';
    }
}
