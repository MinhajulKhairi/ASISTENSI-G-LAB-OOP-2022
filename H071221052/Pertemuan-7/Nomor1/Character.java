package Nomor1;

abstract class Character {
    Character(String name, int attackPower) {
        this.name = name;
        this.attackPower = attackPower;
    }

    protected String name;
    void setName(String name) {
        this.name = name;
    }
    String getName() {
        return name;
    }
    
    protected int attackPower;
    int getAttackPower() {
        return attackPower;
    }
    void setAttackPower(int attackPower) {
        this.attackPower = attackPower;
    }

    abstract int attack();
    abstract int attack(String attackType);
    abstract void printAttack(Character character);
}



// abstract class Character { //polimorphisme
//     protected String name;

//     public Character(String name) {
//         this.name = name;
//     }

//     public String getName() {
//         return name;
//     }

//     abstract int attack();
//     abstract int attack(String attackType);
//     //abstract void printAttack(Character character);
// }




//Polimorfisme dalam Java adalah kemampuan untuk membuat objek yang memiliki tipe yang berbeda-beda, namun dapat diakses dengan cara yang sama melalui superclass atau interface yang sama. 
//Dalam polimorfisme, objek yang memiliki tipe yang berbeda-beda dapat diproses secara seragam dengan menggunakan metode atau tipe data yang sama. 
//Hal ini dapat meningkatkan fleksibilitas dan modularitas program dan memudahkan pengembangan aplikasi yang lebih kompleks.
