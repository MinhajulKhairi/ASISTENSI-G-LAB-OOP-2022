
public class Car implements Move {
    int totalForwardGear;
    String color;
    int maxSpeed;

   public Car(int totalForwardGear, String color, int maxSpeed) {
       this.totalForwardGear = totalForwardGear;
       this.color = color;
       this.maxSpeed = maxSpeed;
   }

   public void move() {
       System.out.println("Mobil sedang berakselerasi");
   }
}
