package com.week7.tugas1;

abstract class Character {
    private int attackPower;

    public Character(int attackPower) {
        this.attackPower = attackPower;
    }

    public int getAttackPower() {
        return attackPower;
    }

    public abstract int attack();

    public abstract int attack(String attackType);
}

class Fighter extends Character {
    public Fighter(int attackPower) {
        super(attackPower);
    }

    @Override
    public int attack() {
        return getAttackPower();
    }

    @Override
    public int attack(String attackType) {
        if (attackType.equals("melee")) {
            return getAttackPower() * 2;
        } else if (attackType.equals("ranged")) {
            return getAttackPower();
        } else {
            return 0;
        }
    }
}

class Mage extends Character {
    public Mage(int attackPower) {
        super(attackPower);
    }

    @Override
    public int attack() {
        return getAttackPower();
    }

    @Override
    public int attack(String attackType) {
        if (attackType.equals("fire")) {
            return getAttackPower() * 3;
        } else if (attackType.equals("frost")) {
            return getAttackPower() * 2;
        } else {
            return 0;
        }
    }
}
