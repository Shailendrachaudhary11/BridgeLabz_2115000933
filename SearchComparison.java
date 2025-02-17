import java.lang.reflect.Array;
import java.util.Arrays;

public class SearchComparison {
    private static int linearSearch(int[] data,int target){
        for(int i=0;i<data.length;i++){
            if(data[i]==target){
                return i;
            }
        }
        return -1;
    }
    private static int binarySearch(int[] data,int target){
        int start=0,end=data.length-1;
        while(start<end){
            int mid=(start+end)/2;
            if(data[mid]==target) return mid;
            else if(data[mid]<target) start=mid+1;
            else end=mid-1;
        }
        return -1;
    }
    private static void compareSerachMethod(int[] data,int target){
        long startTime=System.nanoTime();
        linearSearch(data,target);
        long endTime=System.nanoTime();
        long linearTime=endTime-startTime;

        Arrays.sort(data);

        startTime=System.nanoTime();
        binarySearch(data,target);
        endTime=System.nanoTime();
        long binaryTime=endTime-startTime;

        System.out.println("Data Set size: "+data.length+" , LinearTime: "+(linearTime/1000000)+" and BinaryTime: "+binaryTime/1000000);
        System.out.println();
    }
    public static void main(String[] args) {
        int[] dataSet1=new int[1000];
        int[] dataSet2=new int[10000];
        int[] dataSet3=new int[100000];
        // fill arrays
        for(int i=0;i<1000;i++) dataSet1[i]=i+1;
        for(int i=0;i<10000;i++) dataSet2[i]=i+1;
        for(int i=0;i<100000;i++) dataSet3[i]=i+1;

        int target=600; // this is target
        compareSerachMethod(dataSet1,target);
        compareSerachMethod(dataSet2,target);
        compareSerachMethod(dataSet3,target);
    }
}
