public class PengurusInti extends SistemInformasi{

    public void tampilkanInfo(){
        System.out.println("\n" + "=".repeat(40));
        System.out.println(" ".repeat(13) + "Pengurus  Inti " + " ".repeat(13));
        System.out.println("=".repeat(40));
        System.out.println("nama \t: " + getNama() + "\numur \t: " + getUmur() + " tahun" + "\njabatan : " + getJabatan());
    }
    public void mengaturRapat(){
        System.out.printf("saya %s sebagai %s akan memandu \njalannya presentasi kali ini...", super.getNama(), super.getJabatan());

    }
}