package No1;

public class Lingkaran extends BangunDatar {
    public Lingkaran(double r){
        super(r,0,0,0);
    }
    

    void hitungKeliling() {
        double kel = 2 * Math.PI * r ;
        System.out.println(" Keliling lingkaran = " + kel);
    }

    void hitungLuas() {
        double luas = Math.PI * r * r ;
        System.out.println(" Luas lingkaran = " + luas);
    }
}

