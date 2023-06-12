import java.util.Scanner;

public class Assignment_1_4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String kalimat ;

        System.out.println("Masukkan Judul Film : ");
        kalimat = input.nextLine();

        StringBuilder kalimatBaru = new StringBuilder();
// "tes", index 0 = t, index 1 = e, index 2 -=
// text1= tes
// text2 = ini
// [text1, text2, text3...]
        for (String kata : kalimat.split(" ")) {
            String kataBaru = kata.substring(0, 1).toUpperCase() +  kata.substring(1).toLowerCase();
            kalimatBaru.append(kataBaru).append(" ");
            
        }
        System.out.println(kalimatBaru);
        input.close();
    }
}
