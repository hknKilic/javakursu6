package Gün38._02_Absatracht;

public abstract class Sekil {

    private String name;
    abstract double alan();
    abstract double cevre();

    public void ciz(){System.out.println(name+"sekli cizildi");
    }

    @Override
    public String toString() {
        return "Sekil{" +
                "\nName='" + name +
                "\nAlan="+alan()+
                "\ncevre="+cevre()
                ;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
