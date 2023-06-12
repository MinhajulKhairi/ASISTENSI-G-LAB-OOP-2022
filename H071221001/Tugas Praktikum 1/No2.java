import java.util.Scanner;

public class No2 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int bilbulat = 0;
        int bildesimal = 0;
        try {
            System.out.print("Jumlah : ");
            int n = inp.nextInt();

            for (int i = 0; i < n; i++) {
                double num = inp.nextDouble();
                if (num % 1 == 0) {
                    bilbulat++;
                } else {
                    bildesimal++;
                }
            }

            System.out.println(bilbulat + " Bilangan Bulat");
            System.out.println(bildesimal + " Bilangan Desimal");
            inp.close();
        } catch (Exception e) {
            System.out.println("Input harus berupa bilangan!");
        }
        inp.close();
    }
}