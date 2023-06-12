package OOP.Praktikum3.assignment_3_3;

public class Product {
    private String name;
    private int price;
    private int stock;

    public Product(String name, int price, int stock) {
        this.name = name;
        this.price = price;
        this.stock = stock;
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

    // Method untuk mengurangi stock product setiap di beli
    public void productSell() {
        stock--;
    }
}