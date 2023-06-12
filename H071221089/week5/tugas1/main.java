package com.week5.tugas1;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("================== SILAHKAN MEMILIH ==================");
        System.out.println("1. BANGUN RUANG");
        System.out.println("2. BANGUN DATAR");
        System.out.print(">. ");
        int choice1 = sc.nextInt();

        switch (choice1) {
            case 1:
                System.out.println("==================" + " BANGUN RUANG " + "==================");
                System.out.println("1. KUBUS");
                System.out.println("2. BALOK");
                System.out.println("3. BOLA");
                System.out.println("4. TABUNG");
                System.out.print(">. ");
                int choice2 = sc.nextInt();
                switch (choice2) {
                    case 1:
                        System.out.println("==================");
                        System.out.print("Masukkan sisi : ");
                        double sisi = sc.nextDouble();
                        Kubus kubus = new Kubus(sisi);
                        System.out.println("Luas Permukaan Kubus: " + kubus.getLuasPermukaan());
                        System.out.println("Volume Kubus: " + kubus.getVolume());
                        break;
                    case 2:
                        System.out.println("==================");
                        System.out.print("Masukkan Panjang : ");
                        double panjang = sc.nextDouble();
                        System.out.print("Masukkan Lebar : ");
                        double lebar = sc.nextDouble();
                        System.out.print("Masukkan Tinggi : ");
                        double tinggi = sc.nextDouble();
                        Balok balok = new Balok(panjang, lebar, tinggi);
                        System.out.println("Luas Permukaan Balok: " + balok.getLuasPermukaan());
                        System.out.println("Volume Balok: " + balok.getVolume());
                        break;
                    case 3:
                        System.out.println("==================");
                        System.out.print("Masukkan Jari-jari : ");
                        double jariJariBola = sc.nextDouble();
                        System.out.print("Masukkan Tinggi : ");
                        Bola bola = new Bola(jariJariBola);
                        System.out.println("Luas Permukaan Bola : " + bola.getLuasPermukaan());
                        System.out.println("Luas Bola : " + bola.getVolume());
                        break;
                    case 4:
                        System.out.println("==================");
                        System.out.print("Masukkan Jari-jari : ");
                        double jariJariTabung = sc.nextDouble();
                        System.out.print("Masukkan Tinggi : ");
                        double tinggiTabung = sc.nextDouble();
                        Tabung tabung = new Tabung(jariJariTabung, tinggiTabung);
                        System.out.println("Luas Permukaan Tabung : " + tabung.getLuasPermukaan());
                        System.out.println("Volume Tabung : " + tabung.getVolume());
                        break;
                }
                break;
            case 2:
                System.out.println("==================" + " BANGUN DATAR " + "==================");
                System.out.println("1. PERSEGI");
                System.out.println("2. PERSEGI PANJANG");
                System.out.println("3. LINGKARAN");
                System.out.println("4. SEGITIGA");
                System.out.println("5. TRAPESIUM");
                System.out.print(">. ");
                int choice3 = sc.nextInt();

                switch (choice3) {
                    case 1:
                        System.out.println("==================");
                        System.out.print("Masukkan sisi : ");
                        double sisiPersegi = sc.nextDouble();
                        Persegi persegi = new Persegi(sisiPersegi);
                        System.out.println("Keliling Persegi : " + persegi.getKeliling());
                        System.out.println("Luas Persegi: " + persegi.getLuas());
                        break;

                    case 2:
                        System.out.println("==================");
                        System.out.print("Masukkan Panjang : ");
                        double panjangPersegiPanjang = sc.nextDouble();
                        System.out.print("Masukkan Lebar : ");
                        double lebarPersegiPanjang = sc.nextDouble();
                        PersegiPanjang persegiPanjang = new PersegiPanjang(panjangPersegiPanjang, lebarPersegiPanjang);
                        System.out.println("Keliling Persegi Panjang: " + persegiPanjang.getKeliling());
                        System.out.println("Luas Persegi Panjang : " + persegiPanjang.getLuas());
                        break;

                    case 3:
                        System.out.println("==================");
                        System.out.print("Masukkan Jari jari : ");
                        double jariJariLingkaran = sc.nextDouble();
                        Lingkaran lingkaran = new Lingkaran(jariJariLingkaran);
                        System.out.println("Keliling Lingkaran : " + lingkaran.getKeliling());
                        System.out.println("Luas Lingkaran : " + lingkaran.getLuas());
                        break;

                    case 4:
                        System.out.println("==================");
                        System.out.print("Masukkan Alas : ");
                        double alas = sc.nextDouble();
                        System.out.print("Masukkan Tinggi : ");
                        double tinggiSegitiga = sc.nextDouble();
                        System.out.print("Masukkan sisi : ");
                        double sisiSegitiga = sc.nextDouble();
                        Segitiga segitiga = new Segitiga(alas, tinggiSegitiga, sisiSegitiga);
                        System.out.println("Keliling Segitiga : " + segitiga.getKeliling());
                        System.out.println("Luas Segitiga: " + segitiga.getLuas());
                        break;

                    case 5:
                        System.out.println("==================");
                        System.out.print("Masukkan Tinggi : ");
                        double tinggiTrapesium = sc.nextDouble();
                        System.out.print("Masukkan alas : ");
                        double alasTrapeesium = sc.nextDouble();
                        System.out.print("Masukkan sisi miring : ");
                        double sisimiring = sc.nextDouble();
                        System.out.print("Masukkan atas : ");
                        double atasTrapesium = sc.nextDouble();
                        Trapesium trapesium = new Trapesium(tinggiTrapesium, alasTrapeesium, sisimiring, atasTrapesium);
                        System.out.println("Keliling Trapesium : " + trapesium.getKeliling());
                        System.out.println("Luas Trapesium : " + trapesium.getLuas());
                        break;

                    default:
                        System.out.println("Pilihan tidak tersedia!!");
                        break;

                }
        }
    }
}
