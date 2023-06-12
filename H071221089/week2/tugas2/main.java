package com.week2.tugas2;

public class main {
    public static void main(String[] args) {
        PersonApp person = new PersonApp();
        
        person.setName("haikal");
        person.setAge(19);
        person.setGender(true);
        
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
        System.out.println("Gender: " + person.getGender());
    }    
}
