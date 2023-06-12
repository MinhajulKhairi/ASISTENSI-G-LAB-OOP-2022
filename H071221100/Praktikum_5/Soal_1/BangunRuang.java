public class BangunRuang {
    private double hitungLuasPermukaan;
    private double hitungVoulme;

    public double getHitungLuasPermukaan() {
        return hitungLuasPermukaan;
    }
    public void setHitungLuasPermukaan(double hitungLuasPermukaan) {
        this.hitungLuasPermukaan = hitungLuasPermukaan;
    }
    public double getHitungVoulme() {
        return hitungVoulme;
    }
    public void setHitungVoulme(double hitungVoulme) {
        this.hitungVoulme = hitungVoulme;
    }

}

class BangunDatar {
    private double hitungLuas;
    private double hitungKeliling;

    public double getHitungLuas() {
        return hitungLuas;
    }
    public void setHitungLuas(double hitungLuas) {
        this.hitungLuas = hitungLuas;
    }
    public double getHitungKeliling() {
        return hitungKeliling;
    }
    public void setHitungKeliling(double hitungKeliling) {
        this.hitungKeliling = hitungKeliling;
    }
}

class Kubus extends BangunRuang {
        private double sisi;
    
        public Kubus(double sisi) {
            this.sisi = sisi;
        }
    
        public double hitungVolume() {
            return sisi * sisi * sisi;
        }
    
        public double hitungLuasPermukaan() {
            return 6 * sisi * sisi;
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

    public double hitungVolume() {
        return panjang * lebar * tinggi;
    }

    public double hitungLuasPermukaan() {
        return 2 * (panjang * lebar + panjang * tinggi + lebar * tinggi);
    }
}

class Bola extends BangunRuang{
    private double jariJari;

    public Bola(double jariJari) {
        this.jariJari = jariJari;
    }

    public double hitungVolume(){
        return 4/3 * Math.PI * Math.pow(jariJari, 3);
    }

    public double hitungLuasPermukaan(){
        return 4 * Math.PI * Math.pow(jariJari, 2);
    }
}

class Tabung extends BangunRuang {
    private double jariJari;
    private double tinggi;

    public Tabung(double jariJari, double tinggi) {
        this.jariJari = jariJari;
        this.tinggi = tinggi;
    }

    public double hitungVolume() {
        return Math.PI * Math.pow(jariJari, 2) * tinggi;
    }

    public double hitungLuasPermukaan() {
        return 2 * Math.PI * jariJari * (jariJari + tinggi);
    }
}

class Persegi extends BangunDatar {
    private double sisi;

    public Persegi(double sisi) {
        this.sisi = sisi;
    }

    public double hitungLuas() {
        return sisi * sisi;
    }

    public double hitungKeliling() {
        return 4 * sisi;
    }
}

class PersegiPanjang extends BangunDatar {
    private double panjang;
    private double lebar;

    public PersegiPanjang(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    public double hitungLuas() {
        return panjang * lebar;
    }

    public double hitungKeliling() {
        return 2 * (panjang + lebar);
    }
}

class Lingkaran extends BangunDatar {
    private double jariJari;

    public Lingkaran(double jariJari) {
        this.jariJari = jariJari;
    }

    public double hitungLuas() {
        return Math.PI * Math.pow(jariJari, 2);
    }

    public double hitungKeliling() {
        return 2 * Math.PI * jariJari;
    }
}

class Segitiga extends BangunDatar {
    private double alas;
    private double tinggi;
    private double sisi1;
    private double sisi2;
    private double sisi3;
    
    public Segitiga(double alas, double tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }

    public Segitiga(double alas, double tinggi, double sisi1, double sisi2, double sisi3) {
        this.alas = alas;
        this.tinggi = tinggi;
        this.sisi1 = sisi1;
        this.sisi2 = sisi2;
        this.sisi3 = sisi3;
    }

    public double hitungLuas() {
        return 0.5 * alas * tinggi;
    }

    public double hitungKeliling() {
        return sisi1 + sisi2 + sisi3;
    }
}

class Trapesium extends BangunDatar {
        private double sisi1;
        private double sisi2;
        private double sisi3;
        private double sisi4;
        private double tinggi;
    
        public Trapesium(double sisi1, double sisi2, double sisi3, double sisi4,  double tinggi) {
            this.sisi1 = sisi1;
            this.sisi2 = sisi2;
            this.sisi3 = sisi3;
            this.sisi4 = sisi4;
            this.tinggi = tinggi;
        }
    
        public double hitungLuas() {
            return 0.5 * (sisi1 + sisi2) * tinggi;
        }
    
        public double hitungKeliling() {
            return sisi1 + sisi2 + sisi3 + sisi4;
        }
    }