public class Player {
    private String name;
    private int level;
    private int health;
    private int mana;
    private double exp;

    public Player() {
    }

    public Player(String name, int level, int health, int mana, double exp) {
        this.name = name;
        this.level = level;
        this.health = health;
        this.mana = mana;
        this.exp = exp;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    public double getExp() {
        return exp;
    }

    public void setExp(double exp) {
        this.exp = exp;
    }

    public void displayInfo() {
        System.out.println("Nama : " + name);
        System.out.println("Level Player ialah : " + level);
        System.out.println("Health Player ini: " + health);
        System.out.println("Mana Player ini sebesar " + mana);
        System.out.println("Exp untuk player ini adalah : " + exp);
    }

}