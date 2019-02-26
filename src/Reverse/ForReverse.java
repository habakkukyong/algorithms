package Reverse;

public class ForReverse implements ReverseInterface {
    public static int[] reverse(int[] arr) {
        int[] output = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            output[i] = arr.length - (i);
        }
        return output;
    }

    public int[] call(int[] param) {
        return reverse(param);
    }
}
