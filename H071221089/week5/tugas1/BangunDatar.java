package com.week5.tugas1;

public class BangunDatar {
    private double luas;
    private double keliling;

    public double getLuas() {
        return luas;
    }
    public void setLuas(double luas) {
        this.luas = luas;
    }
    public double getKeliling() {
        return keliling;
    }
    public void setKeliling(double keliling) {
        this.keliling = keliling;
    }
}

class Persegi extends BangunDatar {
    private double sisi;

    public Persegi(double sisi) {
        super();
        this.sisi = sisi;
        setKeliling(sisi * 4);
        setLuas(sisi * sisi);
    }
}

class PersegiPanjang extends BangunDatar {
    private double panjang;
    private double lebar;

    public PersegiPanjang(double panjang, double lebar) {
        super();
        this.panjang = panjang;
        this.lebar = lebar;
        setKeliling(2*panjang + 2*lebar);
        setLuas(panjang * lebar);
    }
}

class Lingkaran extends BangunDatar {
    private double jariJari;

    public Lingkaran(double jariJari) {
        super();
        this.jariJari = jariJari;
        setKeliling(2 * Math.PI * jariJari);
        setLuas(Math.PI * jariJari * jariJari);
    }
}

class Segitiga extends BangunDatar {
    private double alas;
    private double tinggi;
    private double sisi;

    public Segitiga(double alas, double tinggi, double sisi) {
        super();
        this.alas = alas;
        this.tinggi = tinggi;
        this.sisi = sisi;
        setKeliling(sisi + sisi + sisi);
        setLuas(alas * tinggi / 2);
    }
}

class Trapesium extends BangunDatar {
    private double tinggi;
    private double alas;
    private double sisiMiring;
    private double atas;

    public Trapesium(double tinggi, double alas, double sisiMiring, double atas) {
        super();
        this.tinggi = tinggi;
        this.alas = alas;
        this.sisiMiring = sisiMiring;
        this.atas = atas;
        setKeliling(alas + sisiMiring + tinggi + atas);
        setLuas(tinggi * (alas + atas) / 2);
    }
}
