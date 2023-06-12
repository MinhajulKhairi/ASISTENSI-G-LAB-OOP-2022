package Praktikum4.assignment_4_1.models;
import Praktikum4.assignment_4_1.utils.StringUtils;

public class Profile {
    String fullName;
    String nickName;
    int age;
    String hobby;
    StringUtils stringUtils;

    public Profile(String fullName, String nickName, int age, String hobby) {
        this.fullName = fullName;
        this.nickName = nickName;
        this.age = age;
        this.hobby = hobby;
    }
    
    public String getFullName() {
        return fullName;
    }


    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getNickName() {
        String nickName = StringUtils.generateNickname(fullName);
        return nickName;
    }


    public void setNickName(String nickName) {
        this.nickName = nickName;
    }


    public int getAge() {
        return age;
    }


    public void setAge(int age) {
        this.age = age;
    }


    public String getHobby() {
        return hobby;
    }


    public void setHobby(String hobby) {
        this.hobby = hobby;
    }
}







/*
 * TODO:
 * Tambahkan attribute, method, atau constructor
 * yang dibutuhkan di kelas user
 */
