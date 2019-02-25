import org.apache.commons.lang3.time.StopWatch;

public class Main {

    public static void main(String[] args) {
        StopWatch stopwatch = new StopWatch();
        stopwatch.start();
        for (long i = 0; i < 10000000L; i++) {}
        stopwatch.stop();
        long timeElapsed = stopwatch.getTime();
        System.out.println("Execution time in milliseconds: " + timeElapsed);
    }
}
