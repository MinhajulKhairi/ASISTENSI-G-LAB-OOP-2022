import java.util.Scanner;

public class Assignment_1_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String zoo = sc.nextLine();
        int kebun = findIndex(zoo);
        System.out.println(kebun);

        sc.close();
    }
    public static int findIndex(String teks) {
        String binatang[] = {"Singa", "gajah", "ayam", "bebek", "kucing", "kurcaci"};
        for (int i = 0; i < binatang.length; i+=1) {
            // binatang[0] = Singa
            // teks = ayam
            // Singa.equals(ayam)
            // binatang[1] = gajah
            // gajah.equals(ayam)
            // binatang[2] = ayam
            // ayam.equals(ayam)

            if (binatang[i].equalsIgnoreCase(teks)) {
                return i ;
            }
        }
        return -1;
    } 
}
