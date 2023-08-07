package Gün35._01_Final.method;

public class Araclar {

    String model;

    public Araclar(String model) {
        this.model = model;
    }

    public  String getModel() {
        return model;
    }

    public final void setKilometre(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Ucak{" +
                "model='" + model + '\'' +
                '}';
    }
}

