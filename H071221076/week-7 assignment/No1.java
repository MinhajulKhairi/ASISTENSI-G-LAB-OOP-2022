abstract class Character{
    protected String name;

    public Character(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    abstract int attack();

    abstract int attack(String attackType);

}

class Fighter extends Character{
    protected int attackPower;

    Fighter(String name, int attackPower) {
        super(name);
        this.attackPower = attackPower;
    }

    @Override
    int attack() {
        return attackPower;  
    }

    @Override
    int attack(String attackType) {
        if (attackType.equals("melee")) {
            return attackPower * 2;
        } else if (attackType.equals("ranged")) {
            return attackPower;
        } else {
            return 0;
        }
    }
}
class Mage extends Character{
    protected int attackPower;

    Mage(String name, int attackPower) {
        super(name);
        this.attackPower = attackPower;
    }

    @Override
    int attack() {
        return attackPower;
    }

    @Override
    int attack(String attackType) {
        if (attackType.equals("fire")) {
            return attackPower * 3;
        } else if (attackType.equals("frost")) {
            return attackPower * 2;
        } else {
            return 0;
        }
    }
}

public class No1 {
    public static void main(String[] args) {
        Character[] character = new Character[5];
        character[0] = new Fighter("Fighter1", 10);
        character[1] = new Mage("Mage1", 10);
        character[2] = new Fighter("Fighter2", 20);
        character[3] = new Fighter("Fighter3", 30);
        character[4] = new Mage("Mage2", 20);

         for (Character characters : character) {
            printAttack(characters);
        }
    }

    public static void printAttack(Character character) {
        System.out.println("Name: " + character.getName());
        System.out.println("Attack Power: " + character.attack());
        if (character.getClass().toString().equals("class Fighter")) {
            System.out.println("Melee Attack Power: " + character.attack("melee"));
            System.out.println("Ranged Attack Power: " + character.attack("ranged"));
            
        }
        else if(character.getClass().toString().equals("class Mage")){
            System.out.println("Frost Attack Power: " + character.attack("frost"));
            System.out.println("Fire Attack Power: " + character.attack("fire"));
            System.out.println();
            
        }
        System.out.println();
    }
}
