package OOP.Praktikum1;
import java.util.Scanner;

public class assignment_1_8 {
    public static void main(String[] args) {
        // Mendefinisikan array 2D dengan variabel "nums"
        int[][] nums = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        // Membuat objek scanner
        Scanner input = new Scanner(System.in);

        // Menginput angka yang ingin dicari
        System.out.print("Masukkan angka yang dicari: ");
        int angka = input.nextInt();

        boolean angkaDitemukan = false;
        // Perulangan untuk mengakses baris-baris array
        for (int i = 0; i < nums.length; i++) {
            // Perulangan untuk mengakses kolom masing-masing baris array
            for (int j = 0; j < nums[i].length; j++) {
                // Jika angka ditemukan, tampilkan pesan dan hentikan looping dengan throw
                if (nums[i][j] == angka) {
                    System.out.printf("Found %d at [%d][%d]\n", angka, i, j);
                    angkaDitemukan = true; // Menghentikan semua perulangan
                }
            }
        }

        if (!angkaDitemukan) {
            System.out.printf("%d tidak ditemukan dalam array\n", angka);
        }
    }
}
