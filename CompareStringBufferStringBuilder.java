public class CompareStringBufferStringBuilder {
    public static void main(String[] args) {
        int iterations = 1000000;

        StringBuffer sbuffer = new StringBuffer();
        long startTimeBuffer = System.nanoTime();  // Start time for StringBuffer
        for (int i = 0; i < iterations; i++) {
            sbuffer.append("hello");
        }
        long endTimeBuffer = System.nanoTime();  // End time for StringBuffer
        long durationBuffer = endTimeBuffer - startTimeBuffer;
        System.out.println("Time taken by StringBuffer: " + durationBuffer / 1_000_000 + " ms");

        StringBuilder sbuilder = new StringBuilder();
        long startTimeBuilder = System.nanoTime();
        for (int i = 0; i < iterations; i++) {
            sbuilder.append("hello");
        }
        long endTimeBuilder = System.nanoTime();
        long durationBuilder = endTimeBuilder - startTimeBuilder;
        System.out.println("Time taken by StringBuilder: " + durationBuilder / 1_000_000 + " ms");
    }
}
