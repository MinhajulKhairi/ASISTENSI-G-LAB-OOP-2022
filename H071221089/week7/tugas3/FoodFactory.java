package com.week7.tugas3;

public class FoodFactory {
    public static Food getFood(String type) {
        if (type.equals("burger")) {
            return new Burger();
        } else if (type.equals("pizza")) {
            return new Pizza();
        } else if (type.equals("steak")) {
            return new Steak();
        } else {
            throw new IllegalArgumentException("Invalid food type: " + type);
        }
    }
}