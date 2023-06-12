package Nomor2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("==== Struktur Komunitas Programmer UNHAS ====");
        System.out.print("1. Pengurus Inti\n2. Koordinator Bidang\n> ");

        int tipe = input.nextInt();
        switch (tipe) {
            case 1:
                System.out.println("---- Pengurus Inti ----");
                System.out.println("1. Ketua\n2. Wakil Ketua\n3. Sekretaris\n4. Bendahara\n> ");
                int pengurus = input.nextInt();
                switch (pengurus) {
                    case 1:
                        Ketua ketua = new Ketua();
                        System.out.println("Jabatan : " + ketua.getJabatan());
                        System.out.println("Periode : " + ketua.getPeriode());
                        break;
                    case 2:
                        WakilKetua wakilKetua = new WakilKetua();
                        System.out.println("Jabatan : " + wakilKetua.getJabatan());
                        System.out.println("Periode : " + wakilKetua.getPeriode());
                        break;
                    case 3:
                        Bendahara bendahara = new Bendahara();
                        System.out.println("Jabatan : " + bendahara.getJabatan());
                        System.out.println("Periode : " + bendahara.getPeriode());
                        break;
                    case 4:
                        Sekretaris sekretaris = new Sekretaris();
                        System.out.println("Jabatan : " + sekretaris.getJabatan());
                        System.out.println("Periode : " + sekretaris.getPeriode());
                        break;
                    default:
                        System.out.println("Inputan tidak valid");
                        break;
                }
                break;
            case 2:
                System.out.println("---- Koordinator Bidang dan Staf ----");
                System.out.print(
                        "1. Koordinator Humas\n2. Koordinator Acara\n3. Koordinator Publikasi dan Dokumentasi\n4. Koordinator Pelatihan\n> ");
                int koordinator = input.nextInt();
                switch (koordinator) {
                    case 1:
                        KoordHumas koordHumas = new KoordHumas();
                        System.out.println("Jabatan : " + koordHumas.getJabatan());
                        System.out.println("Tugas : " + koordHumas.getTugas());
                        System.out.println("Periode : " + koordHumas.getPeriode());
                        System.out.println("Anggota : " + koordHumas.getJumlahAnggota());
                        break;
                    case 2:
                        KoordAcara koordAcara = new KoordAcara();
                        System.out.println("Jabatan : " + koordAcara.getJabatan());
                        System.out.println("Tugas : " + koordAcara.getTugas());
                        System.out.println("Periode : " + koordAcara.getPeriode());
                        System.out.println("Anggota : " + koordAcara.getJumlahAnggota());
                        break;
                    case 3:
                        KoordPubDok koordPubDok = new KoordPubDok();
                        System.out.println("Jabatan : " + koordPubDok.getJabatan());
                        System.out.println("Tugas : " + koordPubDok.getTugas());
                        System.out.println("Periode : " + koordPubDok.getPeriode());
                        System.out.println("Anggota : " + koordPubDok.getJumlahAnggota());
                        break;
                    case 4:
                        KoordPelatihan koordPelatihan = new KoordPelatihan();
                        System.out.println("Jabatan : " + koordPelatihan.getJabatan());
                        System.out.println("Tugas : " + koordPelatihan.getTugas());
                        System.out.println("Periode : " + koordPelatihan.getPeriode());
                        System.out.println("Anggota : " + koordPelatihan.getJumlahAnggota());
                        break;
                    default:
                        System.out.println("Inputan tidak valid");
                        break;
                }
                break;
        }
    }
}
