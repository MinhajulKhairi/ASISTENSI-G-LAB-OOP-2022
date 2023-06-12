
public class Profile {
    private String fullName;
    private int age;
    private String hobby;
    private String nickName;
    private User user; 

    public Profile (){} 
    
    public Profile(String fullName, int age, String hobby) { 
        this.fullName = fullName;
        this.age = age;
        this.hobby = hobby;
        this.nickName = StringUtils.getNickName(fullName);
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
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

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}