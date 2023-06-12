package Soal1;

abstract class Character {
    String name;

    public String getName() {
        return name;
    }

    abstract int attack();

    abstract int attack(String attackType);
}

class Fighter extends Character {
    int attackPower;

    public Fighter(String name, int attackPower) {
        this.name = name;
        this.attackPower = attackPower;
    }

    @Override
    int attack() {
        return attackPower;
    }

    @Override
    int attack(String attackType) {
        if (attackType.toLowerCase().equals("melee")) {
            return attackPower*2;
        } else if (attackType.toLowerCase().equals("ranged")) {
            return attackPower;
        } else {
            return 0;
        }
    }
}

class Mage extends Character {
    int attackPower;

    public Mage(String name, int attackPower) {
        this.name = name;
        this.attackPower = attackPower;
    }

    @Override
    int attack() {
        return attackPower;
    }

    @Override
    int attack(String attackType) {
        if (attackType.toLowerCase().equals("frost")) {
            return attackPower*2;
        } else if (attackType.toLowerCase().equals("fire")) {
            return attackPower*3;
        } else {
            return 0;
        }
    }
}

class printAttack {
    void printAttack(Character character) {
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
    }
}