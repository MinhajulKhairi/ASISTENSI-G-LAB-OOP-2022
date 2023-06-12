public class BangunRuang {
    // public doble hitungVolume();
    // public double hitungLuasPermukaan();

    public double hitungVolume(double luas) {
        return luas;
    }

    public double hitungLuasPermukaan(double Keliling) {
        return Keliling;
    }
}

class Kubus extends BangunRuang {
    private double sisi;

    public Kubus(double sisi) {
        this.sisi = sisi;
    }

    // @Override
    public double hitungVolume() {
        // return sisi * sisi * sisi;
        return super.hitungVolume(sisi * sisi * sisi);
    }

    // @Override
    public double hitungLuasPermukaan() {
        // return 6 * sisi * sisi;
        return super.hitungLuasPermukaan(6 * sisi * sisi);
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
    }

    // @Override
    public double hitungVolume() {
        // return panjang * lebar * tinggi;
        return super.hitungVolume(panjang * lebar * tinggi);
    }

    // @Override
    public double hitungLuasPermukaan() {
        // return 2 * ((panjang * lebar) + (panjang * tinggi) + (lebar * tinggi));
        return super.hitungLuasPermukaan(2 * ((panjang * lebar) + (panjang * tinggi) + (lebar * tinggi)));
    }
}

class Bola extends BangunRuang {
    private double jariJari;

    public Bola(double jariJari) {
        this.jariJari = jariJari;
    }

    // @Override
    public double hitungVolume() {
        // return 4 * Math.PI * jariJari * jariJari * jariJari / 3;
        return super.hitungVolume(4 * Math.PI * jariJari * jariJari * jariJari / 3);
    }

    // @Override
    public double hitungLuasPermukaan() {
        // return 4 * Math.PI * jariJari * jariJari;
        return super.hitungLuasPermukaan(4 * Math.PI * jariJari * jariJari);
    }
}

class Tabung extends BangunRuang {
    private double jariJari;
    private double tinggi;

    public Tabung(double jariJari, double tinggi) {
        this.jariJari = jariJari;
        this.tinggi = tinggi;
    }

    // @Override
    public double hitungVolume() {
        // return Math.PI * jariJari * jariJari * tinggi;
        return super.hitungVolume(Math.PI * jariJari * jariJari * tinggi);
    }

    // @Override
    public double hitungLuasPermukaan() {
        // return 2 * Math.PI * jariJari * (jariJari + tinggi);
        return super.hitungLuasPermukaan(2 * Math.PI * jariJari * (jariJari + tinggi));
    }
}
