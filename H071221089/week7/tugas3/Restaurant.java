package com.week7.tugas3;

import java.util.List;

public class Restaurant {
    public static int calculateTotal(List<String> orders) {
        int total = 0;
        for (String order : orders) {
            Food food = FoodFactory.getFood(order);
            total += food.getPrice();
        }
        return total;
    }
}