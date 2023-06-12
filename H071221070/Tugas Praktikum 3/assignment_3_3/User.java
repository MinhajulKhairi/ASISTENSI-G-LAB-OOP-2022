package OOP.Praktikum3.assignment_3_3;

public class User {
    private String name;
    private int balance;

    public User(String name, int balance) {
        this.name = name;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    } 

    public boolean checkBalance(int price) {
        return balance >= price;
    }

    // Method untuk menampilkan informasi nama dan saldo user
    public void userInfo(){
        System.out.println("-----------CARD-------------");
        System.out.println(getName());
        System.out.println(getBalance());
        System.out.println("----------------------------");
    }
}
