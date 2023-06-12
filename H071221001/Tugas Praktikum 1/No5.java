import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class No5 {
    public static void main(String[] args) throws ParseException {
        Scanner inp = new Scanner(System.in);
        String tglLama = inp.nextLine();
        DateFormat dateFormat = new SimpleDateFormat("d MMMM yyyy");
        DateFormat df = new SimpleDateFormat("d-MM-yy");
        String tglBaru = dateFormat.format(df.parse(tglLama));
        System.out.println(tglBaru);
        inp.close();
    }

}
