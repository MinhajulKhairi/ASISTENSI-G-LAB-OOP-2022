class Anggota {
    public String nama;
    public String nim;
    public String posisi;

    public Anggota(String nama, String nim, String posisi) {
        this.nama = nama;
        this.nim = nim;
        this.posisi = posisi;
    }
    public String getNama() {
        return nama;
    }
    public String getNim() {
        return nim;
    }
    public String getPosisi() {
        return posisi;
    }
}

class PengurusInti extends Anggota{
    private String jabatan;

    public PengurusInti(String nama, String nim, String posisi, String jabatan) {
        super(nama, nim, posisi);
        this.jabatan = jabatan;
    }

    public String getJabatan() {
        return jabatan;
    }

    public void infoInti() {
        System.out.println(getNama() + " ("+getNim()+")" + " adalah " + getPosisi() + " dengan jabatan " + getJabatan() + ".");
    }
}

class KoordinatorBidang extends Anggota{
    private String divisi;

    public KoordinatorBidang(String nama, String nim, String posisi, String divisi) {
        super(nama, nim, posisi);
        this.divisi = divisi;
    }

    public String getDivisi() {
        return divisi;
    }

    public void infoKoordinator() {
        System.out.println(getNama() + " ("+getNim()+")" + " adalah " + getPosisi() + " pada divisi " + getDivisi() + ".");
    }
}

class Staff extends Anggota {
    private String divisi;
    private String proker;

    public Staff(String nama, String nim, String posisi, String divisi, String proker) {
        super(nama, nim, posisi);
        this.divisi = divisi;
        this.proker = proker;
    }

    public String getDivisi() {
        return divisi;
    }
    public String getProker() {
        return proker;
    }

    public void infoStaff() {
        System.out.println(getNama() + " ("+getNim()+")" + " adalah " + getPosisi() + " pada divisi " + getDivisi() + " dengan tugas " + getProker() + ".");
    }
}

public class soal2 {
    public static void main(String[] args) {
        // Anggota anggota = new Anggota(null, null, null);
        PengurusInti pengurusInti = new PengurusInti("Andrew", "H071221999", "Pengurus Inti", "Ketua Komunitas Programmer");
        KoordinatorBidang koordinatorBidang = new KoordinatorBidang("Reynald", "H071221777", "Koordinator Bidang", "Sistem Informasi");
        Staff staff = new Staff("Michael", "H071221000", "Staff", "Sistem Informasi", "melaksanakan tugas lain yang diberikan oleh pimpinan");

        pengurusInti.infoInti();
        koordinatorBidang.infoKoordinator();
        staff.infoStaff();
    }
}