class Bulldog extends Dog {
    public Bulldog(int position, int averageLength) {
        super(position, averageLength);
    }
    @Override
    void describe() {
        System.out.println("Bulldog : anjing ras tertua didunia yang berasal dari Inggris yang agresif dan tangguh ");
    }
    @Override
    public void move() {
        this.position += 3;
        System.out.println("Bulldog bergeser ke : " + position);
    }
}
