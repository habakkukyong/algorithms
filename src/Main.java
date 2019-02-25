import org.apache.commons.lang3.time.StopWatch;

import java.lang.reflect.Method;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        //timeIntShufflerManyIterations();
        //timeIntShufflerLongArray();
        //timeHashShufflerManyIterations();
        IntArrayMethodInterface timedMethod = new Shuffler();
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        timeShufflerMethodOnArray(1, 1000000, timedMethod, arr, "shuffleIntArray", "short array");
    }

    //IntArrayMethodInterface timedMethod = new Shuffler();

    private static void timeShufflerMethodOnArray(int warmupIterations, int timedIterations, IntArrayMethodInterface timedMethod, int[] arr, String methodName, String inputDescription) {
        StopWatch stopwatch = new StopWatch();

        // Warm-up iterations
        for (int i = 0; i < warmupIterations; i++) {
            timedMethod.call(arr);
        }

        stopwatch.start();

        // Timed iterations
        for (int i = 0; i < timedIterations; i++) {
            timedMethod.call(arr);
        }

        stopwatch.stop();
        long timeElapsed = stopwatch.getTime();

        System.out.println("Running " + methodName + " on " + inputDescription + " " + timedIterations + " times");
        System.out.println("Execution time in milliseconds: " + timeElapsed);
    }

    private static void timeIntShufflerManyIterations() {
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
        System.out.println("Running shuffleIntArray on short array many times");
        System.out.println("Execution time in milliseconds: " + timeElapsed);
    }

    private static void timeIntShufflerLongArray () {
        StopWatch stopwatch = new StopWatch();

        // Pre-requisites for code which is to be timed
        Shuffler shuffler = new Shuffler();
        int arrayLength = 10000;
        int[] arr = new int[arrayLength];
        for (int i = 0; i < arrayLength; i++) { arr[i] = i; }

        // Warm-up iterations
        for (int i = 0; i < 100000; i++) {
        shuffler.shuffleIntArray(arr);
        }

        stopwatch.start();

        // Run code being timed here
        for (int i = 0; i < 100000; i++) {
            shuffler.shuffleIntArray(arr);
        }

        stopwatch.stop();
        long timeElapsed = stopwatch.getTime();
        System.out.println("Running shuffleIntArray on long array");
        System.out.println("Execution time in milliseconds: " + timeElapsed);
    }

    private static void timeHashShufflerManyIterations() {
        StopWatch stopwatch = new StopWatch();

        // Pre-requisites for code which is to be timed
        Shuffler shuffler = new Shuffler();
        HashMap<Integer, Integer> hash = new HashMap<>();
        for (int i = 0; i < 10; i++) {
            hash.put(i, i + 1);
        }

        // Warm-up iterations
        for (int i = 0; i < 10000; i++) {
            shuffler.shuffleHashMap(hash);
        }

        stopwatch.start();

        // Run code being timed here
        for (int i = 0; i < 10000000; i++) {
            shuffler.shuffleHashMap(hash);
        }

        stopwatch.stop();
        long timeElapsed = stopwatch.getTime();
        HashMap<Integer, Integer> jim = shuffler.shuffleHashMap(hash);
        System.out.println("Running shuffleHashMap on short hash many times");
        System.out.println("Execution time in milliseconds: " + timeElapsed);
    }
}
