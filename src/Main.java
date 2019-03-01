import CSVWriter.CSVWriter;
import Interfaces.IntArrayMethodInterface;
import Reverse.ForReverse;
import Reverse.SwapReverse;
import Sort.BubbleSort;
import Sort.JavaUtilsSort;
import Sort.QuickSort;
import org.apache.commons.lang3.time.StopWatch;

public class Main {

    public static void main(String[] args) {

        int[] arr = new int[10000];
        for (int i = 1; i < 10000; i++) {
            arr[i] = arr.length - (i - 1);
        }

        int[] shortArr = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};

        // Add test method here replacing *** with the method you wish to test
        // IntArrayMethodInterface timedMethod = new ***();
        IntArrayMethodInterface timedMethod = new JavaUtilsSort();

        timeBatteryOfIterationCounts(timedMethod, shortArr);
        CSVWriter csvw = new CSVWriter();
        String[] testTimes = timeBatteryOfIterationCounts(timedMethod, shortArr);

        // Change method input description here replacing *** with  a description of the input variable
        // csvw.write(testTimes, timedMethod.name(), "***");
        csvw.write(testTimes, timedMethod.name(), "Short Reversed Int Array");
    }

    private static void timeReverseMethod(int warmupIterations, int timedIterations, IntArrayMethodInterface timedMethod, int[] arr, String methodName, String inputDescription) {
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

    private static String[] timeBatteryOfIterationCounts(IntArrayMethodInterface timedMethod, int[] arr) {
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
