package No3;

public class Product {
    String name;
    int price, stock;

    public Product(String name, int price, int stock) {
        this.name = name;
        this.price = price;
        this.stock = stock;
    }

    public Product(String name, String price, int stock) {
        this.name = name;
        price = price.replace("k", "000").replace("K", "000");
        Integer numPrice = Integer.parseInt(price);
        this.price = numPrice;
        this.stock = stock;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int jualProduk() {
        this.stock -= 1;
        return this.stock;
    }
}
