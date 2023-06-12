package OOP.Praktikum3.assignment_3_3;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Membuat objek Store
        Store store = new Store("Sisfo Computer");
        // Membuat objek user
        User user = new User("Zefanya", 3000);

        // Membuat ArrayList produk bernama products dan menambahkan produk ke dalamnya
        ArrayList<Product> products = new ArrayList<>();
        products.add(new Product("HP Pavilion Gaming 15", 2000, 15));
        products.add(new Product("ASUS VivoBook 15 A516MAO N4020", 4000, 4));
        products.add(new Product("Lenovo IdeaPad S145", 1500, 2));

        // Menambahkan produk-produk ke dalam toko
        store.addProduct(products.get(0));
        store.addProduct(products.get(1));
        store.addProduct(products.get(2));

        // menu:
        while (true) {
            // Menampilkan daftar produk yang ada di toko
            store.listProduct(user);
            int pilih = input.nextInt();
            input.nextLine();

            if (pilih == 0) {
                System.out.println("Terima kasih telah berbelanja di " + store.getName() + "!");
                break; // Jika input adalah 0, break program
            }

            if (pilih == 1 || pilih == 2 || pilih == 3) {
                // Membuat objek product berdasarkan produk yang dipilih
                Product product = products.get(pilih - 1);

                // Menampilkan informasi produk yang dipilih dan meminta konfirmasi dari user
                System.out.println("Apakah anda yakin ingin membeli:");
                System.out.println(product.getName() + ", dengan Harga " + product.getPrice());
                System.out.println("1. Konfirmasi \n2. Batal");
                int a = input.nextInt();
                input.nextLine();

                // Jika user mengkonfirmasi pembelian, lanjutkan proses pembelian
                if (a == 1) {
                    if (store.checkStock(product)) { // Memeriksa apakah stok produk mencukupi
                        if (user.checkBalance(product.getPrice())) { // Memeriksa apakah saldo pengguna mencukupi
                            store.processTransaction(user, product); // Memproses transaksi pembelian dan menampilkan informasi pembelian
                            System.out.println("-------------------");
                            System.out.println("Lanjutkan transaksi? \n1. Iya\n2. Tidak");
                            int b = input.nextInt();
                            input.nextLine();
                            if (b == 1) {
                                continue; // Jika user ingin melanjutkan transaksi, kembali ke awal loop
                            } else {
                                System.out.println("Terima kasih telah berbelanja di " + store.getName() + "!");
                            }
                        } else {
                            System.out.println("Saldo tidak mencukupi!");
                        }
                    } else {
                        System.out.println("Stok barang tidak mencukupi!");
                    }
                } else {
                    System.out.println("Terima kasih telah berbelanja di " + store.getName() + "!");
                    break;
                }
            }
        }
    }
}
