public class FirstNegativeFinder {


    public static int findFirstNegative(int[] arr) {

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] < 0) {
                return i;
            }
        }
        return -1;
    }

    // Main method to test the function
    public static void main(String[] args) {
        int[] array1 = {4, 2, -3, 6, -1, 5};
        System.out.println("Index of first negative: " + findFirstNegative(array1));

    }
}
