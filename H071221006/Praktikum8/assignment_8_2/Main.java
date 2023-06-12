import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        TypeRacer typeRacer = new TypeRacer();
        typeRacer.setNewWordsToType();
        System.out.println("|| Text to Type ||");
        System.out.println("\"" + typeRacer.getWordsToType() + "\"");

        Typer[] typers = new Typer[3];

        typers[0] = new Typer("Valentino Fail", 80, typeRacer);
        typers[1] = new Typer("Alexander Bimasatya", 72, typeRacer);
        typers[2] = new Typer("Johny Leonardo", 70, typeRacer);

        typeRacer.getRaceContestant().addAll(Arrays.asList(typers));

        typeRacer.startRace();
    }
}
