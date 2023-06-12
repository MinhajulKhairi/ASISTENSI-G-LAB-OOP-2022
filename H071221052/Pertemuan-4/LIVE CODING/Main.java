public class Main {
    public static void main(String[] args) {
        Player player = new Player();
        System.out.println("==============================================================");

        System.out.println("-----PLAYER PERTAMA------");
        player.setName("AL QADRI");
        player.setLevel(95);
        player.setHealth(100);
        player.setMana(98);
        player.setExp(98.000);
        player.displayInfo();

        System.out.println("==============================================================");

        Player player2 = new Player(" Kevin ", 89, 99, 97, 88.000);
        System.out.println("-----Data Player Kedua------ ");
        System.out.println("Nama" + player2.getName());
        System.out.println("Levelnya ialah " + player2.getLevel());
        System.out.println("health pemain ini ialah " + player2.getHealth());
        System.out.println("Mana Pemain ini adalah " + player2.getMana());
        System.out.println("Exp pemain ini adalah " + player.getExp());

        System.out.println("==============================================================");


        SelfUtils.displaySelf();

    }

}
