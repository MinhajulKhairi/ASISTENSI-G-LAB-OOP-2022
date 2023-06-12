package OOP.Praktikum1;
import java.util.Scanner;

public class assignment_1_3 {
    public static void main(String[] args) {
        // Membuat object scanner
        Scanner input = new Scanner (System.in);
        // Deklarasi variabel
            String nama = "";
            String hobby = "";
            int umur = 0;

        // Menggunakan try catch untuk mengantisipasi penyalahgunaan input tipe data integer
        try {
            // Menginput nama
            System.out.print("Name: ");
            nama = input.nextLine();
            if (!nama.matches("[a-zA-Z ]+")) { // Regex untuk mengecek apakah inputan berupa string atau bukan
                throw new Exception("Inputan nama harus berupa string"); // Pesan yang ditampilkan jika inputan tidak berupa string
            }
    
            // Menginput umur
            System.out.print("Umur: ");
            umur = input.nextInt();
            input.nextLine();
            
            // Menginput hobby
            System.out.print("Hobby: ");
            hobby = input.nextLine();
            if (!hobby.matches("[a-zA-Z ]+")) {
                throw new Exception("Inputan hobby harus berupa string");
            }
        } catch (Exception e) {
            System.out.println("Inputan umur berupa integer");
            System.exit(0); // Memberhentikan program jika terjadi kesalahan tipe data
        }
    
        System.out.println("Nama saya " + nama + ", " + umur + " tahun, " + "hobby " + hobby);
    }
}