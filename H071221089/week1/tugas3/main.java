package com.week1.tugas3;
import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nama, hobi;
        int umur = 0;
        
        System.out.print("Nama : ");
        nama = input.nextLine();
        
        try {
            System.out.print("Umur : ");
            umur = input.nextInt();
            input.nextLine(); 
        } catch (Exception e) {
            System.out.println("Umur harus berupa angka!");
            System.exit(0);
        }
        
        System.out.print("Hobi : ");
        hobi = input.nextLine();
        
        System.out.printf("Nama saya %s, %d tahun, hobi %s", nama, umur, hobi);
        input.close();
    }
}


