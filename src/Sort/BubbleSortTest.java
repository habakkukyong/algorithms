package Sort;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BubbleSortTest {

    @Test
    void sort() {
        BubbleSort bs = new BubbleSort();
        int[] arr = {5, 3, 4, 1, 2};
        int[] sArr = {1, 2, 3, 4, 5};
        for (int i = 0; i < arr.length; i++) {
            assertEquals(sArr[i], bs.sort(arr)[i]);
        }
    }
}