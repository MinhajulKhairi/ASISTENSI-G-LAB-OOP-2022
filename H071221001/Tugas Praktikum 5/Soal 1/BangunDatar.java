package No1;

public class BangunDatar {
    protected double r;
    protected double sisi;
    protected double panjang;
    protected double lebar;
    protected double alas;
    protected double tinggi;
    protected double kiri;
    protected double kanan;
    protected double atas;
    protected double bawah;
    protected double miring;
    
    public BangunDatar(double r, double sisi, double panjang, double lebar){
        this.panjang = panjang;
        this.lebar = lebar;
        this.r = r;
        this.sisi = sisi;
    }
    public BangunDatar(double alas, double kiri, double kanan,double tinggi, double atas, double bawah, double miring){
        this.alas = alas;
        this.kiri = kiri;
        this.kanan = kanan;
        this.tinggi = tinggi;
        this.atas = atas;
        this.bawah = bawah;
        this.miring = miring;
    }
    
    public double getR() {
        return r;
    }
    public double getSisi() {
        return sisi;
    }
    public double getPanjang() {
        return panjang;
    }
    public double getLebar() {
        return lebar;
    }
    public double getAlas() {
        return alas;
    }
    public double getTinggi() {
        return tinggi;
    }
    public double getKiri() {
        return kiri;
    }
    public double getKanan() {
        return kanan;
    }
    public double getAtas() {
        return atas;
    }
    public double getBawah() {
        return bawah;
    }
    public double getMiring() {
        return miring;
    }

    void hitungKeliling(){}
    void hitungLuas(){}

}
