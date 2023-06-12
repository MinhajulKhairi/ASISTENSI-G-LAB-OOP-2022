package No1;

public class PersegiPanjang extends BangunDatar {
    public PersegiPanjang(double panjang, double lebar) {
        super(0, 0, panjang, lebar);
    }
    void hitungKeliling() {
        double kel = 2 * (panjang + lebar);
        System.out.println(" Keliling persegi panjang = " + kel);
    }

    void hitungLuas() {
        double luas = panjang * lebar;
        System.out.println(" Luas persegi panjang = " + luas);
    }
}

