package com.week2.tugas5;
class Alamat {
    String jalan;
    String kota;

    String getAlamatLengkap() {
        return jalan + ", " + kota;
    }
}

class Mahasiswa {
    String nama;
    String nim;
    Alamat alamat;

    String getNama() {
        return nama;
    }

    String getNim() {
        return nim;
    }

    String getAlamat() {
        return alamat.jalan + ", " + alamat.kota;
    }

    String getAlamatLengkap() {
        return alamat.getAlamatLengkap();
    }
}
public class main {
    public static void main(String[] args) {
        Alamat alamat = new Alamat();
        alamat.jalan = "pettarani";
        alamat.kota = "Makassar";
        
        Mahasiswa mahasiswa = new Mahasiswa();
        mahasiswa.alamat = alamat;
        mahasiswa.nama = "haikal";
        mahasiswa.nim = "H071221089";

        System.out.println("Nama : " + mahasiswa.getNama());
        System.out.println("NIM : " + mahasiswa.getNim());
        System.out.println("Alamat : " + mahasiswa.getAlamatLengkap());
    }
}
