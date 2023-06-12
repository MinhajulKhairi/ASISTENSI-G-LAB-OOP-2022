class Player {
    public String name;     // atribut
    public int hp;
    public int attackPower;
    public int defense;

    public Player(){} // nilai default (Constructor 1)

    public void getDamage(Player enemy) {
        hp = hp - Math.abs(enemy.getAttackPower() - defense);
    }

    // BAGIAN LENGKAPI
    // Constructor 2
    public Player(String name, int attackPower, int defense) {
        this.name = name;
        this.attackPower = attackPower;
        this.defense = defense;
        this.hp = 100;
    }
    // Constructor 3
    public Player(String name, int defense) {
        this.name = name;
        this.defense = defense;
        this.hp = 100;
    }


    // behavior
    public void status() {
        System.out.println(name + " status");
        System.out.println("HP = " + hp);
        System.out.println("Defense = " + defense);
        System.out.println("Attack = " + attackPower + "\n");
    }

    // getter dan setter
    public void setAttackPower(int attackPower) {
        this.attackPower = attackPower;
    }

    int getAttackPower() {
        return attackPower;
    }

    public static void main(String[] args) {
        Player player1 = new Player("Mino", 30, 15);
        Player player2 = new Player("Hilda", 10);

        player2.setAttackPower(35);

        player1.getDamage(player2);

        player1.status();
        player2.status();
    }
}

