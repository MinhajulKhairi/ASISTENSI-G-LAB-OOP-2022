package assignment_8_2_soaljava;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        TypeRacer typeRacer = new TypeRacer();
        typeRacer.setNewWordsToType();
        System.out.println("||  Text to Type  ||");
        System.out.println("\"" + typeRacer.getWordsToType() + "\"");

        Typer[] typers = new Typer[3];

        typers[0] = new Typer("Bot Izzata", 80, typeRacer);
        typers[1] = new Typer("Bot Clarissa", 72, typeRacer);
        typers[2] = new Typer("Bot Salsabila", 40, typeRacer);

        typeRacer.getRaceContestant().addAll(Arrays.asList(typers));

        typeRacer.startRace();
    }
}