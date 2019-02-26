import CSVWriter.CSVWriter;
import Reverse.RecurseReverse;
import Reverse.ReverseInterface;
import Reverse.SwapReverse;
import org.apache.commons.lang3.time.StopWatch;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        int[] arr = new int[10000];
        for (int i = 1; i < 10000; i++) {
            arr[i] = i;
        }
//        int[] arr = {1, 2, 3};
//        String [] testString = { "1000 2000", "2000 5000" };

        SwapReverse timedSwaRev = new SwapReverse();
        timeBatteryOfIterationCounts(timedSwaRev, arr);
        CSVWriter csvw = new CSVWriter();
        String[] testTimes = timeBatteryOfIterationCounts(timedSwaRev, arr);
        csvw.write(testTimes);
//        SwapReverse timedSwaRev = new SwapReverse();
//        timeReverseMethod(10000,10000000, timedSwaRev, arr, "swap reverse", "short array");
//        ReverseInterface timedRecRev = new RecurseReverse();
//        timeReverseMethod(10000,10000000, timedRecRev, arr, "recursive reverse", "short array");
//        IntArrayMethodInterface timedMethod = new Shuffler();
//        timeShufflerMethodOnArray(10000, 10000000, timedMethod, arr, "shuffleIntArray", "short array");
    }

    private static void timeReverseMethod(int warmupIterations, int timedIterations, ReverseInterface timedMethod, int[] arr, String methodName, String inputDescription) {
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

    private static String[] timeBatteryOfIterationCounts(ReverseInterface timedMethod, int[] arr) {
        int[] itCountBattery = new int[20];
        String[] output = new String[20];
        StopWatch stopwatch = new StopWatch();
        long timeElapsed;

        for (int i = 1; i < 21; i++) {
            itCountBattery[i - 1] = i * 5000;
        }

        for (int i = 0; i < 20; i++) {
            stopwatch.start();
            for (int j = 0; j < itCountBattery[i]; j++){
                timedMethod.call(arr);
            }
            stopwatch.stop();
            timeElapsed = stopwatch.getTime();
            output[i] = (itCountBattery[i] + " " + timeElapsed);
            stopwatch.reset();
        }
        return output;
    }
}
