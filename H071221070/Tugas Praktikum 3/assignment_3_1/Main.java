package OOP.Praktikum3.assignment_3_1;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Naruto naruto = new Naruto();
        Sasuke sasuke = new Sasuke();

        int narutoHp = 20;
        int sasukeHp = 20;


        while (true) {
            System.out.println("====================================");
            System.out.println("         |Naruto's HP: " + narutoHp + "|");
            System.out.println("         |Sasuke's HP: " + sasukeHp + "|");

            System.out.println("====================================");
            System.out.println("Opsi Jurus: ");
            System.out.println("====================================");
            System.out.println("\"Naruto\"");
            System.out.println("Rasengan               = Naga + Kuda");
            System.out.println("Kage Bunshin no Jutsu  = Kuda + Domba");
            System.out.println("------------------------------------");
            System.out.println("\"Sasuke\"");
            System.out.println("Chidori                = Domba + Ular");
            System.out.println("Susanoo                = Monyet + Naga");
            System.out.println("------------------------------------");

            System.out.print("Naruto's hand seals 1: ");
            String narutoHandSeal1 = scanner.next();
            System.out.print("Naruto's hand seals 2: ");
            String narutoHandSeal2 = scanner.next();

            System.out.print("Sasuke's hand seals 1: ");
            String sasukeHandSeal1 = scanner.next();
            System.out.print("Sasuke's hand seals 2: ");
            String sasukeHandSeal2 = scanner.next(); 

            
            if (narutoHandSeal1.toLowerCase().equals(naruto.getHandSealNaga()) && narutoHandSeal2.toLowerCase().equals(naruto.getHandSealKuda())) {
                naruto.rasengan();
                sasukeHp -= 5;
            } else if (narutoHandSeal1.toLowerCase().equals(naruto.getHandSealKuda()) && narutoHandSeal2.toLowerCase().equals(naruto.getHandSealDomba())) {
                naruto.kageBunshinNoJutsu();
                sasukeHp -= 4;
            } else if (sasukeHp <= 10 && narutoHandSeal1.toLowerCase().equals(naruto.getKurama()) && narutoHandSeal2.toLowerCase().equals(naruto.getKyuubi())) {
                naruto.useUltimate();
                System.out.println("============");
                System.out.println("Naruto wins!");
                break;
            }
            
            if (sasukeHandSeal1.toLowerCase().equals(sasuke.getHandSealDomba()) && sasukeHandSeal2.toLowerCase().equals(sasuke.getHandSealUlar())) {
                sasuke.chidori();
                narutoHp -= 3;
            } else if (sasukeHandSeal1.toLowerCase().equals(sasuke.getHandSealMonyet()) && sasukeHandSeal2.toLowerCase().equals(sasuke.getHandSealNaga())) {
                sasuke.susanoo();
                narutoHp -= 6;
            } else if (narutoHp <= 10 && sasukeHandSeal1.toLowerCase().equals(sasuke.getMangekyou()) && sasukeHandSeal2.toLowerCase().equals(sasuke.getSharingan())) {
                sasuke.useUltimate();
                System.out.println("============");
                System.out.println("Sasuke wins!");
                break;
            }
            
            if (sasukeHp <= 10) {
                System.out.println("Naruto dapat melakukan ulti \"Kurama Kyuubi\"");
            }

            if (narutoHp <= 10) {
                System.out.println("Sasuke dapat menggunakan ulti \"Mangekyou Sharingan\"");
            }
        }
        
    }
}
