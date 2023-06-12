
class GermanShepherd extends Dog {
    public GermanShepherd( int position, int averageLength) {
        super(position,  averageLength);
    }

    public void move() {
        position += 2;
        System.out.println("Posisi : + "+ position);
    }

    void describe() {
        System.out.println("German Shepherd, anjing yang cerdas dan penurut.");
    }
}