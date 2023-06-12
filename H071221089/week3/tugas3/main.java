package com.week3.tugas3;

import java.util.Scanner;

class User {
    private String name;
    private int balance;
    public User(String name, int balance) {
        this.name = name;
        this.balance = balance;
    }
    public String getName() {
        return name;
    }
    public int getBalance() {
        return balance;
    }
    public void setBalance(int balance) {
        this.balance = balance;
    }
}

class Product {
    private String name;
    private int price;
    private int stock;
    public Product(String name, int price, int stock) {
        this.name = name;
        this.price = price;
        this.stock = stock;
    }
    public Product(String name, String price, int stock) {
        this.name = name;
        this.stock = stock;
        // konversi harga dari string ke integer
        // ubak (contoh) 1k jadi 1000
        if (price.contains("k")) {
            this.price = (int) Math.round(Double.parseDouble(price.replaceAll("k", "")) * 1000); //kalau double bakal dibulatkan
        } else {
            this.price = Integer.parseInt(price); //kalau bulat dari awal tetap bulat
        }
    }
    public String getName() {
        return name;
    }
    public int getPrice() {
        return price;
    }
    public int getStock() {
        return stock;
    }
    public void sell() {
        stock--; //ngurangin stok setiap transaksi
    }
}

class Store {
    private String name;
    private Product[] products;
    protected int numProducts;
    public Store(String name) {
        this.name = name;
        products = new Product[10];
        numProducts = 0;
    }
    public void addProduct(Product product) {
        products[numProducts] = product;
        numProducts++;
    }

    public void displayProducts() {
        System.out.println("Daftar Produk:");
        // perulangan untuk menampilkan tiap produk
        for (int i = 0; i < numProducts; i++) { 
            //menampilkan informasi produk
            System.out.println((i + 1) + ". " + products[i].getName() + " - $" + products[i].getPrice() + " | Stok " + products[i].getStock());
        }
        System.out.println("0. Keluar");
    }
    public void processTransaction(User user, int productIndex) {
        Product product = products[productIndex - 1];
        // cek kuota produk
        if (product.getStock() == 0) {
            System.out.println("Maaf, produk ini sudah habis.");
            return;
        }
        //cek duit
        if (user.getBalance() < product.getPrice()) {
            System.out.println("Maaf, uang Anda tidak cukup.");
            return;
        }
        System.out.println("Apakah anda yakin ingin membeli:");
        System.out.println(product.getName() + ", dengan harga $" + product.getPrice());
        System.out.println("1. Konfirmasi");
        System.out.println("2. Batal");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        // kalau produk pilihan masih ada 1
        if (choice == 1) {
            user.setBalance(user.getBalance() - product.getPrice()); //ngurangin saldo dengan harga barang
            product.sell(); 
            //kalau produk kosong, akan dihapus
            if (product.getStock() == 0) {
                removeProduct(productIndex);
            }
            System.out.println("Pembelian berhasil!");
        } else {
            System.out.println("Pembelian dibatalkan.");
        }
    }
    private void removeProduct(int index) {
        for (int i = index - 1; i < numProducts - 1; i++) {
            products[i] = products[i + 1];
        }
        //jumlah produk yang ada akan dikurangi 1 kalo produk habis
        numProducts--;
    }
}

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        User user = new User("haikal", 1000000000);
        Store store = new Store("sisfo computer");
        store.addProduct(new Product("hp pavilion gaming 15", "2k", 15));
        store.addProduct(new Product("asus vivobook 15", "4k", 4));
        store.addProduct(new Product("leonovo ideaped s145", "1.k", 2));
        int choice = -1;
        while (choice != 0) {
            System.out.println("Saldo Anda: $" + user.getBalance());
            store.displayProducts();
            choice = scanner.nextInt();
            if (choice > 0 && choice <= store.numProducts) {
                store.processTransaction(user, choice);
            }
        }
        System.out.println("Terima kasih!");
    }
}