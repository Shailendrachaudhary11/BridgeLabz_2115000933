public class PeakElementBinarySearch {

    // Method to find a peak element index
    public static int findPeakElement(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            if(arr[mid] > arr[mid - 1] && arr[mid] > arr[mid + 1])  {
               return mid;
            } else if(arr[mid] < arr[mid - 1]){
                right=mid-1;
            }else left=mid+1;
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 3, 20, 4, 1, 0};
        System.out.println("Peak Element Index: " + findPeakElement(arr1));

    }
}
