public class MainKomunitas {
    public static void main(String[] args) {
        PengurusInti pengurusInti = new PengurusInti("ALQA", 19, "LAKI - LAKI", "KETUA");
        pengurusInti.setAlamat("BTP BLOK AB NO 90");
        pengurusInti.displayPengurusInti();

        System.out.println("===============================================");

        KordinatorBidangStaff koordinatorBidangStaff = new KordinatorBidangStaff("QADRI", 19, " LAKI - LAKI ",
                "TEKNOLOGI INFORMASI");
        koordinatorBidangStaff.setalamat("BTP");
        koordinatorBidangStaff.displayKoordinatorBidangStaff();

        System.out.println("===============================================");
    }
}
