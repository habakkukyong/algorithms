import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class ShufflerTest {

    private static boolean contains(int[] array, int integer) {
        for (int i = 0; i < array.length; i++) {
            if (integer == array[i]) {
                return true;
            }
        }
        return false;
    }

    @Test
    void shuffleIntArray() {
        Shuffler shuffler = new Shuffler();

        // Method returns array containing all elements in the array passed in
        int[] arr = {1, 2, 3};
        int [] shuffled_array = shuffler.shuffleIntArray(arr);
        for (int i = 0; i < arr.length; i++) {
            assertTrue(this.contains(shuffled_array, arr[i]));
        }

        // Method changes the order of the elements every time it runs
        assertFalse(Arrays.equals(arr, shuffled_array));

        // Method moves exactly two elements every time it runs
        int changes = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != shuffled_array[i]) {
                changes += 1;
            }
        }
        assertEquals(2, changes);
    }
}