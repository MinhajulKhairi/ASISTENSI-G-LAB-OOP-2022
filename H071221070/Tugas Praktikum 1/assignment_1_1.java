package OOP.Praktikum1;
import java.util.Scanner;

public class assignment_1_1 {
    public static void main(String[] args) {
        // Membuat object scanner
        Scanner scan = new Scanner(System.in);

        // Deklarasi variabel
        String NIM = "";
        int soal = 0;
    
        // Meminta input NIM
        System.out.print("NIM: ");
        NIM = scan.nextLine();
        
        // Mengambil 3 digit terakhir NIM dan dikonversi ke integer
        int akhirNIM = Integer.parseInt(NIM.substring(7));

        // Jika urutan NIM kurang dari atau sama dengan 7
        if (akhirNIM <= 7) {
            soal = akhirNIM;
        } else {
            soal = akhirNIM % 7; // Nomor soal akan diulang dari awal setiap kali urutan NIM melebihi 7
        }

        System.out.println("Soal: No " + soal);
    }
}
