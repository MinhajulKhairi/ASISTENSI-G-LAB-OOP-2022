package OOP.Praktikum2.assignment_2_4;

class Cuboid {
    // Membuat atribut dari balok
    double height;
    double width;
    double length;

    // Membuat method getVolume untuk menghitung volume balok
    double getVolume() {
        return height * width * length; // Return hasil perkalian
    }
}
public class Main {
    public static void main(String[] args) {
        Cuboid cuboid = new Cuboid();
        // Mengisi nilai masing-masing atribut
        cuboid.height = 10; // nilai tinggi
        cuboid.width = 15; // nilai lebar
        cuboid.length = 30; // nilai panjang

        // Print hasil volume dengan menggunakan print format agar terdapat 2 angka di belakang koma
        System.out.printf("Volume = %.2f" , cuboid.getVolume());
    }
}
