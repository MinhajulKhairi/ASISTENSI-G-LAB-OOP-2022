package assignment_5_1_soaljava;

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

class Persegi extends BangunDatar{
    private double sisi;

    public Persegi(double sisi){
        this.setKeliling(4 * sisi);
        this.sisi = sisi;
    }
    public double keliling(){
        return 4 * sisi;
    }
    public double luas(){
        return sisi * sisi;
    }
}

class PersegiPanjang extends BangunDatar{
    private double panjang;
    private double lebar;

    public PersegiPanjang(double panjang, double lebar){
        this.panjang = panjang;
        this.lebar = lebar;
    }
    public double keliling(){
        return 2 * (panjang + lebar );
    }
    public double luas(){
        return panjang * lebar ;
    }
}

class Lingkaran extends BangunDatar{
    private double jariJari;

    public Lingkaran(double jariJari){
        this.jariJari = jariJari;
    }
    public double keliling(){
        return 2 * Math.PI * jariJari;
    }
    public double luas(){
        return Math.PI * jariJari * jariJari;
    }
}

class Segitiga extends BangunDatar{
    private double alas;
    private double tinggi;
    private double sisi;

    public Segitiga(double alas, double tinggi, double sisi){
        this.alas = alas;
        this.tinggi = tinggi; 
        this.sisi = sisi;
    }
    public double keliling(){
        return sisi + tinggi + alas;
    }
    public double luas(){
        return alas * tinggi / 2;
    }
}

class Trapesium extends BangunDatar{
    private double tinggi;
    private double alas;
    private double sisimiring;
    private double atas;
 
    public Trapesium(double tinggi, double alas, double sisimiring, double atas) {
        this.tinggi = tinggi;
        this.alas = alas;
        this.sisimiring = sisimiring;
        this.atas = atas;
    }
    public double keliling(){
        return alas + sisimiring * 2 + atas;
    }
    public double luas(){
        return ((alas + atas) * tinggi)/2;
    }
}