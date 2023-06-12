public class BangunDatar {
    private double luas, keliling;
    // public double hitungKeliling();

    // public double hitungLuas();

    public double hitungLuas(double luas) {
        return luas;
    }

    public double hitungKeliling(double Keliling) {
        return Keliling;
    }
}

class Persegi extends BangunDatar {
    private double sisi;

    public Persegi(double sisi) {
        this.sisi = sisi;
    }

    // @Override
    public double hitungLuas() {
        // return sisi * sisi
        return super.hitungLuas(sisi * sisi);
    }

    // @Override
    public double hitungKeliling() {
        // return 4 * sisi;
        return super.hitungKeliling(4 * sisi);
    }
}

class PersegiPanjang extends BangunDatar {
    private double panjang;
    private double lebar;

    public PersegiPanjang(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    // @Override
    public double hitungLuas() {
        // return panjang * lebar;
        return super.hitungLuas(panjang * lebar);
    }

    // @Override
    public double hitungKeliling() {
        // return 2 * (panjang + lebar);
        return super.hitungKeliling(panjang + lebar);
    }
}

class Lingkaran extends BangunDatar {
    private double jariJari;

    public Lingkaran(double jariJari) {
        this.jariJari = jariJari;
    }

    // @Override
    public double hitungLuas() {
        // return Math.PI * jariJari * jariJari;
        return super.hitungLuas(Math.PI * jariJari * jariJari);
    }

    // @Override
    public double hitungKeliling() {
        // return 2 * Math.PI * jariJari;
        return super.hitungKeliling(Math.PI * jariJari);
    }
}

class SegiTiga extends BangunDatar {
    private double alas;
    private double tinggi;
    private double sisi1;
    private double sisi2;
    private double sisi3;

    public SegiTiga(double alas, double tinggi, double sisi1, double sisi2, double sisi3) {
        this.alas = alas;
        this.tinggi = tinggi;
        this.sisi1 = sisi1;
        this.sisi2 = sisi2;
        this.sisi3 = sisi3;
    }

    // @Override
    public double hitungLuas() {
        // return 0.5 * alas * tinggi;
        return super.hitungLuas(0.5 * alas * tinggi);
    }

    // @Override
    public double hitungKeliling() {
        // return sisi1 + sisi2 + sisi3;
        return super.hitungKeliling(sisi1 + sisi2 + sisi3);
    }
}

class Trapesium extends BangunDatar {
    private double sisiAtas;
    private double sisiBawah;
    private double tinggi;
    private double sisiMiring;

    public Trapesium(double sisiAtas, double sisiBawah, double tinggi, double sisiMiring) {
        this.sisiAtas = sisiAtas;
        this.sisiBawah = sisiBawah;
        this.tinggi = tinggi;
        this.sisiMiring = sisiMiring;
    }

    // @Override
    public double hitungLuas() {
        // return 0.5 * (sisiAtas + sisiBawah) * tinggi;
        return super.hitungLuas(0.5 * (sisiAtas + sisiBawah) * tinggi);
    }

    // @Override
    public double hitungKeliling() {
        // return sisiAtas + sisiBawah + 2 * sisiMiring;
        return super.hitungKeliling(sisiAtas + sisiBawah + 2 * sisiMiring);
    }
}
