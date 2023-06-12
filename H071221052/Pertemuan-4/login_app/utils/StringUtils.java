package login_app.utils; //mendefinisikan package tempat class StringUtils berada.

public class StringUtils { // mendefinisikan class StringUtils sebagai public.
    // public static void main(String[] args) {
    // System.out.println(nickName("AL QADRI"));
    // }
    static public String nickName(String name) { // mendefinisikan sebuah method bernama nickName dengan tipe data
                                                 // kembalian String, modifier static dan public. Method ini menerima
                                                 // sebuah parameter bertipe String yang dinamakan name.
        String[] listNama = name.split(" "); // mendeklarasikan sebuah variabel bertipe array String dengan nama
                                             // listNama yang diisi dengan array yang dihasilkan dari pemecahan string
                                             // name menggunakan delimiter
        if (listNama.length == 1) { // melakukan pengecekan apakah jumlah elemen array listNama adalah 1.
            name = listNama[0]; // jika jumlah elemen array listNama adalah 1, maka nilai variabel name akan
                                // diisi dengan elemen pertama dari array listNama
        } else {
            name = listNama[1]; // jika jumlah elemen array listNama lebih dari 1, maka nilai variabel name akan
                                // diisi dengan elemen kedua dari array listNama.
        }
        return name; // mengembalikan nilai variabel name sebagai hasil dari method nickName.
    }
}

