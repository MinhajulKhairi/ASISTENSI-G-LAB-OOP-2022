public class Perhiasan {
    String nama; // atribut
    String warna;
    int harga;

    public void namaPerhiasan(String namaPerhiasan,String warnaPerhiasan,int hargaAksesoris){
        nama = namaPerhiasan;
        warna = warnaPerhiasan;
        harga = hargaAksesoris;
    } 
   
    public void cetakPerhiasan() {
        System.out.println("Nama Perhiasan: " + nama);
        System.out.println("Warna : " + warna);
        System.out.println("Harga : " + harga);
    }

    public static void main(String[] args) {
        Perhiasan per = new Perhiasan();
        per.namaPerhiasan("Gelang", "Hitam", 50000); 
        per.cetakPerhiasan();
    }
}