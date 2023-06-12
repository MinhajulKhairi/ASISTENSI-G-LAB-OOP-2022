package com.week7.tugas1;

public class Main {
    public static void main(String[] args) {
        Character[] characters = {
            new Fighter(10),
            new Mage(15),
            new Fighter(20),
            new Fighter(30),
            new Mage(25)
        };

        for (Character character : characters) {
            printAttack(character);
        }
    }

    public static void printAttack(Character character) {
        System.out.println("Attack power: " + character.attack());
        System.out.println("Melee attack power: " + character.attack("melee"));
        System.out.println("Ranged attack power: " + character.attack("ranged"));
        System.out.println("Fire attack power: " + character.attack("fire"));
        System.out.println("Frost attack power: " + character.attack("frost"));
        System.out.println();
    }
}