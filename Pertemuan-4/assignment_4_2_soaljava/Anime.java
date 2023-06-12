public class Anime {
    private String title;
    private int episodeCount;
    private String genre;
    private String studio;
    private String synopsis;

    public Anime(){

    }
    public Anime(String title, int episodeCount, String genre, String studio, String synopsis){
        this.title = title;
        this.episodeCount = episodeCount;
        this.genre = genre;
        this.studio = studio;
        this.synopsis = synopsis;
    }        
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public int getEpisodeCount() {
        return episodeCount;
    }
    public void setEpisodeCount(int episodeCount) {
        this.episodeCount = episodeCount;
    }
    public String getGenre() {
        return genre;
    }
    public void setGenre(String genre) {
        this.genre = genre;
    }
    public String getStudio() {
        return studio;
    }
    public void setStudio(String studio) {
        this.studio = studio;
    }
    public String getSynopsis() {
        return synopsis;
    }
    public void setSynopsis(String synopsis) {
        this.synopsis = synopsis;
    }
    public void displayInfo(){
        System.out.println("Title:" + title);
        System.out.println("Episode:" + episodeCount);
        System.out.println("Genre:" + genre);
        System.out.println("Studio:" + studio);
        System.out.println("Synopsis:" + synopsis);
    }
}
