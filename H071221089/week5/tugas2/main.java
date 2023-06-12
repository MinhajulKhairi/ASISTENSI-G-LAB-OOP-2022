package com.week5.tugas2;

public class main {
    public static void main(String[] args) {
        PengurusInti pi = new PengurusInti("haikal", 19, "Teknik matematika");
        pi.setJabatan("Ketua Umum");

        KoordinatorBidang kb = new KoordinatorBidang("farel", 50, "Teknik kedokteran", "Bidang datar");
        kb.setBidang("Bidang Keuangan");

        Staf st = new Staf("nabil", 69, "Teknik pernapasan matahari", "Departemen pemburu iblis");

        System.out.println("Pengurus Inti:");
        System.out.println("Nama: " + pi.getNama());
        System.out.println("Umur: " + pi.getUmur());
        System.out.println("Jurusan: " + pi.getJurusan());
        System.out.println("Jabatan: " + pi.getJabatan());

        System.out.println("\nKoordinator Bidang:");
        System.out.println("Nama: " + kb.getNama());
        System.out.println("Umur: " + kb.getUmur());
        System.out.println("Jurusan: " + kb.getJurusan());
        System.out.println("Bidang: " + kb.getBidang());

        System.out.println("\nStaf:");
        System.out.println("Nama: " + st.getNama());
        System.out.println("Umur: " + st.getUmur());
        System.out.println("Jurusan: " + st.getJurusan());
        System.out.println("Departemen: " + st.getDepartemen());
    }
}

