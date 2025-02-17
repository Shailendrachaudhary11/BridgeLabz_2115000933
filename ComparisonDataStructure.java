import java.util.HashSet;
import java.util.TreeSet;

public class ComparisonDataStructure {
    // linearserach
    private static  boolean linearSearch(int[] arr,int target){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target) return true;
        }
        return false;
    }
    // hashset serach
    private static boolean hashSetSearch(HashSet<Integer> h,int target){
        return h.contains(target);
    }
    // treeset search
    private static boolean treeSetSearch(TreeSet<Integer> t,int target){
        return t.contains(target);
    }
    private static void comparsionDataStructure(int N){
        int[] arr=new int[N];
        for(int i=1;i<N;i++) arr[i]=i;


        HashSet<Integer> hashset=new HashSet<>();
        for(int i=0;i<N;i++) hashset.add(i);

        TreeSet<Integer> treeset=new TreeSet<>();
        for(int i=0;i<N;i++) treeset.add(i);

        int target=N-1; // serach last elements

        long startTime=System.nanoTime();
        linearSearch(arr,target);
        long endTime=System.nanoTime();
        long linearTime=endTime-startTime;

         startTime=System.nanoTime();
        hashSetSearch(hashset,target);
         endTime=System.nanoTime();
        long HashSetTime=endTime-startTime;

         startTime=System.nanoTime();
        treeSetSearch(treeset,target);
         endTime=System.nanoTime();
        long treeSetTime=endTime-startTime;

        System.out.println("DataSize: "+N+" ,linear serach time: "+(linearTime/1000000.0)+" , hashset time: "+(HashSetTime/1000000.0)
                +" and TreeSet time: "+(treeSetTime/1000000.0));

    }
    public static void main(String[] args) {
        comparsionDataStructure(1000);
        comparsionDataStructure(10000);
        comparsionDataStructure(100000);
    }
}
