package com.week1.tugas6;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double r = 0.0;
        
        try {
            System.out.print("Input jari-jari: ");
            r = input.nextDouble();
        } catch (Exception e){
            System.out.println("Inputan tidak sesuai");
            System.exit(0); 
        }
    
        double l = Math.PI * r * r;
        
        System.out.printf("Luas lingkaran adalah %.2f", l);
    }
}


