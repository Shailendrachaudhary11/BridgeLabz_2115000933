    import java.util.*;

    public class RemoveDuplicates {

        public static <T> List<T> removeDuplicates(List<T> list) {
            Set<T> set = new LinkedHashSet<>(list);

            return new ArrayList<>(set);
        }

        public static void main(String[] args) {
            List<Integer> inputList = Arrays.asList(3, 1, 2, 2, 3, 4);

            System.out.println("Original List: " + inputList);
            List<Integer> resultList = removeDuplicates(inputList);
            System.out.println("List after removing duplicates: " + resultList);
        }
    }