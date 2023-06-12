package No2;

public class Person {
    private String nama;
    private String posisi;
    private int anggota;

    public Person(String nama,String posisi, int anggota) {
        this.nama = nama;
        this.posisi = posisi;
        this.anggota = anggota;
        
    }
    public String getNama() {
        return nama;
    }
    public String getPosisi() {
        return posisi;
    }
    public int getAnggota() {
        return anggota;
    }
}

class Pengurus extends Person {

    public Pengurus (String nama, int anggota) {
        super(nama,"Ketua", anggota);
    }
}

class Koordinator extends Person {
    private String bidang;
    public Koordinator (String nama,String bidang, int anggota) {
        super(nama,"koordinator", anggota);
        this.bidang = bidang;
    }
    public String getBidang() {
        return bidang;
    }
}

class Staf extends Person {
    private String bidang;

    public Staf(String nama,String bidang) {
        super(nama,"Staf", 0);
        this.bidang = bidang;
    }
    public String getBidang() {
        return bidang;
    }

}