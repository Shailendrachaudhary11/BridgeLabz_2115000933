import java.util.*;

public class RotateList {

    public static  void rotate(List<Integer> list, int k) {
        if (list == null || list.isEmpty() || k == 0) {
            return;
        }

        int size = list.size();
        k = k % size;

        if (k < 0) {
            k += size;
        }

        reverse(list, 0, size - 1);

        reverse(list, 0, k - 1);

        reverse(list, k, size - 1);
    }

    private static  void reverse(List<Integer> list, int start, int end) {
        while (start < end) {
            int temp = list.get(start);
            list.set(start, list.get(end));
            list.set(end, temp);
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(10, 20, 30, 40, 50));
        int k = 2; // Rotate by 2 positions

        System.out.println("Original List: " + list);
        rotate(list, k);
        System.out.println("Rotated List: " + list);
    }
}