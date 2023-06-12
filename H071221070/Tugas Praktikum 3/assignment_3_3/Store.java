package OOP.Praktikum3.assignment_3_3;
import java.util.ArrayList;

public class Store {
    User user;
    String name;
    Store store;
    ArrayList<Product> products = new ArrayList<>();
    
    public Store(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }
    
    // Method untuk menambahkan produk ke dalam store
    public void addProduct(Product product) {
        products.add(product);  
    }
    
    // Method untuk menampilkan daftar produk yang tersedia di store
    public void showProducts() {
        for (int i = 0; i < products.size(); i++) {
            Product product = products.get(i);
            System.out.println((i + 1) + ". " + product.getName() + " - $" + product.getPrice() + " | Stok " + product.getStock());
        }
    }
    
    // Method untuk mengecek stok produk
    public boolean checkStock(Product product) {
        if (product.getStock() > 0) {
            return true;
        } else {
            return false;
        }
    }
    
    // Metode untuk memproses transaksi pembelian produk
    public boolean processTransaction(User user, Product product) {
        if (user.getBalance() >= product.getPrice()) {
            user.setBalance(user.getBalance() - product.getPrice());
            product.productSell(); // Stok dikurangi
            if (product.getStock() == 0) {
                products.remove(product);
            }
            System.out.println("Transaksi berhasil!");
            return true;
        } else {
            System.out.println("Maaf, uang anda tidak cukup untuk membeli produk ini.");
            return false;
        }
    }
    
    // Method untuk menampilkan daftar produk dan informasi pengguna
    public void listProduct(User user) {
        user.userInfo();
        System.out.println("Selamat Datang di "+ getName());
        System.out.println("Daftar Produk:");
        showProducts();
        System.out.println("0. Keluar");
    }
    
}