import java.util.Arrays;

public class CountingSort {
    public static void countingSort(int[] arr, int max) {
        int[] count = new int[max + 1];
        int[] output = new int[arr.length];

        for (int num : arr) count[num]++;
        for (int i = 1; i <= max; i++) count[i] += count[i - 1];
        for (int i = arr.length - 1; i >= 0; i--) output[--count[arr[i]]] = arr[i];

        System.arraycopy(output, 0, arr, 0, arr.length);
    }

    public static void main(String[] args) {
        int[] ages = {12, 15, 10, 18, 14, 11};
        countingSort(ages, 18);
        System.out.println("Sorted Ages: " + Arrays.toString(ages));
    }
}
