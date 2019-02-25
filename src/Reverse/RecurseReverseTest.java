package Reverse;

import org.apache.commons.lang3.ArrayUtils;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RecurseReverseTest {

    @Test
    void reverse() {
        RecurseReverse r = new RecurseReverse();
        int[] arr = {1, 2, 3};
        int[] arrCopy = new int[arr.length];
        for (int i = 0; i < arr.length; i ++) {
            arrCopy[i] = arr[i];
        }
        ArrayUtils.reverse(arrCopy);
        for (int i = 0; i < arr.length; i ++){
            assertEquals(arrCopy[i], r.reverse(arr)[i]);
        }
    }
}