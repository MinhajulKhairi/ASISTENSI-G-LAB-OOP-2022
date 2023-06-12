package Nomor3;
import java.util.List;

public class Restaurant {
    public static int calculateTotal(List<Food> orders) {
        int total = 0;
        for (Food order : orders) {
            total = total + order.getPrice();
           // total += order.getPrice();

        }
        return total;
    }
}