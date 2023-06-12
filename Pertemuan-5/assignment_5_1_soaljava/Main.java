package assignment_5_1_soaljava;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== BANGUN RUANG ====");
        System.out.println("1. KUBUS");
        System.out.println("2. BALOK");
        System.out.println("3. BOLA");
        System.out.println("4. TABUNG\n");

        System.out.println("==== BANGUN DATAR ====");
        System.out.println("5. PERSEGI");
        System.out.println("6. PERSEGI PANJANG");
        System.out.println("7. LINGKARAN");
        System.out.println("8. SEGITIGA");
        System.out.println("9. TRAPESIUM");
        System.out.print("\n > ");
        int pilihan = sc.nextInt();

    switch (pilihan){
        case 1:
        System.out.print("Masukkan sisi: ");
        double sisi = sc.nextDouble();
        Kubus kubus = new Kubus(sisi);
        System.out.println("Luas Permukaan Kubus : " + kubus.luasPermukaan());
        System.out.println("Valome Kubus : " + kubus.volume());
        break;

        case 2:
        System.out.print("Masukan Panjang: ");
        double panjang = sc.nextDouble();
        System.out.print("Masukkan Lebar: ");
        double lebar = sc.nextDouble();
        System.out.print("Masukkan Tinggi: ");
        double tinggi = sc.nextDouble();
        Balok balok = new Balok(panjang, lebar, tinggi);
        System.out.println("Luas Permukaan Balok : " + balok.luasPermukaan());
        System.out.println("Volume Balok : " + balok.volume());
        break;
        
        case 3 :
        System.out.print("Masukkan Jari jari: ");
        double jariJariBola = sc.nextDouble();
        Bola bola = new Bola(jariJariBola);
        System.out.println("Luas Permukaan Bola : " + bola.luasPermukaan());
        System.out.println("Volume Bola : " + bola.volume());
        break;

        case 4:
        System.out.print("Masukkan Jari Jari : ");
        double jariJariTabung = sc.nextDouble();
        System.out.print("Masukkan Tinggi : ");
        double tinggiTabung = sc.nextDouble();
        Tabung tabung = new Tabung(jariJariTabung, tinggiTabung);
        System.out.println("Luas Permukaan Tabung : " + tabung.luasPermukaan());
        System.out.println("Volume Tabung : " + tabung.volume());
        break;

        case 5:
        System.out.print("Masukkan Sisi : ");
        double sisiPersegi = sc.nextDouble();
        Persegi persegi = new Persegi(sisiPersegi);
        System.out.println("Keliling Persegi : " + persegi.keliling());
        System.out.println("Luas Persegi : " + persegi.luas());
        break;

        case 6 :
        System.out.print("Masukkan Panjang : ");
        double panjangPersegiPanjang = sc.nextDouble();
        System.out.print("Masukkan Lebar : ");
        double lebarPersegiPanjang = sc.nextDouble();
        PersegiPanjang persegiPanjang = new PersegiPanjang(panjangPersegiPanjang, lebarPersegiPanjang);
        System.out.println("Keliling Persegi Panjang : " + persegiPanjang.keliling());
        System.out.println("Luas Persegi Panjang : " + persegiPanjang.luas());
        break;

        case 7 :
        System.out.print("Masukkan Jari jari : ");
        double jariJariLingkaran = sc.nextDouble();
        Lingkaran lingkaran = new Lingkaran(jariJariLingkaran);
        System.out.println("Keliling Lingkaran : " + lingkaran.keliling());
        System.out.println("Luas Lingkaran : " + lingkaran.luas());
        break;

        case 8 :
        System.out.print("Masukkan Alas : ");
        double alas = sc.nextDouble();
        System.out.print("Masukkan Tinggi : ");
        double tinggiSegitiga = sc.nextDouble();
        System.out.print("Masukkan sisi : ");
        double sisiSegitiga = sc.nextDouble();
        Segitiga segitiga = new Segitiga(alas, tinggiSegitiga, sisiSegitiga);
        System.out.println("Keliling Segitiga : " + segitiga.keliling());
        System.out.println("Luas Segitiga : " + segitiga.luas());
        break;

        case 9 :
        System.out.print("Masukkan Tinggi : ");
        double tinggiTrapesium = sc.nextDouble();
        System.out.print("Masukkan alas : ");
        double alasTrapeesium = sc.nextDouble();
        System.out.print("Masukkan sisi miring : ");
        double sisimiring = sc.nextDouble();
        System.out.print("Masukkan atas : ");
        double atasTrapesium = sc.nextDouble();
        Trapesium trapesium =new Trapesium(tinggiTrapesium, alasTrapeesium, sisimiring, atasTrapesium);
        System.out.println("Keliling Trapesium : "  + trapesium.keliling());
        System.out.println("Luas Trapesium : " + trapesium.luas());
        break;
        
        default:
            System.out.println("Pilihan tidak tersedia.");
            break;
    }
    sc.close();
    }
}