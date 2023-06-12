package OOP.Praktikum1;
import java.util.Scanner;

public class assignment_1_4 {
    public static String capitalizeTitle(String title) {
        // Memisahkan setiap kata dalam judul menggunakan method split() dan menyimpannya ke dalam array
        String[] splitTitle = title.split("\\s+");
        // Membuat objek StringBuilder untuk membangun kembali string dengan huruf besar pada setiap kata
        StringBuilder result = new StringBuilder();
        
        // Looping untuk setiap kata dalam array splitTitle
        for (String word : splitTitle) { // Jika kata tidak kosong
                char filmChar = Character.toUpperCase(word.charAt(0));
                // Mengubah sisa huruf dalam kata menjadi huruf kecil
                String restOfWord = word.substring(1).toLowerCase();
                // Menggabungkan huruf besar pada huruf pertama dengan sisa huruf kecil dalam kata
                String capitalizedWord = filmChar + restOfWord;
                // Menambahkan kata yang telah diubah ke dalam objek StringBuilder
                result.append(capitalizedWord);
            result.append(" "); // Menambahkan spasi di antara setiap kata
        }
        // Mengubah objek StringBuilder menjadi string dan menghapus spasi ekstra di awal dan akhir
        String capitalizedTitle = result.toString().trim();
        
         // Mengembalikan string dengan huruf besar pada setiap kata
        return capitalizedTitle;
    }
    public static void main(String[] args) {
        // Membuat object scanner
        Scanner input = new Scanner(System.in);
        // Menginput judul film
        System.out.print("Masukkan Judul Film: ");
        String filmTitle = input.nextLine();
        // Menggunakan method ke judul film yang telah diinput, dan disimpan ke dalam variabel
        String filmTitleCapital = capitalizeTitle(filmTitle);

        System.out.println(filmTitleCapital);
    }

}
