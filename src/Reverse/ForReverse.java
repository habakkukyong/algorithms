package Reverse;

import Interfaces.IntArrayMethodInterface;

public class ForReverse implements IntArrayMethodInterface {
    public String methodName = "For Loop Reverse";

    public static int[] reverse(int[] arr) {
        int[] output = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            output[i] = arr.length - (i);
        }
        return output;
    }

    public String name() { return this.methodName; }

    public int[] call(int[] param) { return reverse(param); }
}
