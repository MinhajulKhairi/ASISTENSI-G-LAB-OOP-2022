package No1;

public class Kubus extends BangunRuang{
    public Kubus(double sisi){
        super(0, 0, 0, sisi,0);
    }
    
    void hitungLuas() {
        double luas =  6 * sisi * sisi;
        System.out.println(" Luas kubus = " + luas);
    }

    void hitungVolume() {
       double vol = sisi * sisi * sisi;
       System.out.println(" Volume kubus = " + vol);
    }
}
