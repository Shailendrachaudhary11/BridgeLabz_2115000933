import java.util.Random;

public class RandomValues {
    public int[] generate4DigitRandomArray(int size) {
        int[] randomNumbers = new int[size];
        Random random = new Random();

        for (int i = 0; i < size; i++) {
            randomNumbers[i] = 1000 + random.nextInt(9000);
        }

        return randomNumbers;
    }

    public double[] findAverageMinMax(int[] numbers) {
        int min = numbers[0];
        int max = numbers[0];
        int sum = 0;

        for (int number : numbers) {
            sum += number;
            min = Math.min(min, number);
            max = Math.max(max, number);
        }

        double average = (double) sum / numbers.length;
        return new double[]{average, min, max};
    }

    public static void main(String[] args) {
        RandomValues rv = new RandomValues();

        int size = 5;
        int[] randomNumbers = rv.generate4DigitRandomArray(size);

        System.out.println("Generated random numbers:");
        for (int num : randomNumbers) {
            System.out.println(num);
        }

        double[] results = rv.findAverageMinMax(randomNumbers);

        System.out.println("\nResults:");
        System.out.println("Average: " + results[0]);
        System.out.println("Minimum: " + results[1]);
        System.out.println("Maximum: " + results[2]);
    }
}