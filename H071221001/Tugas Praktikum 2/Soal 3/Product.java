
public class Product {
    private int idProduk;
    private String namaProduk;
    private int stokProduk;
    private double hargaProduk;

    public Product(int id, String nama, int stok, double harga) {
        idProduk = id;
        namaProduk = nama;
        stokProduk = stok;
        hargaProduk = harga;
    }

    public void setIdProduk(int idProduk) {
        this.idProduk = idProduk;
    }

    public int getIdProduk() {
        return idProduk;
    }

    public void setNamaProduk(String namaProduk) {
        this.namaProduk = namaProduk;
    }

    public String getNamaProduk() {
        return namaProduk;
    }

    public void setStokProduk(int stokProduk) {
        this.stokProduk = stokProduk;
    }

    public int getStokProduk() {
        return stokProduk;
    }

    public void setHargaProduk(double hargaProduk) {
        this.hargaProduk = hargaProduk;
    }

    public double getHargaProduk() {
        return hargaProduk;
    }

    public void cekData() {
        System.out.println("ID Produk: " + getIdProduk());
        System.out.println("Nama Produk: " + getNamaProduk());
        System.out.println("Stok Produk: " + getStokProduk());
        System.out.println(" Harga Produk :" + getHargaProduk());
        if (stokProduk <= 0) {
            System.out.println("Produk tidak tersedia");
        } else {
            System.out.println("Produk masih tersesdia");
        }

    }

    public static void main(String[] args) {
        Product produk1 = new Product(1, "Totebag", 10, 100000);
        produk1.cekData();
        Product produk2 = new Product(2, "Kemeja", 10, 50000);
        produk2.cekData();
    }
}
