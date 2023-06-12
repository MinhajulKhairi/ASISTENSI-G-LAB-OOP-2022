package OOP.Praktikum1;
import java.util.Scanner;

public class assignment_1_7 {
    String[] band;

    public assignment_1_7() {
        band = new String[] {"Queen","The Beatles","Led Zeppelin","Bigbang","Nirvana","Green Day","Metallica"};
    }

    // Method untuk mencari indeks suatu band dalam array "band"
    public int BandIndex(String inputBand) {
        inputBand = inputBand.toLowerCase(); // Konversi nama band yang diinput ke huruf kecil
        for (int i = 0; i < band.length; i++) { // Looping sebanyak panjang array "band"
            if (band[i].toLowerCase().equals(inputBand)) { // Band yang ditemukan sama dengan yang diinput
                return i; // Jika cocok, kembalikan indeks
            }
        }
        return -1; // Tidak cocok, kembalikan -1
    }

    public static void main(String[] args) {
        // Membuat object scanner
        Scanner input = new Scanner(System.in);
        assignment_1_7 object = new assignment_1_7();

        // Menerima input band
        System.out.print("Masukkan nama band: ");
        String inputBand = input.nextLine();
        // Memanggil method "BandIndex" dengan argumen nama band yang diinput
        int index = object.BandIndex(inputBand);
        if (index >= 0) {
            System.out.println("Band \"" + inputBand + "\" terdapat pada index ke-" + index);
        } else {
            System.out.println("Band \"" + inputBand + "\" tidak terdapat dalam array.");
        }
    }
}
