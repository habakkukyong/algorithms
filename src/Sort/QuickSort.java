package Sort;

import Interfaces.IntArrayMethodInterface;

public class QuickSort implements IntArrayMethodInterface {
    public String methodName = "QuickSort";
    public int[] output;
    private int sortedItems = 0;

    public int[] sort(int[] arr) {

        output = new int[arr.length];

        recursion(arr, output);

        sortedItems = 0;

        return output;
    }

    // Bifurcates array about pivot, adds arrays to output if sorted, calls itself and carries on if they're not
    private void recursion(int[] array, int[] output){
        int[][] bifurcatedArray = this.bifurcate(array);
        int[] low = bifurcatedArray[0];
        int[] high = bifurcatedArray[1];

        if (this.isSorted(low)) {
            for (int i = 0; i < low.length; i++) {
                output[sortedItems] = low[i];
                sortedItems++;
            }
        }
        else { recursion(low, output); }

        if (this.isSorted(high)) {
            for (int i = 0; i < high.length; i++) {
                output[sortedItems] = high[i];
                sortedItems++;
            }
        }
        else { recursion(high, output); }
    }

    // Takes an array, determines the pivot, outputs a 2d array containing the lower values in the first sub-array
    public int[][] bifurcate(int[] arr) {
        int[][] output;
        int[] low;
        int[] high;
        int lowLength = 0;
        int highLength = 0;
        String lowStringCSV = "";
        String highStringCSV = "";
        int pivot = this.pivot(arr);

        // Place in low or high csv string depending on comparison against pivot
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] <= pivot) { lowStringCSV += arr[i] + ","; lowLength += 1; }
            else { highStringCSV += arr[i] + ","; highLength += 1; }
        }
        if (arr[arr.length - 1] <= pivot) { lowStringCSV += arr[arr.length - 1]; lowLength += 1; }
        else { highStringCSV += arr[arr.length - 1]; highLength += 1; }

        // Give low and high arrays their values
        low = new int[lowLength];
        high = new int[highLength];
        for (int i = 0; i < lowStringCSV.split(",").length; i++) {
            low[i] = Integer.parseInt(lowStringCSV.split(",")[i]);
        }
        for (int i = 0; i < highStringCSV.split(",").length; i++) {
            high[i] = Integer.parseInt(highStringCSV.split(",")[i]);
        }

        // Return array of two arrays, first of which contains values lower than pivot
        output = new int[][] { low, high };
        return output;
    }

    // Predicate given array determines quickly if already sorted
    private boolean isSorted(int[] arr) {
        boolean sorted = true;
        if (arr.length > 1) {
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr [i + 1]) {
                    sorted = false;
                }
            }
        }
        return sorted;
    }

    // Pick the pivot value using Hoare's partition scheme
    private int pivot(int[] arr) {
        int[] pivotCandidates = { arr[0], arr[arr.length / 2], arr[arr.length - 1] };
        return shortSort(pivotCandidates)[1];
    }

    // Is bubblesort
    private int[] shortSort(int [] arr) {
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

    // Interface methods
    public String name() { return this.methodName; }

    public int[] call(int[] param) { return sort(param); }
}
