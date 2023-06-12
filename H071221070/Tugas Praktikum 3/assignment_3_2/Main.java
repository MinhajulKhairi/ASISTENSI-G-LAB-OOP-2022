package OOP.Praktikum3.assignment_3_2;


public class Main {
    public static void main(String [] args) {
        // Deklarasi player1 dan player2 beserta atributnya
        Player player1= new Player("Mino", 100, 35, 15);
        Player player2= new Player("Hilda", 100, 0, 10);

        // player2 di set memiliki attack power 35
        player2.setAttackPower(35);

        // player1 menerima attack dari player2
        player1.getDamage(player2);
        
        // Menampilkan status setelah attack
        player1.status();
        player2.status();
    }
}
