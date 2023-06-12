
class Pitbull extends Dog{
    public Pitbull(int position, int averageLength) {
        super(position,  averageLength);
    }

    public void move() {
        position += 3;
        System.out.println("Posisi :  "+ position);
    }

    void describe() {
        System.out.println("Pitbull adalah petarung yang agresif.");
    }
}