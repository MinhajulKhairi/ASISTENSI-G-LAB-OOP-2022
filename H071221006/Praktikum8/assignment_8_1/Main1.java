import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main1 {
    //inisialisasi variabel
    private static int dataLoadedCount = 0;
    private static int dataFailedCount = 0;
    private static boolean isSuccess;
    private static long startTime;
    private static int data = 4;
    private static long time;

    public static void main(String[] args) {
        int backgroundThreads = 3;
        int uiThreads = 1;
        ExecutorService executorForBackgroundThread = Executors.newFixedThreadPool(backgroundThreads);  // executor untuk mengatur 2 jenis thread yang berbeda
        ExecutorService executorForUIThread = Executors.newFixedThreadPool(uiThreads);

        startTime = System.currentTimeMillis();

        System.out.println("Start load " + data + " Data" ); //menampilkan pesan start load 


        //menjalankan UI Thread
        executorForUIThread.execute(new Runnable() {
            public void run() {
                // jika true, akan terus looping sambil memeriksa apakah proses pengambilan data sudah selesai. 
                while (true){
                    time = (System.currentTimeMillis() - startTime) / 1000;
                    if (time > 0){
                        if (dataLoadedCount + dataFailedCount != data){
                            System.out.println("Loading... (" + time + "s)");
                        } else if (dataLoadedCount + dataFailedCount == data){
                            System.out.println("Loading... (" + time + "s)");
                            break;
                        }
                    }
                    // UI thread akan tidur selama 1 detik menggunakan Thread.sleep(1000) setiap kali iterasi loop.
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                if (dataLoadedCount + dataFailedCount == data) { // TO DO LIST (tambah timesleep)
                    if (dataFailedCount > 0){
                        System.out.println();
                        System.out.println("Task Finish.");
                        System.out.println("Time Execution : " + time + "s");
                        System.out.println(dataLoadedCount + " Data Succesfully loaded & " + dataFailedCount + " Data failed to load");
                    } else {
                        System.out.println();
                        System.out.println("Task Finish.");
                        System.out.println("Time Execution : " + time + "s");
                        System.out.println("All data is successfully loaded");
                    }
                }
            }
        });

        // mengeksekusi thread kedua sebanyakmjumlah data yang ditentukan
        for (int i = 0; i < data; i++){
            executorForBackgroundThread.execute(new Runnable() {
                public void run() {
                    int executionTime = TaskTimeHelper.getRandomExecutionTime();
                    try {
                        // jika waktu eksekusi lebih dari 4 detik, akan menampilkan request timeout dan menganggap proses gagal
                        if (executionTime > 4){
                            Thread.sleep(5100);
                            System.out.println("Request Timeout");
                            isSuccess = false;
                        } else {
                            // menunggu waktu acak antara 1 sampai 6 detik
                            Thread.sleep(executionTime * 1000);
                            // jika waktu eksekusi  kurang dari 4 detik, maka proses berhasil
                            isSuccess = true;
                        }
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    if (isSuccess) {
                        synchronized (Main.class){
                            dataLoadedCount++;  
                        }
                    } else {
                        synchronized (Main.class){
                            dataFailedCount++;  
                        }
                    }
                }
            });
        }
        // setelah semua backgroundThread berhasil, program akan mematikan kedua executor 
        executorForBackgroundThread.shutdown();
        executorForUIThread.shutdown();
    }

class TaskTimeHelper {
    private static final int minExTime = 1; // nilai eksekusi minimum 1 detik
    private static final int maxExTime = 6; // nilai eksekusi maksmial 6 detik
    private static final Random random = new Random(); // method random untuk menghasilkan angka acak

    // method untuk mengembalikan waktu eksekusi acak antara rentang minExTime dan maxExTime
    public static int getRandomExecutionTime() { 
        // untuk menentukan waktu eksekusi
        return random.nextInt(maxExTime - minExTime + 1) + minExTime;
    }
}
}
