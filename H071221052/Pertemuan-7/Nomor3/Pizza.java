package Nomor3;
public class Pizza implements Food{
    private int harga = 30000;

    @Override
    public int getPrice() {
        return harga;
    }
}