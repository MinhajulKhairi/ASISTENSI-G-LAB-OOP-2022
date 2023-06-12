import java.util.Scanner;

public class Assignment_1_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        try{
            System.out.print("Name : ");
            String name = input.next();

            System.out.print("Age : ");
            int age = input.nextInt();

            System.out.print("Hobby : ");
            String hobby = input.next();

            System.out.println("Nama saya " + name + ", " + age + " tahun, hobby " + hobby + ".");    
        } catch (Exception e) {
            System.out.println("Umur Harus Berupa Angka");
        }
        input.close();
    }
}