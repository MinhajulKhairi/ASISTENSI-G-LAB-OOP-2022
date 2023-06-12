package OOP.Praktikum3.assignment_3_1;

public class Sasuke extends handSeal{
    private handSeal seals;
    int sasukeHp;

    public Sasuke() {
        super();
    }
    
    public void chidori() {
        System.out.println("Sasuke melakukan Chidori!");
    }
    
    public void susanoo() {
        System.out.println("Sasuke melakukan Susanoo!");
    }
    
    public void useUltimate() {
        System.out.println("Sasuke menggunakan ulti Mangekyou Sharingan!");
    }
    
    public handSeal getSeals() {
        return seals;
    }
}
