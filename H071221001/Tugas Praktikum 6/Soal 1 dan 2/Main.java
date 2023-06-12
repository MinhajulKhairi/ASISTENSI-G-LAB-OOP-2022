
public class Main {
    public static void main(String[] args) {
        Smartphone smartphone = new Smartphone(799, "iPhone");
        Car car = new Car(5, "Silver", 180);
        SiberianHusky siberianHusky = new SiberianHusky(8, 60);

        System.out.println("Smartphone");
        smartphone.move();
        System.out.println("=".repeat(20));
        System.out.println("Car");
        car.move();
        System.out.println("=".repeat(20));
        System.out.println("Siberian Husky");
        siberianHusky.move();
        siberianHusky.describe();
    }
}

