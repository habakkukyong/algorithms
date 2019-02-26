package Reverse;

import Interfaces.IntArrayMethodInterface;

public class SwapReverse implements IntArrayMethodInterface {

    public static int[] reverse(int[] arr) {

        int[] arrCopy = new int[arr.length];

        for (int i = 0; i < arr.length / 2; i ++) {

            int temp = arr[i];

            arrCopy[i] = arr[arr.length - (i + 1)];

            arrCopy[arr.length - (i + 1)] = temp;

            if (arr.length % 2 == 1) { arrCopy[arr.length / 2] = arr[arr.length / 2]; }
        }

        return arrCopy;
    }

    public int[] call(int[] param) {
        return reverse(param);
    }
}
