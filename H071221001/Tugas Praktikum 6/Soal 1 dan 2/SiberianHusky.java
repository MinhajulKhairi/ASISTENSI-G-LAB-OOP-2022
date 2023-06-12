
class SiberianHusky extends Dog {
    public SiberianHusky( int position, int averageLength) {
        super(position,  averageLength);
    }

    public void move() {
        position += 2;
        System.out.println("Posisi "+ position);
    }

    void describe() {
        System.out.println("Siberian Husky itu anjing yang bersahabat dan tidak bisa diam");
    }
}
