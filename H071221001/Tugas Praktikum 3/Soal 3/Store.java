package No3;


import java.util.ArrayList;

public class Store {
    String name;
    ArrayList<String> products = new ArrayList<>();
    ArrayList<Integer> productPrice = new ArrayList<>();
    ArrayList<Integer> productStok = new ArrayList<>();

    public Store(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void tambahProduct(Product barang) {
        products.add(barang.getName());
        productPrice.add(barang.getPrice());
        productStok.add(barang.getStock());
    }

    public void listProduct() {
        System.out.printf("Selamat datang di %s\n", this.getName());
        System.out.println("Daftar Produk");
        for (int i = 0; i < products.size(); i++) {
            System.out.printf("%d. %s - $%d | Stok %d\n", i + 1, products.get(i), productPrice.get(i),
                    productStok.get(i));
        }
    }

    public void konfirmasi(int n) {
        System.out.printf("Apakah anda yakin ingin membeli? %s, dengan harga $%d\n", products.get(n),
                productPrice.get(n));
        System.err.println("1.Konfirmasi");
        System.out.println("2.Batal");
    }

    public void transaksi(int n, User user) {
        Product barang = new Product(products.get(n), productPrice.get(n),
                productStok.get(n));

        if (barang.getStock() > 0) {
            if (user.getBalance() >= productPrice.get(n)) {
                user.setBalance(user.getBalance() - barang.getPrice());
                productStok.set(n, barang.jualProduk());
                System.out.printf("%s berhasil membeli %s.\n", user.getName(), products.get(n));
                System.out.println("--------------------");
                System.out.println("Lanjutkan Transaksi");
                System.out.println("1.iya");
                System.out.println("2. tidak");
                if (barang.getStock() <= 0 || productStok.get(n) <= 0) {
                    products.remove(n);
                    productPrice.remove(n);
                    productStok.remove(n);
                }
            } else {
                System.out.println("Uang anda tidak mencukupi");
                System.out.printf("%s gagal membeli %s.\n", user.getName(), products.get(n));
                System.out.println("--------------------");
                System.out.println("Lanjutkan Transaksi");
                System.out.println("1.iya");
                System.out.println("2. tidak");
            }
        } else {

            products.remove(n);
            productPrice.remove(n);
            productStok.remove(n);
        }

    }
}
