

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    private static final int DATA_SOURCES = 4;
    private static final int THREAD_POOLS = 3;
    private static int successLoadData = 0;
    private static int failedLoadData = 0;
    private static boolean isFinished = false;
    static int executionTime = TaskTimeHelper.num();


    public static void main(String[] args) {
        System.out.println(String.format("Start load %d Data", DATA_SOURCES));

        ExecutorService executor = Executors.newFixedThreadPool(THREAD_POOLS);

        for (int i = 0; i < DATA_SOURCES; i++) {
            executor.execute(() -> {
                try {
                    Thread.sleep(executionTime * 1000);
                    if (executionTime > 4) {
                        System.out.println("Request Timeout");
                        incrementFailedLoadData();
                    } else {
                        incrementSuccessLoadData();
                    }
                } catch (InterruptedException e) {
                    System.out.println(e);
                }

                checkDataLoadingStatus();
            });
        }

        executor.shutdown();

        int loadingTime = 1;
        while (true) {
            if (isFinished) {
                System.out.println("\nTask Finished.");
                System.out.println(String.format("Time Execution : %ds", loadingTime - 1));
                if (successLoadData == DATA_SOURCES) {
                    System.out.println("All data is successfully loaded");
                    break;
                } else {
                    System.out.println(String.format("%d Data Successfully loaded & %d Data Failed to load",
                            successLoadData, failedLoadData));
                    break;
                }
            } else {
                System.out.println(String.format("Loading... (%ds)", loadingTime));
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            loadingTime++;
        }
    }

    public static synchronized void incrementSuccessLoadData() {
        successLoadData++;
    }

    public static synchronized void incrementFailedLoadData() {
        failedLoadData++;
    }

    public static synchronized void checkDataLoadingStatus() {
        if (successLoadData + failedLoadData == DATA_SOURCES) {
            isFinished = true;
        }
    }
}
