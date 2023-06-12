public class KomunitasProgrammer {
    private String nama;
    private int age;
    private String gender;

    public KomunitasProgrammer(String nama, int age, String gender) {
        this.nama = nama;
        this.age = age;
        this.gender = gender;

    }

    public String getName() {
        return nama;
    }

    public void setName(String nama) {
        this.nama = nama;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void displayKomunitasProgrammer() {
        System.out.println("Nama: " + nama);
        System.out.println("Umur: " + age);
        System.out.println("Jenis Kelamin: " + gender);

    }
}

class PengurusInti extends KomunitasProgrammer {
    private String jabatan;
    private String alamat;

    public PengurusInti(String nama, int age, String gender, String jabatan) {
        super(nama, age, gender);
        this.jabatan = jabatan;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getJabatan() {
        return jabatan;
    }

    public void setJabatan(String jabatan) {
        this.jabatan = jabatan;
    }

    public void displayPengurusInti() {
        displayKomunitasProgrammer();
        System.out.println("Jabatan: " + jabatan);
        System.out.println("alamat: " + alamat);
    }

}

class KordinatorBidangStaff extends KomunitasProgrammer {
    private String bidang;
    private String alamat;

    public KordinatorBidangStaff(String nama, int age, String gender, String bidang) {
        super(nama, age, gender);
        this.bidang = bidang;
        this.alamat = alamat;
    }

    public void setalamat(String alamat) {
        this.alamat = alamat;
    }

    public String getalamat() {
        return alamat;
    }

    public String getBidang() {
        return bidang;
    }

    public void setBidang(String bidang) {
        this.bidang = bidang;
    }

    public void displayKoordinatorBidangStaff() {
        displayKomunitasProgrammer();
        System.out.println("Bidang: " + bidang);
        System.out.println("Alamat: " + alamat);

    }
}
