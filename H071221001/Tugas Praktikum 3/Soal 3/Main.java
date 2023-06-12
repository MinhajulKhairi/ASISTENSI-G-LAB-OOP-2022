package No3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        User farah = new User("Farah", 3000);
        Product HP = new Product("HP Pavilion Gaming 15", 2000, 15);
        Product asus = new Product("ASUS VivoBook 15 A516MAO N420", 40000, 4);
        Product lenovo= new Product("Lenovo Ideapad S145", 1500, 2);
        Store toko = new Store("Sisfo Computer");
        toko.tambahProduct(HP);
        toko.tambahProduct(asus);
        toko.tambahProduct(lenovo);
        while (true) {
            farah.card();
            toko.listProduct();
            System.out.println("O. Keluar");
            System.out.print("> ");
            int pilihan = input.nextInt();
            if (pilihan <= 0) {
                break;
            } else {
                toko.konfirmasi(pilihan - 1);
            }
            System.out.print("> ");
            int pil = input.nextInt();
            if (pil == 1) {
                toko.transaksi(pilihan - 1, farah);
                System.out.print("> ");
                int yatid = input.nextInt();
                if (yatid == 1) {
                    continue;
                } else {
                    break;
                }
            } else {
                continue;
            }

        }
        input.close();
    }

    }

