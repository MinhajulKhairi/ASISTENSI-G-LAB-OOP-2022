package assignment_no_1;

public class Smartphone implements SmartCar{
    private int price;
    private String brand;

    public Smartphone(int price, String brand) {
        this.price = price;
        this.brand = brand;
    }

    @Override
    public void showDetail(){
        System.out.println("\nSmartphone");
        System.out.println("Price : Rp." + price);
        System.out.println("Brand : " + brand);
    }
    public void move(){
        System.out.println("Smartphone berpindah");
    }
}