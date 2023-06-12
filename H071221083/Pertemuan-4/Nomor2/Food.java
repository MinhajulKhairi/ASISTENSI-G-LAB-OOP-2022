package Tugas4Nomor2;

public class Food {
    public String name;
    public String type;
    public int price;
    public double rating;

    public Food() {}

    public Food(String name, String type, int price, double rating) {
        this.name = name;
        this.type = type;
        this.price = price;
        this.rating = rating;
    }

    public void displayInfo(){
        System.out.println("Nama Makanan : " + this.name + "\nJenis Makanan : " + this.type + "\nHarga : " + this.price + "\nRating : " + this.rating);
    }



    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getPrice() {
        return this.price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public double getRating() {
        return this.rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    
}
