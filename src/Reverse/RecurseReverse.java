package Reverse;

import Interfaces.IntArrayMethodInterface;

public class RecurseReverse implements IntArrayMethodInterface {
    public String methodName = "Recursive Reverse";
    private int[] output;

    public int[] reverse(int[] arr) {
        int arrayLength = arr.length;
        this.output = new int[arrayLength];
        return recursiveFunction(arr, arrayLength);
    }

    private int[] recursiveFunction(int[] arr, int arrayLength) {
        this.output[arrayLength - 1] = arr[(arr.length - arrayLength)];
        return arrayLength == 1 ? this.output : recursiveFunction(arr, arrayLength - 1);
    }

    public String name() { return this.methodName; }

    public int[] call(int[] param) { return reverse(param); }
}
