package OOP.Praktikum2.assignment_2_1;

public class Musisi {
    // Deklarasi atribut-atribut dari class musisi
    private String nama;
    private String tanggalLahir;
    private int umur;
    private String kebangsaan;
    private String karya;

    public Musisi(String nama, String tanggalLahir, int umur, String kebangsaan, String karya) {
        // Konsturktor dari class musisi
        this.nama = nama;
        this.tanggalLahir = tanggalLahir;
        this.umur = umur;
        this.kebangsaan = kebangsaan;
        this.karya = karya;
    }

    // Method untuk menampilkan info kebangsaan musisi
    public void infoBangsa() {
        System.out.println(this.nama + " adalah seorang musisi berkebangsaan " + this.kebangsaan + ".");
    }
    // Method untuk menampilkan info tanggal lahir dan umur musisi
    public void infoUmur() {
        System.out.println(this.nama + " lahir pada tanggal " + this.tanggalLahir + " dan berumur " + this.umur + ".");
    }
    // Method untuk menampilkan info karya terkenal dari musisi
    public void infoKarya() {
        System.out.println("Karya terkenal dari " + this.nama + " adalah \"" + this.karya + "\".");
    }
}