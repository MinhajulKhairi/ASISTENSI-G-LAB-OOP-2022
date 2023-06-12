import java.util.Scanner;

public class No1 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("NIM : ");
        String inputNIM = inp.nextLine();
        int NIM = Integer.parseInt(inputNIM.substring(inputNIM.length() - 3));
        int num = NIM % 7;
        System.out.println(num == 0 ? "Soal: no 7" : "Soal : no " + num);
        inp.close();
    }
}