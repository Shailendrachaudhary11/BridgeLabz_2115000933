public class ConcatenationString {
    private static void usingString(int N){
        String res=" ";
        for(int i=0;i<N;i++) res+='a';
    }

    private static void usingStringBuilder(int N){
        StringBuilder str=new StringBuilder();
        for(int i=0;i<N;i++){
            str.append('a');
        }
    }

    private static void usingStringBuffer(int N){
        StringBuffer str=new StringBuffer();
        for(int i=0;i<N;i++){
            str.append('a');
        }
    }
    private static void compareStringConcatentaion(int N){
        long startTime=System.nanoTime();
        usingString(N);
        long endTime=System.nanoTime();
        long timeString=endTime-startTime;

        startTime=System.nanoTime();
        usingStringBuilder(N);
        endTime=System.nanoTime();
        long timeStringBuilder=endTime-startTime;

        startTime=System.nanoTime();
        usingStringBuffer(N);
        endTime=System.nanoTime();
        long timeStringBuffer=endTime-startTime;

        System.out.println("String Concatentaion using String:  "+(timeString/1000000.0)+" , using string builder: "+(timeStringBuilder/1000000.0)+" and " +
                " using string buffer: "+(timeStringBuffer/1000000.0));
    }
    public static void main(String[] args) {
        compareStringConcatentaion(1000);
        compareStringConcatentaion(10000);
        compareStringConcatentaion(100000);
    }
}
