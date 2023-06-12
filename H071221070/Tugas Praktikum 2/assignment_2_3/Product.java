package OOP.Praktikum2.assignment_2_3;

public class Product {
    // Deklarasi atribut-atribut dari Class Product
    private int id;
    private String name;
    private int stok;
    private double harga;

    // Constructor class Product yang akan dijalankan saat objek dibuat
    public Product(int id, String name, int stok, double harga) {
        this.id = id;
        this.name = name;
        this.stok = stok;
        this.harga = harga;
    }

    // Method getter untuk mengambil nilai atribut id
    public int getId() {
        return id;
    }

    // Method getter untuk mengambil nilai atribut name
    public String getName() {
        return name;
    }

    // Method getter untuk mengambil nilai atribut stock
    public int getStok() {
        return stok;
    }

    // Method getter untuk mengambil nilai atribut price
    public double getHarga() {
        return harga;
    }

    // Method yang mengembalikan true jika stok lebih besar dari 0
    public boolean isAvailable() {
        return stok > 0;
    }

    // Method yang mengurangi stok produk sejumlah quantity
    public void decreaseStok(int quantity) {
        stok -= quantity;
    }
}
