package com.week5.tugas1;

public class BangunRuang {
    private double luasPermukaan;
    private double volume;

    public double getLuasPermukaan() {
        return luasPermukaan;
    }

    public void setLuasPermukaan(double luasPermukaan) {
        this.luasPermukaan = luasPermukaan;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }
}


class Kubus extends BangunRuang {
    private double sisi;

    public Kubus(double sisi) {
        this.sisi = sisi;
        super.setLuasPermukaan(6 * sisi * sisi);
        super.setVolume(sisi * sisi * sisi);
    }
}

class Balok extends BangunRuang {
    private double panjang;
    private double lebar;
    private double tinggi;

    public Balok(double panjang, double lebar, double tinggi) {
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
        super.setLuasPermukaan(2 * ((panjang * lebar) + (panjang * tinggi) + (lebar * tinggi)));
        super.setVolume(panjang * lebar * tinggi);
    }
}

class Bola extends BangunRuang {
    private double jariJari;

    public Bola(double jariJari) {
        this.jariJari = jariJari;
        super.setLuasPermukaan(4 * Math.PI * jariJari * jariJari);
        super.setVolume((4.0 / 3.0) * Math.PI * Math.pow(jariJari, 3));
    }
}

class Tabung extends BangunRuang {
    private double jariJari;
    private double tinggi;

    public Tabung(double jariJari, double tinggi) {
        this.jariJari = jariJari;
        this.tinggi = tinggi;
        super.setLuasPermukaan(2 * Math.PI * jariJari * (jariJari + tinggi));
        super.setVolume(Math.PI * jariJari * jariJari * tinggi);
    }
}

