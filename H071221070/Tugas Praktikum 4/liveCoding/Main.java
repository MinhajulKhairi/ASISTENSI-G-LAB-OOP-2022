public class Main {
    public static void main(String[] args) {
        Film film = new Film("", 0, "", "", "");

        film.setTitle("The Grand Budapest Hotel");
        film.setDuration(100);
        film.setDirector("Wes Anderson");
        film.setGenre("Comedy, Drama, Adventure, Indie");
        film.setSynopsis("In the 1930s, the Grand Budapest Hotel is a popular European ski resort, presided over by concierge Gustave H. Zero, a junior lobby boy, becomes Gustave's friend and protege. Gustave prides himself on providing first-class service to the hotel's guests. When one of Gustave's lovers dies mysteriously, Gustave finds himself the recipient of a priceless painting and the chief suspect in her murder.");

        film.displayInfo();

        Film film2 = new Film("The Grand Budapest Hotel", 100, "Wes Anderson", "Comedy, Drama, Adventure, Indie", "In the 1930s, the Grand Budapest Hotel is a popular European ski resort, presided over by concierge Gustave H. Zero, a junior lobby boy, becomes Gustave's friend and protege. Gustave prides himself on providing first-class service to the hotel's guests. When one of Gustave's lovers dies mysteriously, Gustave finds himself the recipient of a priceless painting and the chief suspect in her murder.");
        System.out.println(film2.getTitle());
        System.out.println(film2.getDuration());
        System.out.println(film2.getDirector());
        System.out.println(film2.getGenre());
        System.out.println(film2.getSynopsis());

        SelfUtils.displaySelfData();
    }
}
