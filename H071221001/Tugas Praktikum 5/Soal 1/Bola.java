package No1;

public class Bola extends BangunRuang{
    public Bola(double r){
        super(0, 0, 0, 0, r);
    }

    void hitungLuas() {
        double luas = 4 * Math.PI * r* r ;
        System.out.println(" Luas bola = " + luas);
    }

    void hitungVolume() {
        double vol= 4/3 * Math.PI * r * r * r ;
        System.out.println(" Volume bola = " + vol);
    }

}