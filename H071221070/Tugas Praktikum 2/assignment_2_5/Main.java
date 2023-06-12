package OOP.Praktikum2.assignment_2_5;

public class Main {
    public static void main(String[] args) {
        Alamat alamat = new Alamat();
        alamat.jalan = "Landak Baru";
        alamat.kota = "Makassar";

        Mahasiswa mahasiswa = new Mahasiswa();
        mahasiswa.alamat = alamat;
        mahasiswa.nama = "Farrel";
        mahasiswa.nim = "H071221070";

        System.out.println("Nama: " + mahasiswa.getNama());
        System.out.println("NIM: " + mahasiswa.getNim());
        System.out.println("Alamat: " + mahasiswa.getAlamat().getAlamatLengkap());
    }
}
