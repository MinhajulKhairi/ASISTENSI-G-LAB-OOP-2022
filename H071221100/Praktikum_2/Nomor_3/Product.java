
class Product {
    //atribut
    String ID;
    String name;
    int stock;
    double price;

    //konstruktor menginisialisasi atribut
    Product(String id, String nama, int stok, double harga) {
        ID = id;
        name = nama;
        stock = stok;
        price = harga;
    }

    //method utk mndapatkan nilai id
    String getId() {
        return ID;
    }

    //method utk mndapatkan nilai nama
    String getName() {
        return name;
    }

    //method utk mndapatkan/ nilai stok
    public int getStock() {
        return stock;
    }

    //method utk mndapatkan nilai harga
    double getPrice() {
        return price;
    }

    //method utk mngecek jumlah stok
    public boolean pengecekanStock() {
        return stock > 0;
    }

    //method utk mnampilkan detail dari produk
    void tampilkanDetail() {
        System.out.println("ID produk:" + ID);
        System.out.println("Nama Produk: " + name);
        System.out.println("Stok Produk: " + stock);
        System.out.println("Harga Produk: " + price);
        boolean isExist = pengecekanStock();
        if (isExist) {
            System.out.println("Produk masih ada");
        } else {
            System.out.println("Produk sudah habis");
        }
    }

    public static void main(String[] args) {
        Product produk1 = new Product("L996", "Le Minerale", 250, 5.1000);
        produk1.tampilkanDetail();
        Product produk2 = new Product("C01", "Chocolatos", 0, 1000);
        
        produk2.tampilkanDetail();

    }
}