package main.java.org.example.Algorithms.Medium.Solved;

import java.util.Random;

public class LinkedListRandomNode {
    private ListNode head = new ListNode();
    private Random random = new Random();

    public void Solution(ListNode head) {
        this.head = head;
        random = new Random();
    }

    public int getRandom() {
        int count = 0;
        int res = 0;
        ListNode save = head;

        while (save != null) {
            count++;
            if (random.nextInt(count) == 0) {
                res = save.val;
            }
            save = save.next;
        }
        return res;
    }
}

