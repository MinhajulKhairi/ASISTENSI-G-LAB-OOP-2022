package No1;

public class BangunRuang {
    protected double panjang;
    protected double tinggi;
    protected double lebar;
    protected double sisi;
    protected double r;

    public BangunRuang(double panjang, double tinggi, double lebar, double sisi, double r) {
        this.panjang = panjang;
        this.tinggi = tinggi;
        this.lebar = lebar;
        this.sisi = sisi;
        this.r = r;
    }

    public double getLebar() {
        return lebar;
    }

    public double getPanjang() {
        return panjang;
    }

    public double getTinggi() {
        return tinggi;
    }

    public double getJari() {
        return r;
    }

    public double getSisi() {
        return sisi;
    }
    void hitungLuas(){}
    void hitungVolume(){}

}
