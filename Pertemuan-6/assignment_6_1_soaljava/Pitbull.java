class Pitbull extends Dog{
    public Pitbull(int position, int averageLength) {
        super(position, averageLength);
    }
    @Override
    void describe() {
        System.out.println("Pitbull : salah satu ras anjing yang memiliki temperamen paling stabil dari semua ras murni");
    }
    @Override
    public void move() {
        this.position += 3;
        System.out.println("Pitbull bergeser ke : " + position);
    }
    
}
