package com.week2.tugas3;

public class main {
    public static void main(String[] args) {
        Produk product1 = new Produk("01", "apple", 100, 1000000);
        Produk product2 = new Produk("02", "android", 50, 500000);
        System.out.println("Product 1:");
        System.out.println("ID: " + product1.getId());
        System.out.println("Name: " + product1.getName());
        System.out.println("Stock: " + product1.getStock());
        System.out.println("Price: " + product1.getPrice());
        System.out.println("Is available: " + product1.isAvailable());

        System.out.println("\nProduct 2:");
        System.out.println("ID: " + product2.getId());
        System.out.println("Name: " + product2.getName());
        System.out.println("Stock: " + product2.getStock());
        System.out.println("Price: " + product2.getPrice());
        System.out.println("Is available: " + product2.isAvailable());
    }
}
