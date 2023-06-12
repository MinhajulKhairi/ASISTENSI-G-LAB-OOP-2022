class SiberianHusky extends Dog  {
    public SiberianHusky(int position, int averageLength) {
        super(position, averageLength);
    }
    @Override
    void describe() {
        System.out.println("SiberianHusky : anjing yang berenergi tinggi");
    }
    @Override
    public void move() {
        this.position += 3;
        System.out.println("SiberianHusky bergeser ke : " + position);
    }
}
