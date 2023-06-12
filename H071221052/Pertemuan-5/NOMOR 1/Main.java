import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        while (true) {
            Scanner inp = new Scanner(System.in);

            System.out.println("==== BANGUN RUANG =====");
            System.out.println("1. KUBUS");
            System.out.println("2. BALOK");
            System.out.println("3. BOLA");
            System.out.println("4. TABUNG");
            System.out.println();
            System.out.println("==== BANGUN DATAR =====");
            System.out.println("5. PERSEGI");
            System.out.println("6. PERSEGI PANJANG");
            System.out.println("7. LINGKARAN");
            System.out.println("8. SEGITIGA");
            System.out.println("9. TRAPESIUM");
            System.out.println();
            System.out.println("10. KELUAR");
            System.out.print("Silahkan masukkan pilihan : ");
            try {

                int selectMenu = inp.nextInt();
                inp.nextLine();

                switch (selectMenu) {

                    case 1:
                        System.out.print("Masukkan sisi : ");
                        double sisi = inp.nextDouble();
                        Kubus kubus = new Kubus(sisi);
                        System.out.println("Luas Permukaan Kubus: " + kubus.getLuasPermukaan());
                        System.out.println("Volume Kubus: " + kubus.getVolume());
                        break;

                    case 2:
                        System.out.print("Masukkan Panjang : ");
                        double panjang = inp.nextDouble();
                        System.out.print("Masukkan Lebar : ");
                        double lebar = inp.nextDouble();
                        System.out.print("Masukkan Tinggi : ");
                        double tinggi = inp.nextDouble();
                        Balok balok = new Balok(panjang, lebar, tinggi);
                        System.out.println("Luas Permukaan Balok: " + balok.getLuasPermukaan());
                        System.out.println("Volume Balok: " + balok.getVolume());
                        break;

                    case 3:
                        System.out.print("Masukkan Jari-jari : ");
                        double jariJariBola = inp.nextDouble();
                        System.out.print("Masukkan Tinggi : ");
                        Bola bola = new Bola(jariJariBola);
                        System.out.println("Luas Permukaan Bola : " + bola.getLuasPermukaan());
                        System.out.println("Luas Bola : " + bola.getVolume());
                        break;

                    case 4:
                        System.out.print("Masukkan Jari-jari : ");
                        double jariJariTabung = inp.nextDouble();
                        System.out.print("Masukkan Tinggi : ");
                        double tinggiTabung = inp.nextDouble();
                        Tabung tabung = new Tabung(jariJariTabung, tinggiTabung);
                        System.out.println("Luas Permukaan Tabung : " + tabung.getLuasPermukaan());
                        System.out.println("Volume Tabung : " + tabung.getVolume());
                        break;

                    case 5:
                        System.out.print("Masukkan sisi : ");
                        double sisiPersegi = inp.nextDouble();
                        Persegi persegi = new Persegi(sisiPersegi);
                        System.out.println("Keliling Persegi : " + persegi.getKeliling());
                        System.out.println("Luas Persegi: " + persegi.getLuas());
                        break;

                    case 6:
                        System.out.print("Masukkan Panjang : ");
                        double panjangPersegiPanjang = inp.nextDouble();
                        System.out.print("Masukkan Lebar : ");
                        double lebarPersegiPanjang = inp.nextDouble();
                        persegiPanjang persegiPanjang = new persegiPanjang(panjangPersegiPanjang, lebarPersegiPanjang);
                        System.out.println("Keliling Persegi Panjang: " + persegiPanjang.getKeliling());
                        System.out.println("Luas Persegi Panjang : " + persegiPanjang.getLuas());
                        break;

                    case 7:
                        System.out.print("Masukkan Jari jari : ");
                        double jariJariLingkaran = inp.nextDouble();
                        Lingkaran lingkaran = new Lingkaran(jariJariLingkaran);
                        System.out.println("Keliling Lingkaran : " + lingkaran.getKeliling());
                        System.out.println("Luas Lingkaran : " + lingkaran.getLuas());
                        break;

                    case 8:

                        System.out.print("Masukkan Alas : ");
                        double alas = inp.nextDouble();
                        System.out.print("Masukkan Tinggi : ");
                        double tinggiSegitiga = inp.nextDouble();
                        System.out.print("Masukkan sisi : ");
                        double sisiSegitiga = inp.nextDouble();
                        Segitiga segitiga = new Segitiga(alas, tinggiSegitiga, sisiSegitiga);
                        System.out.println("Keliling Segitiga : " + segitiga.getKeliling());
                        System.out.println("Luas Segitiga: " + segitiga.getLuas());
                        break;

                    case 9:
                        System.out.print("Masukkan Tinggi : ");
                        double tinggiTrapesium = inp.nextDouble();
                        System.out.print("Masukkan alas : ");
                        double alasTrapeesium = inp.nextDouble();
                        System.out.print("Masukkan sisi miring : ");
                        double sisimiring = inp.nextDouble();
                        System.out.print("Masukkan atas : ");
                        double atasTrapesium = inp.nextDouble();
                        Trapesium trapesium = new Trapesium(tinggiTrapesium, alasTrapeesium, sisimiring, atasTrapesium);
                        System.out.println("Keliling Trapesium : " + trapesium.getKeliling());
                        System.out.println("Luas Trapesium : " + trapesium.getLuas());
                        break;

                    default:
                        System.out.println("Mohon Masukkan inputan Yang Benar Jangan Melebihi 10");
                        System.out.println("Mohon Masukkan inputan 1 - 10");
                        continue;

                    case 10:
                        System.out.println(
                                "Terima Kasih Sudah Berkunjung Di Program Sederhana Bangun Ruang dan Bangun Datar");
                }
                break;
            } catch (Exception e) {
                System.out
                        .println("Mohon Masukkan inputan Yang Benar Yah Adik-Adik ( INTEGER DIKK!!! ) Dari 1 - 10 !!!");
                continue;

            }

        }
    }
}
