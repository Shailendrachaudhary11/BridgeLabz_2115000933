public class RecursiveVSIterativeFibonacce {
    private static int recursive(int N){
        if(N<=1) return 1;
        return recursive(N-1)+recursive(N-2);
    }
    private static int iterative(int N){
        int a = 0, b = 1, sum;
        for (int i = 2; i <= N; i++) {
            sum = a + b;
            a = b;
            b = sum;
        }
        return b;

    }
    private static  void compareRecursiveAndIterative(int N){
        long startTime=System.nanoTime();
        recursive(N);
        long endTime=System.nanoTime();
        long recursiveTime=endTime-startTime;

         startTime=System.nanoTime();
        iterative(N);
         endTime=System.nanoTime();
        long iterativeTime=endTime-startTime;
        System.out.println("DataSet size: "+N+" ,recursive fibonacci time: "+(recursiveTime/1000000.0)+" and iterative time: "+(iterativeTime/1000000.0));
        System.out.println();
    }
    public static void main(String[] args) {
        compareRecursiveAndIterative(10);
        compareRecursiveAndIterative(30);
        compareRecursiveAndIterative(50);
    }
}
