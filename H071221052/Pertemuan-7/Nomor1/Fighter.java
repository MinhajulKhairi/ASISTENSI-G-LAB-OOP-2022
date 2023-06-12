package Nomor1;
class Fighter extends Character {

    Fighter(String name, int attackPower) {
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
        if (attackType.equalsIgnoreCase("melee")) {
            return super.getAttackPower()*2;
        } else if (attackType.equalsIgnoreCase("ranged")){
            return super.getAttackPower();
        } else {
            throw new Error("attack type fighter hanya berupa melee dan ranged");
        }
    }
    
}


// class Fighter extends Character {
//     private int attackPower;

//     public Fighter(String name, int attackPower) {
//         super(name);
//         this.attackPower = attackPower;
//     }
    
//     @Override
//     int attack() {
//         return attackPower;
//     }

//     @Override
//     int attack(String attackType) {
//         if (attackType.equals("melee")) { //serangan jarak dekat
//             return attackPower*2;
//         } else if (attackType.equals("ranged")) { //serangan jarak jauh
//             return attackPower;
//         } else {
//             return attackPower;
//         }
//     }
    
// }
