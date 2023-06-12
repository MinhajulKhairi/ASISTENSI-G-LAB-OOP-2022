package assignment_no_1;

public class Car implements SmartCar{
    private int totalForwardGear;
    private String color;
    private int maxSpeed;
    
  
    public Car(int totalForwardGear, String color, int maxSpeed) {
        this.totalForwardGear = totalForwardGear;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }

    @Override
    public void showDetail(){
        System.out.println("Car");
        System.out.println("Total Forward Gear : " + totalForwardGear);
        System.out.println("Color : " + color);
        System.out.println("Max Speed : " + maxSpeed+ " KMh");
    }
    public void move() {
        System.out.println("Mobil sedang berakselerasi");
    }
}

