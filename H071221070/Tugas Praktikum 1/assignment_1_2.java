package OOP.Praktikum1;
import java.util.Scanner;

public class assignment_1_2 {
    public static void main(String[] args) {
        // Membuat object scanner
        Scanner scan = new Scanner(System.in);
        int intCount = 0;
        int doubleCount = 0;

        // Mengambil input total bilangan
        System.out.print("Masukkan panjang array: ");
        int bil = scan.nextInt();
        // Membuat perulangan input sesuai total bilangan dan disimpan dalam array
        for (int i = 1; i <= bil; i++) {
            // System.out.print("Masukkan bilangan ke-" + i + ": ");
            double num = scan.nextDouble();
            if (num == (int)num) {
                intCount++;
            } else {
                doubleCount++;
            }
            
        }
        System.out.println(intCount + " Bilangan Bulat");
        System.out.println(doubleCount + " Bilangan Desimal");
    }
}
