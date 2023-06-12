package com.week1.tugas5;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class main {
    static String[] BULAN = { "", "Januari", "Februari", "Maret", "April", "Mei", "Juni", "Juli", "Agustus", "September", "Oktober", "November", "Desember" };

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan tanggal (dd-mm-yy): ");
        String tanggal = scanner.nextLine();
        LocalDate tanggal1 = LocalDate.parse(tanggal, DateTimeFormatter.ofPattern("dd-MM-yy"));
        System.out.printf("%d %s %d", tanggal1.getDayOfMonth(), BULAN[tanggal1.getMonthValue()], tanggal1.getYear());
        scanner.close();
    }
}

