package Reverse;

public class ForReverse implements ReverseInterface {
    public static int[] reverse(int[] arr) {
        return arr;
    }

    public int[] call(int[] param) {
        return reverse(param);
    }
}
