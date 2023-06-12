public class Main {
    public static void main(String[] args) {
        Anime anime1 = new Anime();
        anime1.setTitle("OnePiece");
        anime1.setEpisodeCount(1000);
        anime1.setGenre("Adventure");
        anime1.setStudio("TV Series");
        anime1.setSynopsis("Menjadi bajak laut nomor 1");

        anime1.displayInfo();
        System.out.println("======================");

        Anime anime2 = new Anime("HxH", 148, "Action", "Madhouse", "HxH mencari Bapaknya");
        System.out.println("Title : " + anime2.getTitle());
        System.out.println("Episode : " + anime2.getEpisodeCount());
        System.out.println("Genre : " + anime2.getGenre());
        System.out.println("Studio : " + anime2.getStudio());
        System.out.println("Synopsis : " + anime2.getSynopsis());

        System.out.println("======================");
        SelfUtils.displaySelfData();
    }
}