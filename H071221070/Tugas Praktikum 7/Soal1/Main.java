package Soal1;

public class Main {
    public static void main(String[] args) {
        printAttack printAttacksss = new printAttack();

        Character[] karakter = new Character[5];
        karakter[0] = new Fighter("Fighter1", 20);
        karakter[1] = new Mage("Mage1", 25);
        karakter[2] = new Fighter("Fighter2", 10);
        karakter[3] = new Fighter("Fighter3", 40);
        karakter[4] = new Mage("Mage2", 35);

        for (Character character : karakter) {
            printAttacksss.printAttack(character);
        }
    }
}
