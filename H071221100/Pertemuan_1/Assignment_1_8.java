import java.util.Scanner;

public class Assignment_1_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input satu bilangan
        try {
            System.out.print("Masukkan satu bilangan : ");
            int bilangan = scanner.nextInt();
        

        int[][] array2D = {{1,2,3,4}, {4,5}, {7,8,9}};
        // array2D.length = 3
        // array2D[0][0]
        // array2D[0][1]
        // array2D[0][2]
        // array2D[0][3]

        // array2D[1][0]
        // array2D[1][1]
        // 

        // array2D[2][0]
        // array2D[2][1]
        // array2D[2][2]
        boolean found = false;

        for (int i = 0; i < array2D.length; i++) {
            // i = 0
            // i = 1
            for (int j = 0; j < array2D[i].length; j++) {
                // array2D[0] = [1,2,3,4].length = 4
                // array2D[1] = [4,5].length = 2
                // array2D[2] = [7,8,9].length = 3

                // j = 0
                // j = 1
                // array2D[0][1]

                if (array2D[i][j] == bilangan) {
                    System.out.println("Bilangan " + bilangan + " ditemukan pada indeks [" + i + "][" + j + "]");
                    found = true;
                }
            }
        }
        if (!found) {
            System.out.println("Bilangan " + bilangan + " tidak ditemukan pada array 2D");
        } 
        } catch (Exception e) {
            System.out.println("Inputan harus berupa angka");

        }
        scanner.close();
    }
 }
