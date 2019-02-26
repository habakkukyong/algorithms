package Sort;

import Interfaces.IntArrayMethodInterface;

public class QuickSort implements IntArrayMethodInterface {
    public String methodName = "QuickSort";

    public int[] sort(int[] arr) {

        int[] arrCopy = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            arrCopy[i] = arr[i];
        }

        return arrCopy;
    }

    public String name() { return this.methodName; }

    public int[] call(int[] param) { return sort(param); }
}
