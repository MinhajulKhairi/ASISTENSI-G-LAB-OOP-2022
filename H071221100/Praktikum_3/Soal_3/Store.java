import java.util.List;

public class Store {
    String name;
    List <Product> product;

    public Store(String name, List <Product> product){
        this.name = name;
        this.product = product;
    }

    public String getName() {
        return name;
    }

    public List <Product> getProduct() {
        return product;
    }

    public void listProduct() {
        int i = 1;
        System.out.printf("Selamat datang di %s%nDaftar Produk:%n", this.getName()); //%s menunjukkan bahwa pada posisi tersebut akan disi dengan nilai string pada saat program dijalankan, %n bahasa pemrograman untuk memberi tahu program untuk mengakhiri baris atau baris baru pada output.
        for (Product produk : this.product) {
            System.out.printf("%d. %s - $%d | Stok %d%n", i, produk.getName(), produk.getPrice(), produk.getStock()); //%d menunjukkan bahwa pada posisi tersebut akan diisi dengan nilai bilangan bulat (integer) pada saat program dijalankan.
            i++;
        }
        System.out.println("0. Keluar");
    }

    public void TambahProduk(Product product) {
        this.product.add(product);
    }

    public void transaksi(User user , Product product, int index) {
                user.balance -= product.price;
                product.stock--;
                if (product.stock == 0) {
                    this.product.remove(index);
                }
            }
}

