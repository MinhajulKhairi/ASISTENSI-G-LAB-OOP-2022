package No1;

import java.util.Scanner;

public class Bangun {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println(" ==== BANGUN RUANG ==== ");
        System.out.println("1. KUBUS");
        System.out.println("2. BALOK");
        System.out.println("3. BOLA");
        System.out.println("4. TABUNG\n\n");
        System.out.println(" ==== BANGUN DATAR ==== ");
        System.out.println("5. PERSEGI");
        System.out.println("6. PERSEGI PANJANG");
        System.out.println("7. LINGKARAN");
        System.out.println("8. SEGITIGA");
        System.out.println("9. TRAPESIUM");

        while (true) {
            try {
                System.out.print("> ");
                int pilih = inp.nextInt();
                System.out.println(" ====================== ");
                if (pilih == 1) {
                    System.out.print("Sisi : ");
                    double sisi = inp.nextDouble();
                    Kubus kubus = new Kubus(sisi);
                    kubus.hitungLuas();
                    kubus.hitungVolume();

                } else if (pilih == 2) {
                    System.out.print("Panjang: ");
                    double pjg = inp.nextDouble();
                    System.out.print("Lebar: ");
                    double lbr = inp.nextDouble();
                    System.out.print("Tinggi: ");
                    double tg = inp.nextDouble();
                    Balok balok = new Balok(pjg, lbr, tg);
                    balok.hitungLuas();
                    balok.hitungVolume();

                } else if (pilih == 3) {
                    System.out.print("Jari-jari: ");
                    double r = inp.nextDouble();
                    Bola bola = new Bola(r);
                    bola.hitungLuas();
                    bola.hitungVolume();

                } else if (pilih == 4) {
                    System.out.print("Jari-jari: ");
                    double r = inp.nextDouble();
                    System.out.print("Tinggi: ");
                    double tg = inp.nextDouble();
                    Tabung tabung = new Tabung(r, tg);
                    tabung.hitungLuas();
                    tabung.hitungVolume();

                } else if (pilih == 5) {
                    System.out.print("Sisi : ");
                    double sisi = inp.nextDouble();
                    Persegi persegi = new Persegi(sisi);
                    persegi.hitungKeliling();
                    persegi.hitungLuas();

                } else if (pilih == 6) {
                    System.out.print("Panjang : ");
                    double pjg = inp.nextDouble();
                    System.out.print("Lebar : ");
                    double lbr = inp.nextDouble();
                    PersegiPanjang persegiPanjang = new PersegiPanjang(pjg, lbr);
                    persegiPanjang.hitungKeliling();
                    persegiPanjang.hitungLuas();

                } else if (pilih == 7) {
                    System.out.print(" r : ");
                    double r = inp.nextDouble();
                    Lingkaran lingkaran = new Lingkaran(r);
                    lingkaran.hitungKeliling();
                    lingkaran.hitungLuas();

                } else if (pilih == 8) {
                    System.out.print("Alas : ");
                    double alas = inp.nextDouble();
                    System.out.print("Sisi kiri : ");
                    double kiri = inp.nextDouble();
                    System.out.print("Sisi kanan : ");
                    double kanan = inp.nextDouble();
                    System.out.print("Tinggi : ");
                    double tg = inp.nextDouble();
                    Segitiga segitiga = new Segitiga(alas, kiri, kanan, tg);
                    segitiga.hitungKeliling();
                    segitiga.hitungLuas();

                } else if (pilih == 9) {
                    System.out.print("Sisi Atas : ");
                    double atas = inp.nextDouble();
                    System.out.print("Sisi miring : ");
                    double sim = inp.nextDouble();
                    System.out.print("Alas : ");
                    double bawah = inp.nextDouble();
                    System.out.print("Tinggi : ");
                    double tg = inp.nextDouble();
                    Trapesium trapesium = new Trapesium(tg, atas, bawah, sim);
                    trapesium.hitungKeliling();
                    trapesium.hitungLuas();

                } else {
                    System.out.println("Pilih 1-9");
                    inp.close();
                }
            } catch (Exception e) {
                continue;
            }
        }
    }

}
