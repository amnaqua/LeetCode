package main.java.org.example.Algorithms.Medium.Solved;

import main.java.org.example.Algorithms.Medium.ListNode;

import java.util.List;

public class RotateList {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k == 0) {
            return head;
        }

        ListNode save = head;
        int listSize = 1;

        while (save.next != null) {
            listSize++;
            save = save.next;
        }

        save.next = head;
        k = listSize - (k % listSize);

        while (k > 0) {
            save = save.next;
            k--;
        }
        head = save.next;
        save.next = null;
        return head;
    }
}
