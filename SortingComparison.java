import java.util.Arrays;

public class SortingComparison {
    private static void bubbleSort(int[] data){
        for(int i=0;i<data.length;i++){
            for(int j=i+1;j<data.length;j++){
                if(data[i]>data[j]){
                    int temp=data[i];
                    data[i]=data[j];
                    data[j]=temp;
                }
            }
        }
    }
    private static void mergeSort(int[] arr){
        if (arr.length <= 1) return;

        int mid = arr.length / 2;
        int[] left = Arrays.copyOfRange(arr, 0, mid);
        int[] right = Arrays.copyOfRange(arr, mid, arr.length);

        mergeSort(left);
        mergeSort(right);

        merge(arr, left, right);
    }
    private static void merge(int[] arr, int[] left, int[] right) {
        int i = 0, j = 0, k = 0;
        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                arr[k++] = left[i++];
            } else {
                arr[k++] = right[j++];
            }
        }

        while (i < left.length) arr[k++] = left[i++];
        while (j < right.length) arr[k++] = right[j++];
    }
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(arr, low, high);
            quickSort(arr, low, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, high);
        }
    }
    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                i++;
                // Swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        // Swap arr[i + 1] and arr[high] (pivot)
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }
    private static void compareSortingMethod(int[] data){
        long startTime=System.nanoTime();
        bubbleSort(data);
        long endTime=System.nanoTime();
        long timeBubbleSort=endTime-startTime;

        startTime=System.nanoTime();
        mergeSort(data);
        endTime=System.nanoTime();
        long timeMergeSort=endTime-startTime;

        startTime=System.nanoTime();
        quickSort(data,0, data.length-1);
        endTime=System.nanoTime();
        long timeQuickSort=endTime-startTime;

        System.out.println("Data Size: "+data.length+" ,Bubble Sorting Time: "+(timeBubbleSort/1000000.0)+" , " +
                "Merge Sorting Time: "+(timeMergeSort/100000.0)+" and Quick Sorting Time: "+(timeQuickSort/100000.0));
    }
    public static void main(String[] args) {
        int[] dataSet1 = new int[1000];
        int[] dataSet2 = new int[10000];
        //int[] dataSet3 = new int[100000];
        // fill arrays
        for (int i = 0; i < 1000; i++) dataSet1[i] = (int) (Math.random() * 1000);
        for (int i = 0; i < 10000; i++) dataSet2[i] = (int) (Math.random() * 10000);
       // for (int i = 0; i < 100000; i++) dataSet3[i] = (int) (Math.random() * 100000);


        compareSortingMethod(dataSet1);
        compareSortingMethod(dataSet2);
      //  compareSortingMethod(dataSet3);
    }
}
