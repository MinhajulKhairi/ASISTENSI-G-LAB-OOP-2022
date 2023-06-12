public class BangunRuang {
    private double luasPermukaan;
    private double volume;

    public void setLuasPermukaan(double luasPermukaan) {
        this.luasPermukaan = luasPermukaan;
    }

    public double getLuasPermukaan() {
        return luasPermukaan;
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
        super.setLuasPermukaan(6 * sisi * sisi);
        super.setVolume(sisi * sisi * sisi);
    }

}

class Balok extends BangunRuang {
    private double panjang, lebar, tinggi;

    public Balok(double panjang, double lebar, double tinggi) {
        super.setLuasPermukaan(2 * (panjang * lebar + lebar * tinggi + panjang * tinggi));
        super.setVolume(panjang * lebar * tinggi);
    }

}

class Bola extends BangunRuang {
    private double jariJari;

    public Bola(double jariJari) {
        super.setLuasPermukaan(4 * Math.PI * jariJari * jariJari);
        super.setVolume(4 * Math.PI * jariJari * jariJari * jariJari / 3);
    }

}

class Tabung extends BangunRuang {
    private double jariJari, tinggi;

    public Tabung(double jariJari, double tinggi) {
        super.setLuasPermukaan(2 * Math.PI * jariJari * (jariJari + tinggi));
        super.setVolume(Math.PI * jariJari * jariJari * tinggi);
    }

}
