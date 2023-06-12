import java.util.Scanner;

class Cuboid {
    double height;
    double width;
    double length;

    double getVolume() {
        double getVolume = length*width*height;
        return getVolume;
    }
}

public class No4 {
    public static void main(String[] args) {
        Cuboid cuboid = new Cuboid(); //method
        cuboid.height = 15.0;
        cuboid.width = 15.0;
        cuboid.length = 20.0;
        System.out.printf("Volume = %.2f", cuboid.getVolume()); //mencetak niai volume dri objek cuboid
    }
}