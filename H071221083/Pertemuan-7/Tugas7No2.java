class Product <T> {
    protected String name;
    protected T price;
    protected String expiryDate;
    
    public Product(String name, T price, String expiryDate) {
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
    public String getExpiryDate() {
        return expiryDate;
    }
}

public class Tugas7No2 {
    public static void main(String[] args) {
        Product<Integer> p1 = new Product<>("Kinder Joy" , 10000, "2023-05-01");
        Product<String> p2 = new Product<>("Sari Roti", "Rp 15.0000", "2023-05-20");
        Product<Double> p3 = new Product<>("Susu Kurma", 7.5 , "2023-06-01");

        System.out.println("Product 1 : " + p1.getName() + " - " + p1.getPrice() + " - " + p1.getExpiryDate());
        System.out.println("Product 2 : " + p2.getName() + " - " + p2.getPrice() + " - " + p1.getExpiryDate());
        System.out.println("Product 3 : " + p3.getName() + " - " + p3.getPrice() + " - " + p1.getExpiryDate());
    }
}