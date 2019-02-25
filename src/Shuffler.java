import java.util.concurrent.ThreadLocalRandom;

public class Shuffler {

    // Takes an array of integers
    // Outputs an array identical to the input except that two randomly selected elements are switched around
    public int[] shuffleIntArray(int[] arr) {
        int firstIndex = ThreadLocalRandom.current().nextInt(0, arr.length);
        int secondIndex;
        do {
            secondIndex = ThreadLocalRandom.current().nextInt(0, arr.length);
        }
        while (secondIndex == firstIndex);

        // Switch indices around if first is greater
        if (firstIndex > secondIndex) {
            int temp = firstIndex;
            firstIndex = secondIndex;
            secondIndex = temp;
        }

        // Declare output array and give it length equal to input array
        int[] output = new int[arr.length];

        // Assign values of input array to values of output array switching values of first and second random indices
        for (int i = 0; i < firstIndex; i++) {
            output[i] = arr[i];
        }
        output[firstIndex] = arr[secondIndex];
        for (int i = firstIndex + 1; i < secondIndex; i++) {
            output[i] = arr[i];
        }
        output[secondIndex] = arr[firstIndex];
        for (int i = secondIndex + 1; i < arr.length; i++) {
            output[i] = arr[i];
        }

        return output;
    }
}
