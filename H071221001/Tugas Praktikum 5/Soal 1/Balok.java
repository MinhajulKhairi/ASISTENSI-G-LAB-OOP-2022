package No1;

public class Balok extends BangunRuang {
    public Balok(double panjang, double lebar, double tinggi) {
        super(panjang, lebar, tinggi, 0, 0);
    }

    void hitungLuas() {
        double luas = 2 * (panjang * lebar + panjang * tinggi + lebar * tinggi);
        System.out.println(" Luas balok = " + luas);
    }

    void hitungVolume() {
        double vol = panjang * lebar * tinggi;
        System.out.println(" Volume balok = " + vol);
    }

}