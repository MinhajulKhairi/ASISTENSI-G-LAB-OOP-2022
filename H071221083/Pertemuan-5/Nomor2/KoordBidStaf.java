package Nomor2;

public class KoordBidStaf {
    private String jabatan, tugas;
    private int periode, jumlahAnggota;

    public KoordBidStaf(String jabatan, String tugas, int periode, int jumlahAnggota) {
        this.jabatan = jabatan;
        this.tugas = tugas;
        this.periode = periode;
        this.jumlahAnggota = jumlahAnggota;
    }

    public String getJabatan() {
        return jabatan;
    }

    public void setJabatan(String jabatan) {
        this.jabatan = jabatan;
    }

    public String getTugas() {
        return tugas;
    }

    public void setTugas(String tugas) {
        this.tugas = tugas;
    }

    public int getPeriode() {
        return periode;
    }

    public void setPeriode(int periode) {
        this.periode = periode;
    }

    public int getJumlahAnggota() {
        return jumlahAnggota;
    }

    public void setJumlahAnggota(int jumlahAnggota) {
        this.jumlahAnggota = jumlahAnggota;
    }

}

class KoordHumas extends KoordBidStaf {
    public KoordHumas() {
        super("Koordinator Humas", "Membentuk Koneksi dengan Komunitas Lain", 2023, 10);
    }
}

class KoordAcara extends KoordBidStaf {
    public KoordAcara() {
        super("Koordinator Acara", "Mempersiapkan Kegiatan", 2023, 15);
    }
}

class KoordPubDok extends KoordBidStaf {
    public KoordPubDok() {
        super("Koordinator Publikasi dan Dokumentasi", "Mendokumentasikan dan mempublikasikan kegiatan", 2023, 5);
    }
}

class KoordPelatihan extends KoordBidStaf {
    public KoordPelatihan() {
        super("Koordinator Pelatihan", "Membuat materi pelatihan dan merekrut calon didikan", 2023, 10);
    }
}
