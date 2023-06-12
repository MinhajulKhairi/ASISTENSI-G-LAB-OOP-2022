package No1;

public class Trapesium extends BangunDatar {

    public Trapesium(double tinggi,double atas, double bawah, double miring){
        super(0, 0, 0, tinggi,atas,bawah, miring);
    }
   
    void hitungKeliling() {
        double kel = atas + bawah + (2 * miring);
        System.out.println(" Keliling trapesium = " + kel);
    }


    void hitungLuas() {
        double luas = 0.5 * (atas + bawah) * tinggi;
        System.out.println(" Luas segitiga = " + luas);
    }
}



