public class Main{
    public static void main(String[] args) {
        Pitbull pitbull = new Pitbull(0, 53);
        System.out.println("Posisi               : " + pitbull.position);
        System.out.println("Panjang rata-rata    : " + pitbull.averageLength);
        pitbull.describe();
        pitbull.move();
        System.out.println("\n");

        // SiberianHusky siberianHusky = new SiberianHusky(0, 60);
        // System.out.println("Posisi               : " + siberianHusky.position);
        // System.out.println("Panjang rata-rata    : " + siberianHusky.averageLength);
        // siberianHusky.describe();
        // siberianHusky.move();
        // System.out.println("\n");

        // Bulldog bulldog = new Bulldog(0, 40);
        // System.out.println("Posisi               : " + bulldog.position);
        // System.out.println("Panjang rata-rata    : " + bulldog.averageLength);
        // bulldog.describe();
        // bulldog.move();
        // System.out.println("\n");

        // GermanShepherd germanShepherd = new GermanShepherd(0, 65);
        // System.out.println("Posisi              : " + germanShepherd.position);
        // System.out.println("Panjang rata-rata   : " + germanShepherd.averageLength);
        // germanShepherd.describe();
        // germanShepherd.move();
        // System.out.println("\n");

        Smartphone smartphone = new Smartphone(1500, "Samsung");
        System.out.println("Nama Brand          : " + smartphone.getBrand());
        System.out.println("Harga Smartphone    : " + smartphone.getPrice());
        smartphone.move();
        System.out.println("\n");

        Car car = new Car(5, "putih", 240);
        System.out.println("Forward Gear        : " + car.getTotalForwardGear());
        System.out.println("Warna Mobil         : " + car.getColor());
        System.out.println("Maksimal Kecepatan  : " + car.getMaxSpeed());
        car.move();
        System.out.println("\n");
        
    }
}