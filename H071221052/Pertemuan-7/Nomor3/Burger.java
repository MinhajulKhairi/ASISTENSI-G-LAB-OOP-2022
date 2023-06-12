package Nomor3;
public class Burger implements Food{
    private int harga = 10000;

    @Override
    public int getPrice() {
        return harga;
    }
}
