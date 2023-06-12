package assignment_no_2;

import assignment_no_1.*;

public class Main{
    public static void main(String[] args) {
        SiberianHusky siberianHusky = new SiberianHusky();
        siberianHusky.move();
        siberianHusky.describe();
        

        Smartphone sp = new Smartphone(5000000, "Iphone 15");
        sp.showDetail();
        sp.move();
        System.out.println("=".repeat(30));

        Car car = new Car(6, "Hitam", 240);
        car.showDetail();
        car.move();
        System.out.println("=".repeat(30));
    }
}