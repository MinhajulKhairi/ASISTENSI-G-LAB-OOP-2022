public class Profile {
    /*
     * Tambahkan attribute, method, atau constructor
     * yang dibutuhkan di kelas user
     */

    private String fullName;
    private String nickName;
    private String hobby;
    private int age;

    public String getFullName() {
        return fullName;
    }
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
    public String getNickName() {
        return nickName;
    }
    public void setNickName(String nickName) {
        this.nickName = nickName;
    }
    public String getHobby() {
        return hobby;
    }
    public void setHobby(String hobby) {
        this.hobby = hobby;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public Profile() {
    }

    Profile (String fullName, String nickName, String hobby, int age) {
        this.fullName = fullName;
        this.nickName = nickName;
        this.hobby = hobby;
        this.age = age;

    }

}
