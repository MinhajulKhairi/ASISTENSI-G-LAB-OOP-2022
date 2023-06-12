package com.week1.tugas1;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        int jumlahSoal = 7;
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan NIM Mahasiswa: ");
        String nim = input.nextLine();
        int nomorSoal = hitungNomorSoal(nim, jumlahSoal);
        System.out.println("Mahasiswa dengan NIM " + nim + "\nmendapatkan soal nomor " + nomorSoal);
    }

    public static int hitungNomorSoal(String nim, int jumlahSoal) {
        int tigaAngkaAkhir = Integer.parseInt(nim.substring(3));
        System.out.println(tigaAngkaAkhir);
        int nomorSoal = tigaAngkaAkhir % jumlahSoal;
        if (nomorSoal == 0) {
            nomorSoal = jumlahSoal;
        }
        return nomorSoal;
    }

}
