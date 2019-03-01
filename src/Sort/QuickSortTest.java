package Sort;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QuickSortTest {

    @Test
    void sort() {
        QuickSort qs = new QuickSort();
        int[] arr = {5, 3, 4, 1, 2};
        int[] sArr = {1, 2, 3, 4, 5};

        /*/ Bifurcate works - temporarily make public
        int[] low = {3, 4, 1, 2};
        int[] high = {5};
        for (int i = 0; i < qs.bifurcate(arr)[0].length; i++) {
            assertEquals(low[i], qs.bifurcate(arr)[0][i]);
        }
        for (int i = 0; i < qs.bifurcate(arr)[1].length; i++) {
            assertEquals(high[i], qs.bifurcate(arr)[1][i]);
        }*/

        // Quicksort works
        int[] qSArr = qs.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            assertEquals(sArr[i], qSArr[i]);
        }
    }
}