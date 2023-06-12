package Tugas4Nomor2;

public class Main {
    public static void main(String[] args) {
        Food food = new Food();
        food.setName("Barongko");
        food.setType("Kue");
        food.setPrice(5000);
        food.setRating(9.0);

        food.displayInfo();

        Food makanan = new Food("Bakso", "Makanan Berat", 10000, 7.8);
        System.out.println(makanan.getName());
        System.out.println(makanan.getType());
        System.out.println(makanan.getPrice());
        System.out.println(makanan.getRating());

        SelfUtils.selfDisplay();
    }
}
