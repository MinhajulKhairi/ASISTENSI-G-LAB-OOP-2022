package com.week1.tugas4;
import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 
        System.out.print("Masukkan Judul Film : "); 
        String judul = input.nextLine(); 

        String judulBaru = judulKapital(judul); 

        System.out.println(judulBaru);
    }

    public static String judulKapital(String kalimat) {
        String[] kata = kalimat.toLowerCase().split(" "); 
        System.out.println(kata[1]);

        for (int i = 0; i < kata.length; i++) { 
            char[] huruf = kata[i].toCharArray();
            huruf[0] = Character.toUpperCase(huruf[0]); 
            kata[i] = new String(huruf);
        }

        String kalimatBaru = String.join(" ", kata); 
        return kalimatBaru;
    }
}

