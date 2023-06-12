package No1;

public class Persegi extends BangunDatar {
   public Persegi(double sisi){
    super(0,sisi,0,0);
   }


    void hitungKeliling() {
        double kel = 4 * sisi;
        System.out.println(" Keliling persegi = " + kel);
    }

    void hitungLuas() {
        double luas = sisi * sisi;
        System.out.println(" Luas persegi = " + luas);
    }
}
