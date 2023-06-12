
import java.util.ArrayList;

class Main1 {
    public static void main(String[] args) {
        ArrayList<Character> characters = new ArrayList<>(5);
        Fighter lionheart = new Fighter("Lionheart", 12);  characters.add(lionheart);
        Mage cleopatra = new Mage("Cleopatra", 8); characters.add(cleopatra);
        Fighter genghis = new Fighter("Genghis Khan", 8); characters.add(genghis);
        Fighter achilles = new Fighter("Achilles", 8); characters.add(achilles);
        Mage mulan = new Mage("Mulan", 9); characters.add(mulan);

        for (int i = 0; i < characters.size(); i++) {
            Character character = characters.get(i);
            character.printAttack(character);
        }
    }
}