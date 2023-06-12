package OOP.Praktikum2.assignment_2_5;

public class Mahasiswa {
    // Deklarasi atribut-atribut dari class Mahasiswa
    String nama;
    String nim;
    Alamat alamat;

    // Method setter untuk mengubah nilai atribut nama
    public void setNama(String nama) {
        this.nama = nama;
    }

    // Method getter untuk mengambil nilai atribut nama
    public String getNama() {
        return nama;
    }

    // Method setter untuk mengubah nilai atribut nim
    public void setNim(String nim) {
        this.nim = nim;
    }

    // Method getter untuk mengambil nilai atribut nim
    public String getNim() {
        return nim;
    }

    // Method setter untuk mengubah nilai atribut alamat
    public void setAlamat(Alamat alamat) {
        this.alamat = alamat;
    }

    // Method getter untuk mengambil nilai atribut alamat
    public Alamat getAlamat() {
        return alamat;
    }
}
