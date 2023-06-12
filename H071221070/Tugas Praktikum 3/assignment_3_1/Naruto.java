package OOP.Praktikum3.assignment_3_1;

public class Naruto extends handSeal {
    private handSeal seals;
    int narutoHp;

    public Naruto() {
        super();
    }

    public void kageBunshinNoJutsu() {
        System.out.println("Naruto Melakukan Kage Bunshin no Jutsu!");
    }

    public void rasengan() {
        System.out.println("Naruto Melakukan Rasengan!");
    }

    public void useUltimate() {
        System.out.println("Naruto menggunakan ulti Kurama!");
    }

    public handSeal getSeals() {
        return seals;
    }
}
