import org.apache.commons.lang3.time.StopWatch;

public class Main {

    public static void main(String[] args) {
        StopWatch stopwatch = new StopWatch();

        // Pre-requisites for code which is to be timed
        Shuffler shuffler = new Shuffler();
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        // Warm-up iterations
        for (int i = 0; i < 10000; i++) {
            shuffler.shuffleIntArray(arr);
        }

        stopwatch.start();

        // Run code being timed here
        for (int i = 0; i < 10000000; i++) {
            shuffler.shuffleIntArray(arr);
        }

        stopwatch.stop();
        long timeElapsed = stopwatch.getTime();
        System.out.println("Execution time in milliseconds: " + timeElapsed);
    }
}
