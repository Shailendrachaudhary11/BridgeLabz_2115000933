// Find the Nth Element from the End
// Given a singly linked list (use LinkedList), find the Nth element from the end without calculating its size.
// Example:
// Input: [A, B, C, D, E], N=2 → Output: D.

import java.util.LinkedList;
import java.util.ListIterator;

public class NthElementInLinkedList {
    public static char findNthElement(LinkedList<Character> list, int N){
        ListIterator<Character> slow = list.listIterator();
        ListIterator<Character> fast = list.listIterator();
        for(int i=0;i<N;i++){
            fast.next();
        }
        while(fast.hasNext()){
            fast.next();
            slow.next();
        }
        return slow.next();
    }

    public static void main(String[] args) {
        LinkedList<Character> linkedList = new LinkedList<>();
        linkedList.add('A');
        linkedList.add('B');
        linkedList.add('C');
        linkedList.add('D');
        linkedList.add('E');
        int N = 3;
        System.out.println(findNthElement(linkedList, N));
    }
}
