import java.lang.reflect.Constructor;

import javax.management.ConstructorParameters;

public class BangunDatar {
    private double keliling;
    private double luas;

    public double getKeliling() {
        return keliling;
    }

    public void setKeliling(double keliling) {
        this.keliling = keliling;
    }

    public double getLuas() {
        return luas;
    }

    public void setLuas(double luas) {
        this.luas = luas;
    }
}

class Persegi extends BangunDatar {
    public Persegi(double sisi) {
        super.setKeliling(sisi + sisi + sisi + sisi);
        super.setLuas(sisi * sisi);
    }
}

class persegiPanjang extends BangunDatar {
    private double panjang, lebar;

    public persegiPanjang(double panjang, double lebar) {
        super.setKeliling(2 * (panjang + lebar));
        super.setLuas(panjang * lebar);
    }

}

class Lingkaran extends BangunDatar {
    private double jariJari;

    public Lingkaran(double jariJari) {
        super.setKeliling(2 * Math.PI * jariJari);
        super.setLuas(Math.PI * jariJari * jariJari);
    }
}

class Segitiga extends BangunDatar {
    private double alas, tinggi, sisi;

    public Segitiga(double alas, double tinggi, double sisi) {
        super.setKeliling(sisi + sisi + sisi);
        super.setLuas(alas * tinggi / 2);
    }
}

class Trapesium extends BangunDatar {
    private double tinggi, alas, sisiMiring, atas;

    public Trapesium(double tinggi, double alas, double sisiMiring, double atas) {
        super.setKeliling(alas + sisiMiring + tinggi + atas);
        super.setLuas(tinggi * (alas + atas) / 2);
    }
}
