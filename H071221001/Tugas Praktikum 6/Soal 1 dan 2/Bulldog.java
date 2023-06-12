
class Bulldog extends Dog{
    public Bulldog(int position, int averageLength) {
        super(position,  averageLength);
    }

    public void move() {
        position += 1;
        System.out.println("Posisi "+ position);
    }

    void describe() {
        System.out.println("Bulldog merupakan anjing yang agresif dan tangguh");
    }
}