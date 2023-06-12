class Pitbull extends Dog{
    public Pitbull(String variant, String race, int position, int averageLength) {
        super(variant, race, position, averageLength);
        this.averageLength = 3;
    }

    @Override
    void describe() {
        System.out.println(variant + " adalah anjing dengan ras " + race + ".");
    }
}





class SiberianHusky extends Dog{
    public SiberianHusky(String variant, String race, int position, int averageLength) {
        super(variant, race, position, averageLength);
        this.averageLength = 2;
    }

    @Override
    void describe() {
        System.out.println(variant + " adalah anjing dengan ras " + race + ".");
    }
}




class Bulldog extends Dog{
    public Bulldog(String variant, String race, int position, int averageLength) {
        super(variant, race, position, averageLength);
        this.averageLength = 1;
    }

    @Override
    void describe() {
        System.out.println(variant + " adalah anjing dengan ras " + race + ".");
    }
}





class GermanShepherd extends Dog{
    public GermanShepherd(String variant, String race, int position, int averageLength) {
        super(variant, race, position, averageLength);
        this.averageLength = 3;
    }

    @Override
    void describe() {
        System.out.println(variant + " adalah anjing dengan ras " + race + ".");
    }
}