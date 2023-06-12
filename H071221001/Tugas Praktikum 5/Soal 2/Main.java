package No2;

public class Main {
    public static void main(String[] args) {
        String name = "Komunitas Programmer Unhas";
        System.out.println("Pengurus Inti " + name);
        Pengurus pengurus = new Pengurus("Ahmad", 100);
        System.out.println("Nama : " + pengurus.getNama());
        System.out.println("Posisi: " + pengurus.getPosisi());
        System.out.println("Jumlah Anggota : " + pengurus.getAnggota() + " orang");

        System.out.println("===========================================");

        System.out.println("Koordinator " + name);
        Koordinator koordinator = new Koordinator("Budi "," Bidang Acara ", 15);
        System.out.println("Nama : " + koordinator.getNama());
        System.out.println("Posisi: " + koordinator.getPosisi() + koordinator.getBidang());
        System.out.println("Jumlah Anggota : " + koordinator.getAnggota() + " orang");

        System.out.println("============================================");

        System.out.println("Staff " + name);
        Staf staf = new Staf("Nur "," Bidang Keuangan ");
        System.out.println("Nama : " + staf.getNama());
        System.out.println("Posisi : " + staf.getPosisi() + staf.getBidang());

    }
    
}
