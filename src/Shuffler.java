import Interfaces.IntArrayMethodInterface;

import java.util.HashMap;
import java.util.concurrent.ThreadLocalRandom;

public class Shuffler implements IntArrayMethodInterface {
    public String methodName = "Shuffler";

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

    public String name() { return this.methodName; }

    public int[] call(int[] param) {
        return shuffleIntArray(param);
    }

    // Take a hash of integers
    // Outputs a hash map identical to the input except that two randomly selected keys have their values swapped
    public HashMap<Integer, Integer> shuffleHashMap(HashMap<Integer, Integer> hash) {
        int firstKey = ThreadLocalRandom.current().nextInt(0, hash.keySet().size());
        int secondKey;
        do {
            secondKey = ThreadLocalRandom.current().nextInt(0, hash.keySet().size());
        }
        while (secondKey == firstKey);

        // Switch keys around if first is greater
        if (firstKey > secondKey) {
            int temp = firstKey;
            firstKey = secondKey;
            secondKey = temp;
        }

        // Declare output hashmap and give it length equal to that of input array
        HashMap<Integer, Integer> output = new HashMap<>();

        // Assign values of input array to values of output array switching values of first and second random indices
        for (int i = 0; i < firstKey; i++) {
            output.put(i, hash.get(i));
        }
        output.put(firstKey, hash.get(secondKey));
        for (int i = firstKey + 1; i < secondKey; i++) {
            output.put(i, hash.get(i));
        }
        output.put(secondKey, hash.get(firstKey));
        for (int i = secondKey + 1; i < hash.size(); i++) {
            output.put(i, hash.get(i));
        }

        return output;
    }
}
