package com.week2.tugas3;

public class Produk {
    private String id;
    private String name;
    private int stock;
    private double price;

    public Produk(String id, String name, int stock, double price) {
        this.id = id;
        this.name = name;
        this.stock = stock;
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }
 
    public int getStock() {
        return stock;
    }

    public double getPrice() {
        return price;
    }

    public boolean isAvailable() {
        return stock > 0;
    }
}
