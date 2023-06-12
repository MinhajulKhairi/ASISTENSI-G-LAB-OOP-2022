package com.week2.tugas1;

public class mobileLegend {
    String name;
    String role;
    String job;

    public mobileLegend(String name, String role, String job) {
        this.name = name;
        this.role = role;
        this.job = job;
    }
    public void Hero() {
        System.out.printf("name = %s \nrole = %s \njob = %s \n", name, role, job);
    }
}
