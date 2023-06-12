public class kaoskaki {
    // attributes
    private String brand;
    private String jenis;
    private int harga; 

    // constructors yg ada parameternya
    public kaoskaki(String brand1, String jenis1, int harga1) {
        this.brand = brand1;
        this.jenis = jenis1;
        this.harga = harga1;
    }
    //constructornya kosong atau default
    public kaoskaki() {
        this.brand = "unknown";
        this.jenis = "unknown";
        this.harga = 0;
    }

    // behaviors
    public void showInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Jenis: " + jenis);
        System.out.println("Harga: " + harga);
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    // main class
    public static void main(String[] args) {
       kaoskaki produk1 = new kaoskaki("Nevada", "Pendek", 300000);
        kaoskaki produk2 = new kaoskaki("converse", "Panjang", 15000);
        kaoskaki produk3 = new kaoskaki();


        produk1.showInfo();
        produk2.showInfo();
        produk3.showInfo();


        produk1.setHarga(350000); //di pnggil untuk ubah harga aslinya

        System.out.println("\nSetelah diupdate:");
        produk1.showInfo();
    }
}