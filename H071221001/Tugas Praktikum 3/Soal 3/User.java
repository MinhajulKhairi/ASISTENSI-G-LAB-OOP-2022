package No3;

public class User {
    String name;
    int balance;

    public User(String name, int balance) {
        this.name = name;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void card() {
        System.out.println("-------------CARD------------");
        System.out.println(this.name);
        System.out.println(this.balance);
        System.out.println("-----------------------------");
    }
}
