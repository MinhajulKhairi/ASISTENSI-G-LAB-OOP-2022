package Soal2;

class Product <T> {
    String name;
    T price;
    int expiryDate;

    public Product(String name, T price, int expiryDate) {
        this.name = name;
        this.price = price;
        this.expiryDate = expiryDate;
    }

    public String getName() {
        return name;
    }
    public T getPrice() {
        return price;
    }
    public int getExpiryDate() {
        return expiryDate;
    }

    public String dateFormat() {
        String stringNumber = Integer.toString(getExpiryDate());
        String formattedNumber = String.format("%s-%s-%s", 
        stringNumber.substring(0, 4), 
        stringNumber.substring(4, 6), 
        stringNumber.substring(6, 8));
        return formattedNumber;
    }
}


public class Main {
    public static void main(String[] args) {
        Product<Integer> product1 = new Product("Kinder Joy", 10000, 20230501);
        Product<String> product2 = new Product("Sari Roti", "Rp 15.000", 20230520);
        Product<Double> product3 = new Product("Susu Kurma", 7.5, 20230601);


        System.out.println("Product 1: " + product1.getName() + " - " + product1.getPrice() + " - " + product1.dateFormat());
        System.out.println("Product 2: " + product2.getName() + " - " + product2.getPrice() + " - " + product2.dateFormat());
        System.out.println("Product 3: " + product3.getName() + " - " + product3.getPrice() + " - " + product3.dateFormat());
    }
}