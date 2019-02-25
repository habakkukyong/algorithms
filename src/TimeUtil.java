// https://www.techiedelight.com/measure-elapsed-time-execution-time-java/

import org.apache.commons.lang3.time.StopWatch;

import java.util.concurrent.TimeUnit;

// Program to measure elapsed time in Java
class TimeUtil {
    public static void main(String[] args) throws InterruptedException {

        StopWatch stopwatch = new StopWatch();
        stopwatch.start();

        /* ... the code being measured starts ... */

        // sleep for 5 seconds
        TimeUnit.SECONDS.sleep(5);

        /* ... the code being measured ends ... */

        stopwatch.stop();	// Optional

        long timeElapsed = stopwatch.getTime();

        System.out.println("Execution time in milliseconds: " + timeElapsed);

    }
}
