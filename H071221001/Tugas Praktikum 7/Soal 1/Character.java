
abstract class Character {
    protected String name;
    protected int attackPower;

    public Character(String name, int attackPower) {
        this.name = name;
        this.attackPower = attackPower;
    }

    public int getAttackPower() {
        return attackPower;
    }

    public String getName() {
        return name;
    }

    public abstract int attack();
    public abstract int attack(String attackType);

    public void printAttack(Character character) {
        System.out.println("=".repeat(40));
        System.out.println(character.getName() + " - " + character.getClass().getSimpleName());
            System.out.println("Normal Attack : " + character.attack());

        System.out.println(character.getClass().toString().equals("class Fighter"));
        if (character instanceof Fighter) {
            System.out.println("Melee         : " + character.attack("melee"));
            System.out.println("Ranged        : " + character.attack("ranged"));
        } else if (character instanceof Mage) {
            System.out.println("Fire          : " + character.attack("fire"));
            System.out.println("Frost         : " + character.attack("frost"));
        }
    }
}