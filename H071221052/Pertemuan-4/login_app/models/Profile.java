package login_app.models;

public class Profile { // modifier public
    private String nama; // momdifier private
    private int umur;
    private String nickname;
    private String hobi;

    public Profile(String nama, int umur, String hobi) {
        this.nama = nama;
        this.umur = umur;
        this.hobi = hobi;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public Profile() {
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getUmur() {
        return umur;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }

    public String getHobi() {
        return hobi;
    }

    public void setHobi(String hobi) {
        this.hobi = hobi;
    }

}

