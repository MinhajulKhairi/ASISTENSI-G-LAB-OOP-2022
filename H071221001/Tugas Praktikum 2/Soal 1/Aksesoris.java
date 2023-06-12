
public class Aksesoris {
    String warna;
    int harga;
    String nama;

    public void namaAksesoris(String namaAksesoris){
        nama = namaAksesoris;
    } 
    public void warnaAksesoris(String warnaAksesoris){
        warna = warnaAksesoris;
    } 
    public void hargaAksesoris(int hargaAksesoris){
        harga = hargaAksesoris;
    } 
    public void cetakAksesoris() {
        System.out.println("Nama Aksesoris: " + nama);
        System.out.println("Warna : " + warna);
        System.out.println("Harga : " + harga);
    }
    public static void main(String[] args) {
    Aksesoris aks = new Aksesoris();
    System.out.println(aks.nama);
    aks.namaAksesoris("Gelang"); 
    aks.warnaAksesoris("Biru");
    aks.hargaAksesoris(100000);
    aks.cetakAksesoris();
}

}
