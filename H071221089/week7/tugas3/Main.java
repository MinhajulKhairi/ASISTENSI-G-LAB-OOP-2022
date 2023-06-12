package com.week7.tugas3;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> orders = Arrays.asList("burger", "pizza", "steak", "burger");
        int total = Restaurant.calculateTotal(orders);
        System.out.println("Total price: " + total);
    }
}
