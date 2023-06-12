package OOP.Praktikum2.assignment_2_2;

public class Person {
    // Deklarasi atribut-atribut dari Class person
    private String name;
    private int age;
    private boolean isMale;
    
    // Method getter untuk mengambil nilai atribut name
    String getName() {
        return name;
    }
    
    // Method setter untuk mengubah nilai atribut name
    void setName(String name) {
        this.name = name;
    }
    
    // Method getter untuk mengambil nilai atribut age
    int getAge() {
        return age;
    }
    
    // Method setter untuk mengubah nilai atribut age
    public void setAge(int age) {
        this.age = age;
    }
    
    // Method getter untuk mengambil nilai atribut isMale
    public boolean isMale() {
        return isMale;
    }
    
    // Method setter untuk mengubah nilai atribut isMale
    public void setMale(boolean isMale) {
        this.isMale = isMale;
    }
}
