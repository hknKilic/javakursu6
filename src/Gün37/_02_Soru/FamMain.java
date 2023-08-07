package Gün37._02_Soru;

import java.util.ArrayList;

public class FamMain {

    public static void main(String[] args) {

        Swallow sw = new Swallow();
        Shark s = new Shark();
        Cat c = new Cat();
        Duck d = new Duck();


        ArrayList<IAnimal> animals = new ArrayList<>();

        animals.add(sw);
        animals.add(s);
        animals.add(c);
        animals.add(d);

        for (IAnimal a : animals) {

            System.out.println("--------------");
            System.out.println(animals.getClass().getSimpleName());
            System.out.println((a.food()));

        }

    }
}
