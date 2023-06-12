public class DataDiri {
    public static void main(String[] args) {
        Alamat alamat = new Alamat(); 
        alamat.jalan = "Hertasning";
        alamat.kota = "Makassar";

        Mahasiswa mahasiswa = new Mahasiswa ();
        mahasiswa.alamat = alamat;
        mahasiswa.nama = "Chipa";
        mahasiswa.nim = "H071221100";
        System.out.println(mahasiswa.alamat.jalan);
        
        System.out.println("Nama: " + mahasiswa.getNama());
        System.out.println("Nim: " + mahasiswa.getNim());
        System.out.println("Alamat: " + alamat.getAlamatLengkap());
    }
}
