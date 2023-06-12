import java.util.Scanner;

public class No6 {
   public static void main(String[] args) {
      Scanner inp = new Scanner(System.in);

      try {
         System.out.print("Masukkan jari-jari lingkaran: ");
         double r = inp.nextDouble();

         String luas = String.format("%.2f", (Math.PI * r * r));

         System.out.println("Luas lingkaran = " + luas);
      } catch (Exception e) {
         System.out.println("Inputan bukan angka!");
      }
      inp.close();
   }
}