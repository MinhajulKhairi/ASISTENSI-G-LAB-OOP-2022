

public class Main2 {
    public static void main(String[] args) {
        Product<Integer> produk1 = new Product<>("Kinder Joy", 10000, "2023-05-01");
        Product<String> produk2 = new Product<>("Sari Roti", "Rp 15.000", "2023-05-20");
        Product<Double> produk3 = new Product<>("Susu Kurma", 7.5, "2023-06-01");

        System.out.println("Product 1: " + produk1.getName() + " - " + produk1.getHarga() + " - " + produk1.getExpiryDate());
        System.out.println("Product 2: " + produk2.getName() + " - " + produk2.getHarga() + " - " + produk2.getExpiryDate());
        System.out.println("Product 2: " + produk3.getName() + " - " + produk3.getHarga() + " - " + produk3.getExpiryDate());
    }
}