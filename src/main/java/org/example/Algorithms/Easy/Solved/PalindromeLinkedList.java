package main.java.org.example.Algorithms.Easy.Solved;

import main.java.org.example.Algorithms.Easy.ListNode;

public class PalindromeLinkedList {
    public boolean isPalindrome(ListNode head) {
        ListNode save = head;
        int listSize = 0;

        while (head != null) {
            head = head.next;
            listSize++;
        }
        head = save;
        int[] arr = new int[listSize];
        for (int i = 0; i < listSize; i++) {
            arr[i] = head.val;
            head = head.next;
        }
        for (int i = 0, j = listSize - 1; i < j; i++, j--) {
            if (arr[i] != arr[j]) {
                return false;
            }
        }
        return true;
    }
}

