package OOP.Praktikum1;
import java.util.Scanner;

public class assignment_1_6 {
    public static void main(String[] args) {
        // Membuat objek scanner
        Scanner input = new Scanner(System.in);

        // Deklarasi variabel jari-jari
        double r = 0.0;
        
        try {
            System.out.print("Input jari-jari: ");
            r = input.nextDouble();// input jari-jari
        } catch (Exception e){
            System.out.println("Inputan tidak sesuai");
            System.exit(0); // Memeberhentikan program setelah catch
        }
        
        // Menghitung luas
        double l = Math.PI * r * r;
        
        // Menampilkan output dengan print format
        // %.2f untuk memformat bilangan double menampilkan hanya 2 angka belakang koma
        System.out.printf("Luas lingkaran adalah %.2f", l);
    }
}
