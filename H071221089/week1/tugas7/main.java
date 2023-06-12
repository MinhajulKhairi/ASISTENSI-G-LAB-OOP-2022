package com.week1.tugas7;
import java.util.Scanner;

public class main {
    String[] genre;

    public main() {
        genre = new String[] {"rock", "pop", "jazz", "blues", "reggae", "metal"};
    }

    
    public int findIndex(String inputGenre) {
        inputGenre = inputGenre.toLowerCase(); 
        for (int i = 0; i < genre.length; i++) { 
            if (inputGenre.toLowerCase().equals(genre[i])) { 
                    return i; 
                }
        }
        return -1;
    }

    public static void main(String[] args) {
        // Membuat object scanner
        Scanner input = new Scanner(System.in);
        main object = new main();

        System.out.print("Masukkan nama genre: ");
        String inputGenre = input.nextLine();
        
        int index = object.findIndex(inputGenre);
        if (index >= 0) {
            System.out.println("genre \"" + inputGenre + "\" terdapat pada index ke-" + index);
        } else {
            System.out.println("genre \"" + inputGenre + "\" tidak terdapat dalam array.");
        }
    }
}
