import java.util.ArrayList;

// class Character
abstract class Character {
    protected String name;
    protected int attackPower;

    public abstract int attack();

    public abstract int attack(String attackType);

    public Character(String name, int attackPower) {
        this.name = name;
        this.attackPower = attackPower;
    }

    public String getName() {
        return name;
    }

    public int getAttack() {
        return attackPower;
    }

    public void printAttack(Character character, String attackType) {
        System.out.println(character.attack(attackType));

    }
}

class Fighter extends Character {
    String attackType;

    public Fighter(String name, int attackPower) {
        super(name, attackPower);
    }

    @Override
    public int attack(String attackType) {
        if (attackType == "melee") {
            return attackPower * 2;
        } else if (attackType == "ranged") {
            return attackPower;
        } else {
            return 0;
        }
    }

    @Override
    public int attack() {
        return attackPower;
    }
}

class Mage extends Character {
    public Mage(String name, int attack) {
        super(name, attack);

    }

    @Override
    public int attack() {
        return attackPower;
    }

    @Override
    public int attack(String attackType) {
        if (attackType == "frost") {
            return attackPower * 2;
        } else if (attackType == "fire") {
            return attackPower * 3;
        } else {
            return 0;
        }
    }
}

/**
 * Main
 */
public class Tugas7No1 {
    public static void main(String[] args) {
        ArrayList<Character> characters = new ArrayList<>(5);
        Fighter character1 = new Fighter("Alexandre Fudhayl", 12);
        characters.add(character1);

        Mage character2 = new Mage("Christopher Bimasatya", 8);
        characters.add(character2);

        Fighter character3 = new Fighter("Napoleon Abrian", 8);
        characters.add(character3);

        Fighter character4 = new Fighter("Giovani Syawaluddin", 8);
        characters.add(character4);

        Mage character5 = new Mage("Sir Isaac Sianipar", 9);
        characters.add(character5);

        for (int i = 0; i < characters.size(); i++) {
            if (characters.get(i) instanceof Mage) {
                System.out.println("Character Mage");
                System.out.print("Frost attack : ");
                characters.get(i).printAttack(character2, "frost");
                System.out.print("Fire attack : ");
                characters.get(i).printAttack(character5, "fire");
            } else if (characters.get(i) instanceof Fighter) {
                System.out.println("Character Fighter");
                System.out.print("Melee attack : ");
                characters.get(i).printAttack(character1, "melee");
                System.out.print("Ranged attack : ");
                characters.get(i).printAttack(character3, "ranged");
            }
        }
    }
}