package OOP.Praktikum2.assignment_2_2;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Membuat objek person
        Person person = new Person();  

        // Menginput nama person
        System.out.print("Nama: ");
        String name = input.nextLine();
        // Memasukkan nama yang telah di input dalam method setName()
        person.setName(name);
        
        // Menginput nama person
        System.out.print("Umur: ");
        int age = input.nextInt();
        // Memasukkan umur yang telah di input dalam method setAge()
        person.setAge(age);
        
        // Menginput jenis kelamin person
        System.out.print("Apakah laki-laki? (True/False): ");
        boolean isMale = input.nextBoolean();
        // Memasukkan jenis kelamin yang telah diinput dalam method setMale()
        person.setMale(isMale);
        
        // Menampilkan hasil input dari user
        System.out.println("=========================");
        System.out.println("Nama: " + person.getName());
        System.out.println("Umur: " + person.getAge());
        System.out.println("Jenis kelamin: " + (person.isMale() ? "Laki-laki" : "Perempuan"));
    }
}
