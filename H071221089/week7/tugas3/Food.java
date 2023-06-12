package com.week7.tugas3;

interface Food {
    int getPrice();
}

class Burger implements Food {
    private int price = 10000;

    public int getPrice() {
        return price;
    }
}

class Pizza implements Food {
    private int price = 15000;

    public int getPrice() {
        return price;
    }
}

class Steak implements Food {
    private int price = 20000;

    public int getPrice() {
        return price;
    }
}