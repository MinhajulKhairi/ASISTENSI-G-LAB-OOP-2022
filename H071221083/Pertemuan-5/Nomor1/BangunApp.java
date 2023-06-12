import java.util.Scanner;

public class BangunApp {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("1. BANGUN RUANG");
        System.out.println("2. BANGUN DATAR");

        System.out.print("\nMasukkan pilihan : ");
        int pilihan = input.nextInt();
        switch (pilihan) {
            case 1:
                System.out.println("==== Bangun Ruang ====:");
                System.out.println("1. Kubus");
                System.out.println("2. Balok");
                System.out.println("3. Bola");
                System.out.println("4. Tabung");
                System.out.print("\nMasukkan pilihan : ");
                int pilihan2 = input.nextInt();
                switch (pilihan2) {
                    case 1:
                        System.out.print("Masukkan panjang sisi kubus : ");
                        double sisiKubus = input.nextDouble();
                        Kubus kubus = new Kubus(sisiKubus);
                        System.out.println("\nVolume kubus : " + kubus.hitungVolume());
                        System.out.println("Luas permukaan kubus : " + kubus.hitungLuasPermukaan());
                        break;
                    case 2:
                        System.out.print("Masukkan panjang balok : ");
                        double panjangBalok = input.nextDouble();
                        System.out.print("Masukkan lebar balok : ");
                        double lebarBalok = input.nextDouble();
                        System.out.print("Masukkan tinggi balok : ");
                        double tinggiBalok = input.nextDouble();
                        Balok balok = new Balok(panjangBalok, lebarBalok, tinggiBalok);
                        System.out.println("\nVolume balok : " + balok.hitungVolume());
                        System.out.println("Luas permukaan balok : " + balok.hitungLuasPermukaan());
                        break;
                    case 3:
                        System.out.print("Masukkan jari-jari bola : ");
                        double jariJariBola = input.nextDouble();
                        Bola bola = new Bola(jariJariBola);
                        System.out.println("\nVolume bola : " + bola.hitungVolume());
                        System.out.println("Luas permukaan bola : " + bola.hitungLuasPermukaan());
                        break;
                    case 4:
                        System.out.print("Masukkan jari-jari tabung :");
                        double jariJariTabung = input.nextDouble();
                        System.out.print("Masukkan tinggi tabung :");
                        double tinggiTabung = input.nextDouble();
                        Tabung tabung = new Tabung(jariJariTabung, tinggiTabung);
                        System.out.println("\nVolume tabung : " + tabung.hitungVolume());
                        System.out.println("Luas permukaan tabung : " + tabung.hitungLuasPermukaan());
                        break;
                }
                break;
            case 2:
                System.out.println("\n==== Bangun Datar ====:");
                System.out.println("1. Persegi");
                System.out.println("2. Persegi Panjang");
                System.out.println("3. Lingkaran");
                System.out.println("4. Segitiga");
                System.out.println("5. Trapesium");
                System.out.print(" > ");
                int pilihan3 = input.nextInt();
                switch (pilihan3) {
                    case 1:
                        System.out.print("Masukkan panjang sisi persegi : ");
                        double sisiPersegi = input.nextDouble();
                        System.out.println("\nLuas persegi : " + (sisiPersegi * sisiPersegi));
                        System.out.println("Keliling persegi : " + (4 * sisiPersegi));
                        break;
                    case 2:
                        System.out.print("Masukkan panjang : ");
                        double panjangPersegiPanjang = input.nextDouble();
                        System.out.print("Masukkan lebar : ");
                        double lebarPersegiPanjang = input.nextDouble();
                        System.out.println("\nLuas persegi panjang : " + (panjangPersegiPanjang * lebarPersegiPanjang));
                        System.out.println(
                                "Keliling persegi panjang : " + (2 * (panjangPersegiPanjang + lebarPersegiPanjang)));
                        break;
                    case 3:
                        System.out.print("Masukkan jari-jari lingkaran: ");
                        double jariJariLingkaran = input.nextDouble();
                        System.out.println("\nLuas lingkaran : " + (Math.PI * jariJariLingkaran * jariJariLingkaran));
                        System.out.println("Keliling lingkaran : " + (2 * Math.PI * jariJariLingkaran));
                        break;
                    case 4:
                        System.out.print("Masukkan alas : ");
                        double alasSegitiga = input.nextDouble();
                        System.out.print("Masukkan tinggi : ");
                        double tinggiSegitiga = input.nextDouble();
                        System.out.print("Masukkan sisi miring : ");
                        double sisiMiringSegitiga = input.nextDouble();
                        System.out.println("\nLuas segitiga : " + (0.5 * alasSegitiga * tinggiSegitiga));
                        System.out.println(
                                "Keliling segitiga : " + (alasSegitiga + sisiMiringSegitiga + sisiMiringSegitiga));
                        break;
                    case 5:
                        System.out.print("Masukkan sisi sejajar pertama : ");
                        double sisiSejajar1Trapesium = input.nextDouble();
                        System.out.print("Masukkan sisi sejajar kedua : ");
                        double sisiSejajar2Trapesium = input.nextDouble();
                        System.out.print("Masukkan tinggi : ");
                        double tinggiTrapesium = input.nextDouble();
                        System.out.print("Masukkan sisi miring : ");
                        double sisiMiringTrapesium = input.nextDouble();
                        Trapesium trapesium = new Trapesium(sisiSejajar1Trapesium, sisiSejajar2Trapesium,
                                tinggiTrapesium,
                                sisiMiringTrapesium);
                        System.out.println("Luas trapesium : " + trapesium.hitungLuas());
                        System.out.println("Keliling trapesium : " + trapesium.hitungKeliling());
                        break;
                    default:
                        System.out.println("Pilihan tidak tersedia.");
                }
        }
        input.close();
    }
}