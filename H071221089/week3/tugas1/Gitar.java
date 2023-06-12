package com.week3.tugas1;

public class Gitar {
    private String merk;
    private int jumlahSenar;
    private PemilikGitar pemilik;

    public Gitar(String merk, int jumlahSenar) {
        this.merk = merk;
        this.jumlahSenar = jumlahSenar;
    }

    public Gitar(String merk, int jumlahSenar, PemilikGitar pemilik) {
        this.merk = merk;
        this.jumlahSenar = jumlahSenar;
        this.pemilik = pemilik;
    }

    public void mainkan() {
        System.out.println("Bermain gitar " + merk);
    }

    public void tune(String senar, String nada) {
        System.out.println("Menyetel senar " + senar + " dengan nada " + nada);
    }

    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public int getJumlahSenar() {
        return jumlahSenar;
    }

    public void setJumlahSenar(int jumlahSenar) {
        this.jumlahSenar = jumlahSenar;
    }

    public PemilikGitar getPemilik() {
        return pemilik;
    }

    public void setPemilik(PemilikGitar pemilik) {
        this.pemilik = pemilik;
    }
}




