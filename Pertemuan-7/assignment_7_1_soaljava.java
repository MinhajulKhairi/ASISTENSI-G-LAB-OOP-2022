abstract class Character {
    protected String name;

    public Character(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public abstract int attack();
    public abstract int attack(String attackType);
}

class Fighter extends Character {
    protected int attackPower;

    public Fighter(String name, int attackPower) {
        super(name);
        this.attackPower = attackPower;
    }

    public int attack() {
        return this.attackPower;
    }

    public int attack(String attackType) {
        if (attackType.equals("melee")) {
            return this.attackPower * 2;
        } else if (attackType.equals("ranged")) {
            return this.attackPower;
        } else {
            return 0;
        }
    }
}

class Mage extends Character {
    protected int attackPower;

    public Mage(String name, int attackPower) {
        super(name);
        this.attackPower = attackPower;
    }

    public int attack() {
        return this.attackPower;
    }

    public int attack(String attackType) {
        if (attackType.equals("fire")) {
            return this.attackPower * 3;
        } else if (attackType.equals("frost")) {
            return this.attackPower * 2;
        } else {
            return 0;
        }
    }
}

public class assignment_7_1_soaljava {
    public static void main(String[] args) {
        Character[] characters = new Character[5];
        characters[0] = new Fighter("Fighter1", 10);
        characters[1] = new Mage("Mage1", 20);
        characters[2] = new Fighter("Fighter2", 15);
        characters[3] = new Fighter("Fighter3", 20);
        characters[4] = new Mage("Mage2", 30);

        for (Character character : characters) {
            printAttack(character);
        }
    }

    public static void printAttack(Character character) {
        System.out.println("Name: " + character.getName());
        System.out.println("Attack Power: " + character.attack());
        if (character.getClass().toString().equals("class Fighter")) {
            System.out.println("Melee Attack Power: " + character.attack("melee"));
            System.out.println("Ranged Attack Power: " + character.attack("ranged"));
        }
        else if (character.getClass().toString().equals("class Mage")) {
            System.out.println("Frost Attack Power: " + character.attack("frost"));
            System.out.println("Fire Attack Power: " + character.attack("fire"));

        }
       
        System.out.println();
    }
}