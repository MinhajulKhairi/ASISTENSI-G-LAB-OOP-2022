package com.week1.tugas2;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = 0;  
        double[] arr;  
        try {
            System.out.print("Masukkan jumlah bilangan: ");
            n = input.nextInt(); 
            arr = new double[n]; 
            
            for (int i = 0; i < n; i++) {
                arr[i] = input.nextDouble();  
            }
            int bilBulat = 0; 
            int bilDesimal = 0;  
            for (int i = 0; i < n; i++) {
                if (arr[i] == (int)arr[i]) { 
                    bilBulat++;
                } else { 
                    bilDesimal++;
                }
            }

            System.out.printf("%d Bilangan Bulat\n%d Bilangan Desimal", bilBulat, bilDesimal);

        } catch (Exception e) {
            System.out.println("Input harus berupa bilangan!");
        } finally {
            input.close();
        }
    }
}
