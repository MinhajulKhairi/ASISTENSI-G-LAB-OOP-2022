import java.util.Scanner;

public class No7 {

    private String[] data = { "ayam", "anjing", "sapi", "bebek", "kucing", "domba", "kambing" };

    public int findIndex(String text) {
        text = text.toLowerCase();

        for (int i = 0; i < data.length; i++) {
            if (data[i].toLowerCase().equals(text)) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        No7 example = new No7();
        Scanner inp = new Scanner(System.in);
        String namaHewan = inp.nextLine();
        System.out.println("Indeks dari '" + namaHewan + "': " + example.findIndex(namaHewan.toLowerCase()));
        inp.close();
    }
}
