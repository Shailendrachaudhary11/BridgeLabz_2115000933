import java.util.*;

public class FrequencyCounter {

    public static Map<String, Integer> countFrequency(List<String> list) {
        Map<String, Integer> frequencyMap = new HashMap<>();

        for (String element : list) {
            if (frequencyMap.containsKey(element)) {
                frequencyMap.put(element, frequencyMap.get(element) + 1);
            } else {
                frequencyMap.put(element, 1);
            }
        }

        return frequencyMap;
    }

    public static void main(String[] args) {
        List<String> inputList = Arrays.asList("apple", "banana", "apple", "orange");

        Map<String, Integer> frequencyMap = countFrequency(inputList);

        System.out.println(frequencyMap);
    }
}