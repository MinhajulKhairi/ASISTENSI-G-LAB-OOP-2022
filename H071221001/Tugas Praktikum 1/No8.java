import java.util.Scanner;

public class No8 {
    public static void main(String[] args) {
      int[][] arr = {{1, 2,3},{4, 5, 6},{7, 8, 9}};
      Scanner inp = new Scanner(System.in);
      System.out.print("Angka yang dicari: ");
      int angka = inp.nextInt();
      inp.close();
      boolean found = false;
  
      try {
        for (int i = 0; i < arr.length; i++) {
          for (int j = 0; j < arr[i].length; j++) {
            if (arr[i][j] == angka) {
              System.out.printf("Found %d at [%d][%d]\n", angka, i, j);
              found = true;
            }
          }
        }
        if (!found) {
          throw new Exception();
        }
      } catch (Exception e) {
        System.out.printf("%d tidak ditemukan dalam array.\n", angka);
      }
    }
  }
