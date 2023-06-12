public class Main2 {
    public static void main(String[] args) {
        PengurusInti pengurusInti = new PengurusInti();
        pengurusInti.setNama("Lala");
        pengurusInti.setUmur(22);
        pengurusInti.setJabatan("ketua");
        pengurusInti.tampilkanInfo();
        pengurusInti.berbicara();
        pengurusInti.mengaturRapat();

        KoordinatorBidang koordinatorBidang = new KoordinatorBidang();
        koordinatorBidang.setNama("cipaa");
        koordinatorBidang.setUmur(25);
        koordinatorBidang.setJabatan("koordinator bidang konsumsi");
        koordinatorBidang.tampilkanInfo();
        koordinatorBidang.berbicara();
        koordinatorBidang.mengaturTugas();

        Staf staf = new Staf();
        staf.setNama("Liaa");
        staf.setUmur(29);
        staf.setJabatan("Sekretaris");
        staf.tampilkanInfo();
        staf.melaksanakanTugas();
    }
}