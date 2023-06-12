package com.week6;

public class Main {
    public static void main(String[] args) {
        Pitbull dog = new Pitbull(12);
        Smartphone hp = new Smartphone(1000000, "Nokia");
        Car mobil = new Car(5, 160, "hitam");

        dog.move();
        dog.move();
        dog.describe();
        hp.move();
        mobil.move();
    }
}
