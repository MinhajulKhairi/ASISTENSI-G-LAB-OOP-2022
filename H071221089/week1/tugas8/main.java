package com.week1.tugas8;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        int[][] angka = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}; 
        
        Scanner input = new Scanner(System.in); 
        
        System.out.print("Masukkan angka yang ingin dicari: "); 
        int target = input.nextInt(); 
        
        boolean found = false; 
        for (int i = 0; i < angka.length; i++) {
            // i  = 0; 
            for (int j = 0; j < angka[i].length; j++) {
                //j = 0;
                //angka[0][0]
                //angka[0][1]
                //angka[0][2]
                //angka[0].length
                if (angka[i][j] == target) { // Jika nilai target ditemukan dalam elemen yang sedang diakses, mencetak pesan dan mengatur found menjadi true.
                    System.out.printf("Found %d at [%d][%d]\n", target, i, j);
                    found = true;
                    break; // Keluar dari perulangan untuk mencari elemen dalam baris yang sedang diakses
                }
            }
            if (found) { // Jika nilai target sudah ditemukan, keluar dari perulangan utama.
                break;
            }
        }
        
        if (!found) { // Jika nilai target tidak ditemukan dalam array, mencetak pesan.
            System.out.println("Angka tidak ditemukan dalam array.");
        }
    }
}

