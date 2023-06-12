package com.week5.tugas2;

public class Anggota {
    private String nama;
    private int umur;
    private String jurusan;

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getUmur() {
        return umur;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }

    public String getJurusan() {
        return jurusan;
    }

    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }

    Anggota(String nama, int umur, String jurusan) {
        this.nama = nama;
        this.umur = umur;
        this.jurusan = jurusan;
    }
    
}

class PengurusInti extends Anggota {
    private String jabatan;

    public PengurusInti(String nama, int umur, String jurusan) {
        super(nama, umur, jurusan);
        this.jabatan = jabatan;
    }

    public String getJabatan() {
        return jabatan;
    }

    public void setJabatan(String jabatan) {
        this.jabatan = jabatan;
    }
    
}

class KoordinatorBidang extends Anggota {
    private String bidang;

    public KoordinatorBidang(String nama, int umur, String jurusan, String bidang) {
        super(nama, umur, jurusan);
        this.bidang = bidang;
    }

    public String getBidang() {
        return bidang;
    }

    public void setBidang(String bidang) {
        this.bidang = bidang;
    }
}

class Staf extends Anggota {
    private String departemen;

    public Staf(String nama, int umur, String jurusan, String departemen) {
        super(nama, umur, jurusan);
        this.departemen = departemen;
    }

    public String getDepartemen() {
        return departemen;
    }

    public void setDepartemen(String departemen) {
        this.departemen = departemen;
    }
}
