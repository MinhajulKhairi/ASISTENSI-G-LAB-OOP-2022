public class Film {
    private String title;
    private int duration;
    private String director;
    private String genre;
    private String synopsis;

    public Film(String title, int duration, String director, String genre, String synopsis) {
        this.title = title;
        this.duration = duration;
        this.director = director;
        this.genre = genre;
        this.synopsis = synopsis;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    public void setDuration(int duration) {
        this.duration = duration;
    }
    public void setDirector(String director) {
        this.director = director;
    }
    public void setGenre(String genre) {
        this.genre = genre;
    }
    public void setSynopsis(String synopsis) {
        this.synopsis = synopsis;
    }

    public String getTitle() {
        return title;
    }
    public int getDuration() {
        return duration;
    }
    public String getDirector() {
        return director;
    }
    public String getGenre() {
        return genre;
    }
    public String getSynopsis() {
        return synopsis;
    }

    public void displayInfo() {
        System.out.println("1. Judul Film: \""+ getTitle() + "\"");
        System.out.println("2. Durasi: " + getDuration() + " menit");
        System.out.println("3. Director: " + getDirector());
        System.out.println("4. Genre: " + getGenre());
        System.out.println("-------------------------------");
        System.out.println("Synopsis:");
        System.out.println(getSynopsis());
        System.out.println("------------------------------------------------------------------------------------------------------------------");
    }
}