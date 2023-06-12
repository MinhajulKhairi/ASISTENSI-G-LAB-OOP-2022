package OOP.Praktikum2.assignment_2_1;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Membuat objek scanner
        Scanner input = new Scanner(System.in);

        // Menginput nama musisi
        System.out.print("Masukkan nama: ");
        String nama = input.nextLine();

        // Menginput tanggal lahir musisi
        System.out.print("Masukkan tanggal lahir: ");
        String tanggal = input.nextLine();

        // Menginput umur musisi
        System.out.print("Masukkan umur: ");
        int umur = input.nextInt();
        input.nextLine();

        // Menginput kebangsaan musisi
        System.out.print("Masukkan kebangsaan musisi: ");
        String kebangsaan = input.nextLine();

        // Menginput karya musisi
        System.out.print("Masukkan judul karya: ");
        String karya = input.nextLine();

         // Membuat objek musisi dengan nilai yang telah diinput
        Musisi musisi = new Musisi(nama, tanggal, umur, kebangsaan, karya);

         // Membuat loop untuk meminta pengguna memilih atribut yang ingin ditampilkan dari musisi
        while (true) {
            System.out.println("=====================================");
            System.out.println("Pilih atribut yang ingin ditampilkan:");
            System.out.println("1. Tanggal Lahir");
            System.out.println("2. Kebangsaan");
            System.out.println("3. Karya");
            System.out.println("4. Selesai");
            System.out.print("Masukkan pilihan: ");
            // Menggunakan try catch untuk mengantisipasi salah input tipe data
            try {
                int pilihan = input.nextInt();
                System.out.println("=====================================");
            
                    if (pilihan == 1) {
                        musisi.infoUmur();
                    }else if (pilihan == 2) {
                        musisi.infoBangsa();
                    }else if  (pilihan == 3){
                        musisi.infoKarya();
                    }else if (pilihan == 4) {
                        System.out.println("Terimakasih");
                        break; // break perulangan while ketika inputan adalah angka 3
                    } else {
                        System.out.println("Atribut tidak tersedia");
                        break;// break perulangan while jika (1 > inputan > 4)
                    }
            } catch (Exception e) {
                System.out.println("=====================================");
                System.out.println("inputan berupa angka");
                input.nextLine(); // membersihkan input
            }
        }
    }
}
