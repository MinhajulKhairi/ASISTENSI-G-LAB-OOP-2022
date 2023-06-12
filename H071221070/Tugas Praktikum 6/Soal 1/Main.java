class Smartphone implements Move {
    String brand;
    int price;
    
    public Smartphone(String brand, int price) {
        this.brand = brand;
        this.price = price;
    }

    void info() {
        System.out.println(brand + " memiliki harga $" + price + ".");
    }

    @Override
    public void move() {
        System.out.println("Smartphone berpindah");
    }
}

class Car implements Move {
    int totalForwardGear;
    String color;
    int maxSpeed;

    public Car(int totalForwardGear, String color, int maxSpeed) {
        this.totalForwardGear = totalForwardGear;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }

    void info() {
        System.out.println("Toyota AE86 memiliki " + totalForwardGear + " ban depan, dengan warna " + color + " dengan max speed sebesar " + maxSpeed + " mph.");
    }

    @Override
    public void move() {
        System.out.println("Mobil sedang berakselerasi");
    }
}

public class Main {
    public static void main(String[] args) {
        Pitbull pitbull = new Pitbull("Pitbull", "American Pit Bull Terrier", 0, 3);
        pitbull.describe();
        pitbull.move();

        System.out.println("=".repeat(25));

        Smartphone smartphone = new Smartphone("iPhone 13", 599);
        smartphone.info();
        smartphone.move();

        System.out.println("=".repeat(25));

        Car car = new Car(2, "Putih denngan aksen hitam", 120);
        car.info();
        car.move();
    }
}