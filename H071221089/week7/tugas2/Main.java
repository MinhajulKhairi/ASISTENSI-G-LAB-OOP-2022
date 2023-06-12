package com.week7.tugas2;

public class Main {
    public static void main(String[] args) {
        Product<Integer> product1 = new Product<>("kinder joy", 10000, "2023-05-01");
        Product<String> product2 = new Product<>("aqua", "Rp 15.000", "2023-05-10");
        Product<Double> product3 = new Product<>("susu kurma", 9.99, "2023-05-20");

        System.out.println(product1.getName() + " - " + product1.getPrice() + " - " + product1.getExpiryDate());
        System.out.println(product2.getName() + " - " + product2.getPrice() + " - " + product2.getExpiryDate());
        System.out.println(product3.getName() + " - " + product3.getPrice() + " - " + product3.getExpiryDate());
    }
}
