package com.week6;

abstract class Dog implements Move {
    int position;
    int averageLength;

    public Dog(int averageLength) {
        this.position = 0;
        this.averageLength = averageLength;
    }

    abstract void describe();

}

class Pitbull extends Dog {
    public Pitbull(int averageLength) {
        super(averageLength);
    }

    @Override
    public void move() {

        position += 3;
        System.out.println("Anjing Pitbull bergeser ke posisi: " + position);
    }

    @Override
    public void describe() {
        System.out.println("Anjing Pitbull memiliki tubuh yang berotot dan gaga");
    }
}

class SiberianHusky extends Dog {
    public SiberianHusky(int averageLength) {
        super(averageLength);
    }

    @Override
    public void move() {
        position += 2;
    }

    @Override
    public void describe() {
        System.out.println("Anjing Siberian Husky memiliki bulu yang tebal dan panjang dengan warna yang beragam");
    }
}

class Bulldog extends Dog {
    public Bulldog(int averageLength) {
        super(averageLength);
    }

    @Override
    public void move() {
        position += 1;
    }

    @Override
    public void describe() {
        System.out.println(
                "Anjing Bulldog memiliki tubuh lebar, besar, moncong pesek, berkaki pendek dan memiliki ekstra kulit yang jatuh berlipa");
    }
}

class GermanShepherd extends Dog {
    public GermanShepherd(int averageLength) {
        super(averageLength);
    }

    @Override
    public void move() {
        position += 3;
    }

    @Override
    public void describe() {
        System.out.println(
                "Anjing German Sheperd memiliki Struktur tubuh yang agak memanjang, proporsional, berotot, dan memiliki struktur tulang yang solid.");
    }
}