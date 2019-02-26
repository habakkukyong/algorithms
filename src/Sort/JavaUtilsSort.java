package Sort;

import Interfaces.IntArrayMethodInterface;

import java.util.Arrays;

public class JavaUtilsSort implements IntArrayMethodInterface {

    public static int[] sort(int[] arr) {

        int[] arrCopy = new int[arr.length];

        for (int i = 0; i < arr.length; i ++) {
            arrCopy[i] = arr[i];
        }

        Arrays.sort(arrCopy);

        return arrCopy;
    }

    public int[] call(int[] param) {
        return sort(param);
    }
}

