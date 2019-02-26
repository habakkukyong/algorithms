package Sort;

import Interfaces.IntArrayMethodInterface;

public class BubbleSort implements IntArrayMethodInterface {
    public static int[] sort(int[] arr) {
        int[] arrCopy = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            arrCopy[i] = arr[i];
        }

        boolean changeFlag = true;
        while (changeFlag) {
            changeFlag = false;
            for (int i = 0; i < arr.length - 1; i++) {
                if (arrCopy[i] > arrCopy[i + 1]) {
                    int temp = arrCopy[i];
                    arrCopy[i] = arrCopy[i + 1];
                    arrCopy[i + 1] = temp;
                    changeFlag = true;
                }
            }
        }
        return arrCopy;
    }

    public int[] call(int[] param) {
        return sort(param);
    }
}
