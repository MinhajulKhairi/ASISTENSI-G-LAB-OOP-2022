package No1;

public class Tabung extends BangunRuang {
    public Tabung(double r, double tinggi){
        super(0, tinggi, 0, 0, r);
    }

 
    void hitungLuas() {
        double luas = 2 * Math.PI * r * (r + tinggi);
        System.out.println(" Luas tabung = " + luas);
    }

    void hitungVolume() {
        double vol = 4 / 3 * Math.PI * r * r * r;
        System.out.println(" Volume tabung = " + vol);
    }

}
