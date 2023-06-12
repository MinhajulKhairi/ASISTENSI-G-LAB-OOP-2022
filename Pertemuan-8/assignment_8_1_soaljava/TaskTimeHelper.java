package assignment_8_1_soaljava;

import java.util.Random;

public class TaskTimeHelper {
    public static int getRandomNumber() {
        Random random = new Random();
        // Akan acak dari 0 sampai 6 lalu ditambah 1
        return random.nextInt(5) + 1;
    }
}
