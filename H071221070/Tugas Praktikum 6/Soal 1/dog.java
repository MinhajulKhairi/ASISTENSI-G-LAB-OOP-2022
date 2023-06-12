abstract class Dog implements Move{
    String variant;
    String race;
    int position;
    int averageLength;

    public Dog(String variant, String race, int position, int averageLength) {
        this.variant = variant;
        this.race = race;
        this.position = position;
        this.averageLength = averageLength;
    }

    abstract void describe();

    @Override
    public void move() {
        position = position + averageLength;
        System.out.println(variant + " bergeser ke posisi: " + position);
    }
}