package No1;

public class Segitiga extends BangunDatar {
    public Segitiga(double alas, double kiri, double kanan, double tinggi){
        super(alas, kanan, kiri, tinggi,0,0, 0);
    }

    void hitungKeliling() {
        double kel = kanan + kiri + alas;
        System.out.println(" Keliling persegi panjang = " + kel);
    }

    void hitungLuas() {
        double luas = 0.5 * alas * tinggi;
        System.out.println(" Luas segitiga = " + luas);
    }
}