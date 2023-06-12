class Kopi {
    String merek;
    public String jenis;
    int pembelian;
    double harga;
    
    public Kopi() {
    }

    public Kopi(String merek, String jenis, int pembelian, double harga) {
        this.merek = merek;
        this.jenis = jenis;
        this.pembelian = pembelian;
        this.harga = harga;
    }

    public Kopi(String merek, String jenis, double harga) {
        this.merek = merek;
        this.jenis = jenis;
        this.pembelian = 3;
        this.harga = harga;
    }

    public String getMerekString() {
        return merek;
    }

    String getJenis() {
        return jenis;
    }

    int getPembelian() {
        return pembelian;
    }

    void detailCoffee() {
        System.out.println("Merek kopi : " + merek);
        System.out.println("Jenis kopi : " + jenis);
        System.out.println("Pembelian : " + pembelian);
        System.out.println("Harga per cup: " + harga);
    }

    public double HargaKopi() {
        return pembelian * harga;
    }

    public static void main(String[] args) {
        Kopi kopi1 = new Kopi("Janji Jiwa", "Latte", 2, 230000);
        Kopi kopi2 = new Kopi("kopi kenangan", "Americano", 20000);

        kopi1.detailCoffee();
        System.out.println("Total harga:" + kopi1.HargaKopi());
        System.out.println("-------------------------------------------------------");
        kopi2.detailCoffee();
        System.out.println("Total harga: " + kopi2.HargaKopi());

    }
}
