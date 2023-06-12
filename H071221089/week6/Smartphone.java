package com.week6;

public class Smartphone implements Move{
    private int price;
    private String brand;

    public Smartphone(int price, String brand) {
        this.price = price;
        this.brand = brand;
    }

    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public void move() {
        System.out.println("Smartphone berpindah");
    }

}
