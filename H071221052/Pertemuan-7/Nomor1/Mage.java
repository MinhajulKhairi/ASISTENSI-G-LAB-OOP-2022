package Nomor1;
class Mage extends Character{

    Mage(String name, int attackPower) {
        super(name, attackPower);
    }

    @Override
    int attack() {
        return super.getAttackPower();
    }

    @Override
    void printAttack(Character character) {
        System.out.println("name = " + character.getName());
        System.out.println("attack power = " + character.attack());
    }

    @Override
    int attack(String attackType) {
        if (attackType.equalsIgnoreCase("frost")) {
            return super.getAttackPower()*2;
        } else if (attackType.equalsIgnoreCase("fire")){
            return super.getAttackPower()*3;
        } else {
            throw new Error("attack type fighter hanya berupa frost dan fire");
        }
    }
    
}


// class Mage extends Character {
//     private int attackPower;
    
//     public Mage(String name, int attackPower) {
//         super(name);
//         this.attackPower = attackPower;
//     }

//     @Override
//     int attack() {
//         return attackPower;
//     }
// //     void printAttackType(String attackType){
// //     System.out.println("Karakter" + attackType);

// // }
//     @Override
//     int attack(String attackType) {
//         if (attackType.equals("fire")) {
//            // printAttackType(attackType); //serangan elemen api
//             return attackPower * 3;

//         } else if (attackType.equals("frost")) { //serangan elemen es
//             return attackPower * 2;
//         } else {
//             System.out.println("Gagal"); 
//         }
//         return attackPower;
//     }
// }