package com.week3.tugas1;

public class main {
    public static void main(String[] args) {
        // Membuat objek PemilikGitar
        PemilikGitar pemilik = new PemilikGitar("haikal", "makassar");

        // Membuat objek Gitar
        Gitar gitar1 = new Gitar("yamaha", 6, pemilik);

        // Mengakses atribut dan method pada objek Gitar dan PemilikGitar
        System.out.println("Merk gitar: " + gitar1.getMerk());
        System.out.println("Nama pemilik: " + gitar1.getPemilik().getNama());
        System.out.println("alamat pemilik: " + gitar1.getPemilik().getAlamat());
        System.out.println("Jumlah senar: " + gitar1.getJumlahSenar());
        
        gitar1.mainkan();
        gitar1.tune("E", "G");

        PemilikGitar pemilikBaru = new PemilikGitar("zefanya nabilah putri shadiq", "makassar");
        gitar1.setPemilik(pemilikBaru);

        // Memanggil getter lagi untuk memastikan nilai atribut pemilik telah diubah
        System.out.println("Pemilik gitar baru: " + gitar1.getPemilik().getNama());
        System.out.println("alamat pemilik baru: " + gitar1.getPemilik().getAlamat());
    }
}
