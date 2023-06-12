public class Tugas6 {
    public static void main(String[] args) {
        // Dog pitbull = new Pitbull();
        Dog siberianHusky = new SiberianHusky();
        // Dog bulldog = new Bulldog();
        // Dog germanShepherd = new GermanShepherd();
        Smartphone samsung = new Smartphone(5000000, "Samsung");
        Car toyota = new Car(6, "Merah", 200);
        
        siberianHusky.move();
        siberianHusky.describe();
        samsung.move();
        toyota.move();
    }
}

interface Move {
    void move();
}

abstract class Dog implements Move{
    private int position;
    private int averageLength;

    Dog() {
        this.position = 0;
        this.averageLength = 0;
    }

    abstract void describe();

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public int getAverageLength() {
        return averageLength;
    }

    public void setAverageLength(int averageLength) {
        this.averageLength = averageLength;
    }
}

class Pitbull extends Dog {
    public Pitbull() {
        super();
    }

    @Override
    public void move() {
        System.out.println(super.getPosition() + 3);
    }

    @Override
    void describe() {
        System.out.println(
                "Anjing Pitbull merupakan anjing yang kuat, berotot, dan setia. Mereka cenderung menjadi anjing yang sangat aktif dan membutuhkan banyak latihan fisik. Terdapat beberapa jenis Pitbull seperti American Pitbull Terrier, Staffordshire Bull Terrier, dan American Bully.");
    }
}

class SiberianHusky extends Dog {
    public SiberianHusky() {
        super();
    }

    @Override
    public void move() {
        System.out.println(super.getPosition() + 2);
    }

    @Override
    void describe() {
        System.out.println(
                "Anjing Siberian Husky berasal dari Siberia dan dikenal karena bulu tebalnya serta kemampuan untuk bekerja di bawah suhu yang rendah. Siberian Husky cenderung menjadi anjing yang cerdas, aktif, dan ramah terhadap manusia.");
    }
}

class Bulldog extends Dog {
    Bulldog() {
        super();
    }

    @Override
    public void move() {
        System.out.println(super.getPosition() + 1);
    }

    @Override
    void describe() {
        System.out.println(
                "Anjing Bulldog adalah anjing yang pendek dan berotot dengan kepala besar. Mereka cenderung menjadi anjing yang tenang dan dapat diandalkan, namun juga bisa menjadi anjing yang keras kepala dan sulit dilatih. Bulldog sering kali dijadikan sebagai anjing penjaga rumah atau hewan peliharaan keluarga.");
    }
}

class GermanShepherd extends Dog {
    GermanShepherd() {
        super();
    }

    @Override
    public void move() {
        System.out.println(super.getPosition() + 3);
    }

    @Override
    void describe() {
        System.out.println(
                "Anjing German Shepherd merupakan anjing yang cerdas, setia, dan berani. Mereka cenderung menjadi anjing yang sangat aktif dan membutuhkan banyak latihan fisik dan mental. German Shepherd sering kali digunakan sebagai anjing penjaga, anjing polisi, atau anjing pencari dan penyelamat.");
    }
}


class Smartphone implements Move {
    private int price;
    private String brand;

    public Smartphone(int price, String brand) {
        this.price = price;
        this.brand = brand;
    }

    public void move() {
        System.out.println("Smartphone berpindah");
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}

class Car implements Move {
    private int totalForwardGear;
    private String color;
    private int maxSpeed;

    public Car(int totalForwardGear, String color, int maxSpeed) {
        this.totalForwardGear = totalForwardGear;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }

    public void move() {
        System.out.println("Mobil sedang berakselerasi");
    }

    public int getTotalForwardGear() {
        return totalForwardGear;
    }

    public void setTotalForwardGear(int totalForwardGear) {
        this.totalForwardGear = totalForwardGear;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
}
