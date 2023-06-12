package OOP.Praktikum1;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;


public class assignment_1_5 {
    public static String konversiTanggal(String tanggal) {
        // Memecah string tanggal menjadi tiga bagian (hari, bulan, tahun)
        String[] tanggalSplit = tanggal.split("-");
        int hari = Integer.parseInt(tanggalSplit[0]);
        System.out.println(hari);
        int bulanIndex = Integer.parseInt(tanggalSplit[1]);
        int tahun = Integer.parseInt(tanggalSplit[2]);
        
        // Array nama bulan
        String[] namaBulan = {"Januari", "Februari", "Maret", "April", "Mei", "Juni", 
                              "Juli", "Agustus", "September", "Oktober", "November", "Desember"};
        
        // Menggunakan library Java.time untuk mengonversi tanggal menjadi format yang diinginkan
        LocalDate localDate = LocalDate.of(Integer.parseInt("20"+ Integer.toString(tahun)), bulanIndex, hari);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MMMM yyyy");
        String formattedDate = localDate.format(formatter);
        
        // Mengembalikan hasil konversi
        return formattedDate;
    }

    public static void main(String[] args) {
        // Membuat objek Scanner untuk menerima input dari pengguna
        Scanner scanner = new Scanner(System.in);
        
        // Menerima input dari pengguna
        System.out.print("Masukkan tanggal (dd-mm-yy): ");
        String tanggal = scanner.nextLine();
        
        // Mencetak hasil konversi
        System.out.println(konversiTanggal(tanggal));
        
        // Menutup objek Scanner
        // scanner.close();
    }
}
