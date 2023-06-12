abstract class Dog implements Pindah{
    protected int position;
    protected int averageLength;

    
    public Dog(int position, int averageLength) {
        this.position = position;
        this.averageLength = averageLength;
    }

    public abstract void move();

    abstract void describe();
}