import java.util.Scanner;

import java.util.Arrays;

public class AnagramCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first string:");
        String str1 = scanner.nextLine();
        System.out.println("Enter second string:");
        String str2 = scanner.nextLine();

        if (str1.length() != str2.length()) {
            System.out.println("The strings are not anagrams.");
        } else {
            char[] arr1 = str1.toCharArray();
            char[] arr2 = str2.toCharArray();

            Arrays.sort(arr1);
            Arrays.sort(arr2);

            if (Arrays.equals(arr1, arr2)) {
                System.out.println("The strings are anagrams.");
            } else {
                System.out.println("The strings are not anagrams.");
            }
        }
    }
}
