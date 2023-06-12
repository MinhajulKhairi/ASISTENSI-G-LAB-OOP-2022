package OOP.Praktikum3.assignment_3_2;


public class Player{
    // Deklarasi atribut class player
    private String name;
    private int hp;
    private int attackPower;
    private int defense;

    
    public Player(String name, int hp, int attackPower, int defense) {
        // Deklarasi atribut-atribut
        this.name = name;
        this.hp = hp;
        this.attackPower = attackPower;
        this.defense = defense;
    }

    // Method hp setelah mendapat attack
    public void getDamage(Player enemy) {
        hp = hp-Math.abs(enemy.getAttackPower()-defense); // hp penerima attack berkurang dari attack power penyerang - defense penerima 
    }

    // Method menampilkan status player
    public void status() {
        System.out.println(this.name + " status");
        System.out.println("HP = " + this.hp);
        System.out.println("Defense = " + this.defense);
        System.out.println("Attack = " + this.attackPower + "\n");
    }

    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public int getHp() {
        return hp;
    }
    
    public void setHp(int hp) {
        this.hp = hp;
    }
    
    public int getAttackPower() {
        return attackPower;
    }
    
    public void setAttackPower(int attackPower) {
        this.attackPower = attackPower;
    }
    
    public int getDefense() {
        return defense;
    }
    
    public void setDefense(int defense) {
        this.defense = defense;
    }
}
