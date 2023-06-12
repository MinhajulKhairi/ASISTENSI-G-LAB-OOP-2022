package Nomor3;
public class Steak implements Food{
    private int harga = 25000;
    

    @Override
    public int getPrice() {
        return harga;
    }
}