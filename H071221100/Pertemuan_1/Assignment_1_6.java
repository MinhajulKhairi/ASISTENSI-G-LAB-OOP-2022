import java.util.Scanner;


public class Assignment_1_6{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        try{
            System.out.println("Menghitung Luas Lingkaran");
            System.out.print("Masukkan jari-jari lingkaran : ");
            double r = input.nextDouble();

            String luas = String.format("%.2f", (Math.PI * r * r));

            System.out.println("Luas Lingkaran = " + luas);
        
        } catch (Exception e) {
            System.out.println("Input Harus Berupa Angka!");
        }
        input.close();
    }
}
